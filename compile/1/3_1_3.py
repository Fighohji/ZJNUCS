import re
pattern = re.compile('(\((\d{4})\)) (\d{8})-(\d{4})')

number = ["(2341) 82373452-3219", "(3295) 28467123 3255", "(3287) 9482374628-3215", '3218 27332678-2893']
for s in number:
    m = re.match(pattern, s)
    if m is not None:
        print m.groups()[0]
    else:
        print '电话号码错误'
