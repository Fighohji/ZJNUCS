import re
pattern = re.compile('([1-9]|[1-2][0-9]|3[0-1])/([1-9]|1[0-2])/([0-9]{1,4})$')

S = ['20/4/2023', '40/2/2023', '9/9/999', '12/13/2021', '16/11/2023']
for s in S:
    print s
    if pattern.match(s) is not None:
        print "success" 
    else:
        print "fail"