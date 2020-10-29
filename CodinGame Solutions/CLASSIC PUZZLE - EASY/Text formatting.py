import sys
import math
import re
# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

intext = input().lower().strip()

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
intext = re.sub(r'\s{2,}', ' ', intext)
intext = re.sub(r'\s?[^\s\w\d]\s?', lambda match: match.group().strip(), intext)
intext = re.sub(r'[^\s\w\d]+', lambda match: match.group().strip()[0], intext)
def stringToPascalCase(s):
    if(not s):
        return ''
    chars = list(s)
    chars[0] = chars[0].upper()
    return ''.join(chars)
intext = '.'.join(stringToPascalCase(s) for s in intext.split('.'))
intext = re.sub(r'[^\s\w\d]', lambda match: match.group() + ' ', intext)
print(intext.strip())

