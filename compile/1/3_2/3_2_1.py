import re

pattern = re.compile(r'<a href="(.+?)" target="_blank">(.|\n)+? <span (.+?)>(.+?)</span>')
content = open("cs_zjnu.html",'r').read()

matches = pattern.findall(content)
print len(matches)
for m in matches:
    print m[0],m[3]
