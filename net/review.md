#### 试从多个方面比较电路交换、报文交换和分组交换的主要优缺点：

1. 电路交换：
   - 优点：连续传送大量数据，信息传输延时小
   - 缺点：电路建立连接时间长，线路利用率低
2. 报文交换：
   - 优点：采用了存储转发技术，线路利用率高
   - 缺点：延时长
3. 分组交换：
   - 优点：通信线路使用效率高，结点所需的存储容量小，网络延时小，传输可靠性高
   - 缺点：各分组必须携带控制信息，分组转发需要排队，有一定时延（随通信量增大而增大）

#### 计算机网络都有哪些类别？各种类别的网络都有哪些特点？

1. 广域网 WAN：远程、高速、是 Internet 的核心网。
2. 城域网：城市范围，链接多个局域网。
3. 局域网：校园、企业、机关、社区。
4. 个域网 PAN：个人电子设备



#### 试给出数据通信系统的模型并说明其主要组成构件的作用

1. 源系统
   - 源点：产生要传输的数据
   - 发送器：对数据编码
2. 传输系统：传输数据
3. 目的系统：
   - 接收器：接收信号并转化为能被目标设备处理的信息
   - 终点：获取接收器的比特流并把信息输出

#### 试简单说明下列协议的作用：IP、ARP、ICMP。

- IP协议：实现网络互连。
- ARP协议：解决同一个局域网上的主机或路由器的IP地址和硬件地址的映射问题
-  ICMP：提供差错报告和询问报文，以提高IP数据交付成功的机会

#### 试说明IP地址与MAC地址的区别，为什么要使用这两种不同的地址？

1. MAC地址是数据链路层和物理层使用的地址，是物理地址；而IP地址是网络层和以上各层使用的地址，是一种逻辑地址。
2. 原因：要把网络层中传送的IP分组交给目标主机，要传到链路层变成MAC帧后才能发送到实际网络。（IP地址是逻辑地址不能用于直接通信）

#### 试举例说明有些应用程序愿意采用不可靠的UDP，而不用采用可靠TCP

对实时性要求高的应用程序（UDP低时延，但是会丢失部分数据报）

#### 端口的作用是什么？为什么端口号要划分为三种类型？

- 作用：应用层中的应用进程与运输层实体进行层间交互的接口，只具有本地意义
- 原因：为了保证通信准确、高效，避免冲突。
- 补充：三种端口号
  - 熟知端口号：给重要的应用程序使用
  - 登记端口号：给没有熟知端口号的应用程序使用
  - 短暂端口号：给客户临时使用

####  文件传送协议FTP的主要工作过程是怎样的？为什么说FTP是带外传送控制信息？主进程和从属进程各起什么作用？

- 工作过程：
  1. 打开熟知端口（端口号为21），使客户进程能够连接
  2. 等待客户进程发出连接请求
  3. 启动从属进程来处理客户进程发来的请求，处理完毕即终止，但过程中会根据需求创建子进程
  4. 回到等待状态。（主从进程并发进行）
- 原因：FTP使用了一个分离的控制连接
- 作用：
  - 主进程：接受新的请求
  - 从属进程：处理单个请求

#### 试简述SMTP通信的三个阶段的过程

1. 连接建立（在发送主机客户端和SMTP客户和接受主机的SMTP服务器之间）
2. 邮件传送
3. 连接释放（SMTP释放TCP链接）

#### 计算机网络都面临哪几种威胁？主动攻击和被动攻击的区别是什么？对于计算机网络，其安全措施都有哪些？

- 威胁：截获、中断、篡改、伪造。
- 区别：  协议数据单元（PDU）是否变化
  - 主动攻击☞攻击者对某个连接中通过的 PDU 进行各种处理
  - 被动攻击☞观察和分析某一个 PDU 而不干扰信息流
- 安全措施
  - 对付被动：数据加密技术
  - 对付主动：需加密技术与适当的鉴别技术结合

#### 对称密钥体制与公钥密码体制的特点各如何？各有何优缺点？

- 对称密钥体制
  - 特点：加密和解密时所使用的密钥是相同的或者类似的
  - 优点：加密解密过程简单速度快
  - 缺点：安全性较低（概括来说）
    - 需要额外的安全信道来发送密钥
    - 通信双方事先必须约定密钥
- 公钥密码体制
  - 特点：在公开密钥体制中加密解密过程采用不同的密钥，加密密钥公开，解密密钥保密
  - 优点：安全性较高（概括来说）
    - 密钥分发简单
    - 不需要分发密钥的额外信道
  - 缺点：运算速度慢开销大

#### 数据链路层的三个基本问题（封装成帧、透明传输和差错检测）为什么都必须加以解决

- 帧定界是分组交换的必然要求

- 透明传输避免消息符号与帧定界符号相混淆

- 差错检测防止合差错的无效数据帧浪费后续路由上的传输和处理资源

#### 假定在使用CSMA/CD协议的10Mb/s以太网中某个站在发送数据时检测到碰撞，执行退避算法时选择了随机数r=100。试问这个站需要等待多长时间后才能再次发送数据？如果是100Mb/s的以太网呢？
> 对于10Mb/s的以太网，以太网把争用期时间定为51.2微秒，要退后100个争用期，等待时间是51.2微妙×100=5.12ms
> 对于100Mb/s的以太网，以太网把争用期定为5.12微秒，要退后100个争用期，等待时间是5.12微秒×100=0.512ms
>
> **对于10Mbit/s的以太网的争用期时间为51.2微秒**
>
> **等待时间=争用期时间×随机数r**





 ![image-20230611122307079](C:\Users\Fighoh\Pictures\image-20230611122307079.png)

| 动作 | 交换表的状态 | 向哪些接口转发帧 | 说明 |
|:---:|:---:|:---:|:---:|
| A发送帧给D | 写入(A, 1) | 所有接口 | 发送之前为空表，发送之后存入A接口在1 |
| D发送帧给A | 写入(D, 4) | A接口 | 之前有A的信息，发送之后存入D接口在4 |
| E发送帧给A | 写入(E, 5) | A接口 | 之前有A的信息，发送之后存入E接口在5 |
| A发送帧给E | 不变 | E接口 | 之前有E的信息和A的信息 |

#### TCP

|  握手  | SYN  | ACK  |
| :----: | :--: | :--: |
| 第一次 |  1   |  0   |
| 第二次 |  1   |  1   |
| 第三次 |  0   |  1   |

|  挥手  | FIN  | ACK  |
| :----: | :--: | :--: |
| 第一次 |  1   |  0   |
| 第二次 |  0   |  1   |
| 第三次 |  1   |  0   |
| 第四次 |  0   |  1   |