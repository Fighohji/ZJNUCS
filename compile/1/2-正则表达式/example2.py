#! /usr/bin/env python
#coding=utf-8

import re
s = '1102231990xxxxxxxx'
res = re.search(r'(?P<province>\d{3})(?P<city>\d{3})(?P<born_year>\d{4})',s)
print(res.groupdict())