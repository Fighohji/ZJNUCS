import math
import random
import numpy as np
from sklearn.metrics import f1_score, roc_auc_score

print("输入实验个数n,ER概率p,感染概率b,康复概率u,SIR时间t，扩散系统f")
n=int(input()) #实验个数
p=eval(input()) #ER概率
b=eval(input()) #感染概率
u=eval(input()) #康复概率
t=int(input()) #SIR时间
f=eval(input()) #扩散系统

w=[] #网络邻接矩阵
y=[-1]*(n) #每个实验个体是否被感染
def ER_Random():
    for i in range(n):
        lst=[]
        for j in range(n):
            lst.append(0)
        w.append(lst)
    for i in range(n):
        for j in range(i):
            if p>=random.uniform(0.0, 1.0): #双向边
                w[i][j]=1
                w[j][i]=1
    for _ in range(n//5):
        ss=random.randint(0, n-1)
        y[ss]=1
def SIR_random():
    for _ in range(t):
        lst=[]
        for i in range(n): #预处理出感染情况
            if y[i]==-1:
                p_ans=1
                for j in range(n):
                    if y[j]==1 and w[i][j]==1:
                        p_ans*=(1-b)
                if (1-p_ans)>=random.uniform(0.0, 1.0):
                    lst.append(i)
        for i in range(n): #早感染的把他们治愈了
            if y[i]==1:
                if u>=random.uniform(0.0, 1.0):
                    y[i]=-1
        for i in lst: #刚感染把他们感染了
            y[i]=1

ER_Random()
y_true=y[:]
SIR_random()
d=[]
for i in range(n):
    lst=[]
    for j in range(n):
        lst.append(0)
    d.append(lst)
for i in range(n):
    for j in range(n):
        d[i][i]+=w[i][j]
    d[i][i]=1/(math.sqrt(d[i][i]))
d=np.array(d)
w2=np.array(w)
s=((d@w2)@d)
print(s)
"""
100
0.08
0.15
0.1
4
0.3
"""
G=[y[:],y[:]]
for t in range(101):
    for i in range(n):
        ans=0
        for j in range(n):
            if w[i][j]==1:
                ans+=s[i][j]*G[(t+1)%2][j]
        G[t%2][i]=f*ans+(1-f)*y[i]

y_pred=[0]*n
for i in range(n):
    if i==0:
        if G[0][i]>G[0][i+1]:
            y_pred[i]=1
    elif i==n-1:
        if G[0][i]>G[0][i-1]:
            y_pred[i]=1
    else:
        if G[0][i]>G[0][i-1] and G[0][i]>G[0][i+1]:
            y_pred[i]=1
print("原来",end="")
for i in range(n):
    if y_true[i]==-1:
        y_true[i]=0
    if y_true[i]==1:
        print(i,end=" ")
print()
print("预测",end="")
for i in range(n):
    if y_pred[i]==1:
        print(i,end=" ")
print()


print(y_true)
print(y_pred)
f1=f1_score(y_true,y_pred)
auc=roc_auc_score(y_true,y_pred)
print(f"F1-Score: {f1}")
print(f"AUC: {auc}")
