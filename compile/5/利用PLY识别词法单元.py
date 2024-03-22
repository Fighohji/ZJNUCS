# ------------------------------------------------------------
# main.py
#
# tokenizer for a simple expression evaluator for
# numbers and +,-,*,/,
# ------------------------------------------------------------
import ply.lex as lex

reserved = {
    'main' : 'MAIN',
    'int' : 'INT',
    'if' : 'IF',
    'while' : 'WHILE',
    'printf' : 'PRINTF',
}

# List of token names.   This is always required
tokens = [
    'ID',
    'NUMBER',
    'PLUS',
    'MINUS',
    'TIMES',
    'DIVIDE',
    'LPAREN',
    'RPAREN',
    'OPENCURLY',
    'CLOSECURLY',
    'SEMICOLON',
    'QUOTATIONMARK',
    'LT',
    'EQUAL',
    'POINT',
    'SENTENCE',
] + list(reserved.values())


# Regular expression rules for simple tokens
t_PLUS = r'\+'
t_MINUS = r'-'
t_TIMES = r'\*'
t_DIVIDE = r'/'
t_LPAREN = r'\('
t_RPAREN = r'\)'
t_OPENCURLY = r'\{'
t_CLOSECURLY = r'\}'
t_SEMICOLON = r'\;'
t_QUOTATIONMARK = r'\"'
t_LT = r'\<'
t_EQUAL = r'\='
t_POINT = r'\.'
t_SENTENCE = r'".+?"' #\"(\\.|[^\\"])*\"

# A regular expression rule with some action code
def t_NUMBER(t):
    r'\d+'
    t.value = int(t.value)
    return t

# Define a rule so we can track line numbers
def t_newline(t):
    r'\n+'
    t.lexer.lineno += len(t.value)


def t_ID(t):
    r'[a-zA-Z_][a-zA-Z_0-9]*'
    t.type = reserved.get(t.value, 'ID') # Check for reserved words
    return t


# A string containing ignored characters (spaces and tabs)
t_ignore  = ' \t'

# Error handling rule
def t_error(t):
    print "Illegal character '%s'" % t.value[0]
    t.lexer.skip(1)

def find_column(input, token):
    last_cr = input.rfind('\n', 0, token.lexpos)
    if last_cr < 0:
        last_cr = 0
    column = (token.lexpos - last_cr) + 1
    return column

#literals = ['+', '-', '*', '/', '{', '}', ';', '"', '.', '=']

# Build the lexer
lexer = lex.lex()

# Test it out
data = '''
asd 3 + 4 * 10
+ -20 *2
'''
f = open('prog.txt', 'r')
data = ''
for lines in f.readlines():
    data += str(lines)
f.close()

# Give the lexer some input
lexer.input(data)
# Tokenize
while True:
    tok = lexer.token()
    if not tok:
        break # No more input
    #print tok
    print 'LexToken(' + str(tok.type) + ', \'' + str(tok.value) + '\', ' + str(tok.lineno) + ', ' + str(find_column(data, tok)) + ')'
    #print tok.type, tok.value, tok.lineno, tok.lexpos - pos
