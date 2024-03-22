import random
import math
import networkx as nx
import numpy as np
import matplotlib.pyplot as plt
from sklearn.metrics import roc_auc_score
import matplotlib.gridspec as gridspec

#### 默认参数
# N = 100 ## 随机网络节点数
# p = 0.08 ## 随机网络连边概率
# beta = 0.15 ## 传染概率
# miu = 0.1 ## 治愈概率
# t_obs = 4 ## 观测时间
# theta = 0.05 ## 初始感染概率
# alpha = 0.2 ##扩散系统
# Tot = 200 ##标签反向传播溯源迭代次数

def revSpread(N = 100, p = 0.08, beta = 0.15, miu = 0.1, t_obs = 4, theta = 0.05, alpha = 0.2, Tot = 100):
    #### first step  ER随机网络
    G = nx.random_graphs.erdos_renyi_graph(N, p)  #生成包含N个节点、连边概率p的随机图

    #### second SIR
    state = [1 if random.random() < theta else -1 for i in range(N)] ## 生成随机感染初始状态
    source = [i for i in range(N) if state[i] == 1]

    for i in source:
        state[i] = 1
    # print("Source is ", source)

    W = np.zeros((N, N)) ## 获取邻接矩阵矩阵W
    for i in G.edges:
        W[i[0]][i[1]] = 1
        W[i[1]][i[0]] = 1
    
    ## 避免除数为0
    for i in range(N):
        if any(W[i]) == False:
            W[(i + 1) % N][i] = 1
            W[i][(i + 1) % N] = 1

    def SIR(initState, T):
        if T == 0:
            return
        p = [1 for i in range(N)] ## 计算每个节点不被感染的概率
        for i in range(N):
            for j in range(N):
                if i == j or W[i][j] == 0:
                    continue
                if initState[j] == 1:
                    p[i] *= (1 - beta)
        
        lis = [] ##被新感染的节点
        for i in range(N):
            if initState[i] == 1:
                continue
            if random.random() > p[i]:
                lis.append(i)
        
        for i in range(N): ##治愈
            if initState[i] == 1 and random.random() < miu:
                initState[i] = -1
        
        for i in lis:
            initState[i] = 1

        SIR(initState, T - 1) ##下一时刻


    SIR(state, t_obs) ##得到初始标签向量


    #### third step 标签反向传播溯源
    Y = state
    D = np.zeros((N, N)) ##对角矩阵

    for i in range(N):
        D[i][i] = sum(W[i])
        D[i][i] = 1 / math.sqrt(D[i][i])

    S = (D @ W) @ D

    g = [Y[:]]
    for t in range(Tot):
        g.append([0 for j in range(N)])
        for i in range(N):
            res = 0
            for j in range(N):
                if i == j or W[i][j] == 0:
                    continue
                res += S[i][j] * g[t][j]
            g[t + 1][i] = alpha * res + (1 - alpha) * Y[i]

    predict = []
    for i in range(N):
        flag = True
        for j in range(N):
            if i == j or W[i][j] == 0:
                continue
            if g[Tot][i] < g[Tot][j]:
                flag = False
                break
        if flag:
            predict.append(i)

    Source = [1 if i in source else 0 for i in range(N)]
    Predict = [1 if i in predict else 0 for i in range(N)]

    # print("Predict is", predict)
    auc = roc_auc_score(Source, Predict)
    return auc
    # print(f"AUC: {auc}")

####绘图
plt.rcParams["font.family"]="SimHei"
fig = plt.figure(num = 1, figsize = (4, 4))

## 1. ER网络连边概率 0.06, 0.3, 0.02
ER_x = np.arange(0.06, 0.32, 0.02)
ER_y = [revSpread(p = i) for i in ER_x]
# print(ER_y)
ax1 = fig.add_subplot(221)
ax1.plot(ER_x, ER_y)
ax1.set_title("连边概率")

## 2. 感染率        0.05, 1, 0.05
beta_x = np.arange(0.05, 1.05, 0.05)
beta_y = [revSpread(beta = i) for i in beta_x]
# print(beta_y)
ax2 = fig.add_subplot(222)
ax2.plot(beta_x, beta_y)
ax2.set_title("传染概率")

## 3. 扩散系统      0, 1, 0.1
alpha_x = np.arange(0, 1.1, 0.1)
alpha_y = [revSpread(alpha = i) for i in alpha_x]
# print(alpha_y)
ax3 = fig.add_subplot(223)
ax3.plot(alpha_x, alpha_y)
ax3.set_title("扩散系统")

## 4. 观测时刻      2, 8, 1
obs_x = np.arange(2, 9, 1)
obs_y = [revSpread(t_obs = i) for i in obs_x]
# print(obs_y)
ax4 = fig.add_subplot(224)
ax4.plot(obs_x, obs_y)
ax4.set_title("观测时刻")


plt.show()