import re

pattern=re.compile('(.*)\.(jpg|jpeg|gif|bmp)',re.I)

name = ['a.jpg', 'b.jpeg', 'c.Gif', 'd.bmp', 'e.avi']
for s in name:
    m=pattern.match(s)
    if m is not None:
        print('匹配成功')
    else:
        print('文件不符合要求')