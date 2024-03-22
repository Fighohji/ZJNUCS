<h2> <center> 实验4 FTP服务器的搭建与访问</center> </h2>

<h5><center> 计非211班-姓名：嵇纹垲-学号：202131990522</center></h5>



## 一、访问FTP服务器

在FTP客户端上安装flashfxp5_gr软件，该软件是一个功能强大的FTP客户端。

运行flashfxpr软件，输入FTP服务器的IP地址、端口号、用户名、密码等信息，连接到FTP服务器。

在flashfxpr软件的界面中，可以看到FTP服务器的根目录和其中的文件列表。

使用flashfxp软件的功能，可以对FTP服务器上的文件进行浏览、下载、上传、删除等操作。

![img](C:\Users\Fighoh\Pictures\clip_image002-1684292080909-1.png)

<center>图1 建立ftp服务器</center>

![image-20230517104911837](C:\Users\Fighoh\Pictures\image-20230517104911837.png)

<center>图2 访问ftp服务器</center>

## 二、分析FTP协议的数据包

在FTP客户端上安装npcap-1.72.exe和NM34_x64.exe软件，前者是一个网络数据包捕获库，后者是一个网络协议分析器。

运行NM34_x64.exe软件，选择网卡接口，开始捕获网络数据包。

在flashfxp5_gr软件中进行一些FTP操作，如登录、列出文件、下载文件等。

在NM34_x64.exe软件中停止捕获网络数据包，筛选出与FTP协议相关的数据包。

分析每个FTP数据包的结构和内容，观察FTP协议的工作过程和特点。

![image-20230517105301364](C:\Users\Fighoh\Pictures\image-20230517105301364.png)

<center> 图3 分析ftp协议数据包 </center>

## 三、模式的判断

在参数配置界面查看即可

![img](C:\Users\Fighoh\Pictures\clip_image002-1684292200612-3.png)

<center>图4 模式判断</center>

## 四、实验总结

本实验通过搭建和访问FTP服务器，学习了FTP协议的基本原理和功能，掌握了FTP服务器的搭建和配置方法，掌握了FTP客户端的使用方法，学习了使用抓包工具分析FTP协议的数据包。