class NFA:
    def __init__(self, string, result):
        self.string = string
        self.result = result

    def get_current(self, i):
        return self.string[i]

    def get_next(self, i):
        if i + 1 >= len(self.string):
            return ''
        return self.string[i+1]

    def add_to_status(self, a, ch, b):
        self.result.append((a, ch, b))

    def check_vocab(self, ch):
        return ch != '*' and ch != '(' and ch != ')' and ch != '|'

    def Get_NFA(self):
        t = 0
        k = 0
        stk = []
        s = str(self.string)
        len = s.__len__()
        for i in range(len):
            ch = self.get_current(i)
            sym = self.get_next(i)

            if self.check_vocab(ch):
                if sym == '':
                    self.add_to_status(t, ch, k + 1)
                    t = k = k + 1
                    while stk.__len__() > 0 and stk[-1] == -1:
                            self.add_to_status(t, 'eps', k + 1)
                            self.add_to_status(stk[-2], 'eps', k + 1)
                            t = k = k + 1
                            stk.pop()
                            stk.pop()
                elif sym == '*':
                    self.add_to_status(t, ch, k + 1)
                    self.add_to_status(k + 1, 'eps', k + 1)
                    t = k = k + 1
                elif sym == '|':
                    self.add_to_status(t, 'eps', k + 1)
                    self.add_to_status(k + 1, ch, k + 2)
                    stk.append(k + 2)
                    stk.append(-1)
                    k = k + 2
                else:
                    self.add_to_status(t, ch, k + 1)
                    t = k = k + 1
            else:
                if ch == '|':
                    self.add_to_status(t, 'eps', k + 1)
                    t = k = k + 1
                elif ch == '(':
                    stk.append(t)
                    self.add_to_status(t, 'eps', k + 1)
                    t = k = k + 1
                elif ch == ')':
                    while stk.__len__() > 0 and stk[-1] == -1:
                        self.add_to_status(t, 'eps', k + 1)
                        self.add_to_status(stk[-2], 'eps', k + 1)
                        t = k = k + 1
                        stk.pop()
                        stk.pop()
                    nw = stk[-1]
                    stk.pop()
                    if sym == '':
                        while stk.__len__() > 0 and stk[-1] == -1:
                            self.add_to_status(t, 'eps', k + 1)
                            self.add_to_status(stk[-2], 'eps', k + 1)
                            t = k = k + 1
                            stk.pop()
                            stk.pop()
                    elif sym == '|':
                        stk.append(t)
                        stk.append(-1)
                        t = nw
                    elif sym == '*':
                        self.add_to_status(t, 'eps', nw)
                        self.add_to_status(t, 'eps', k + 1)
                        self.add_to_status(nw, 'eps', k + 1)
                        t = k = k + 1

s = []
nw = NFA('(a|b)*ab', s)
nw.Get_NFA()
for i in nw.result:
    print(i)