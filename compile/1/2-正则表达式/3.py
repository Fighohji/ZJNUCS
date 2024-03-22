# coding=utf-8
# !/usr/bin/python
import  re
line="abc123 he33 we2he89"
result=re.findall( r'\d+', line)
print(result)
   
