expression ="3+(6*7-2)+2*3"
# expression =u"3+2+3"
# print(expression[-1])
stack = []
Ans = []
priority = {'+':1, '-':1, '*':2, '/':2, '(':0}
for i in expression:
    if i.isdigit():
        Ans.append(i)
    elif len(stack) == 0 and i in '+-*/' or i == '(':
        stack.append(i)
    elif i == ')':
        while stack[-1] != '(':
            Ans.append(stack.pop())
        stack.pop()
    else:
        while len(stack) > 0 and priority[stack[-1]] >= priority[i]:
            Ans.append(stack.pop())
        stack.append(i)
while len(stack) > 0:
    Ans.append(stack.pop())

print(' '.join(Ans))