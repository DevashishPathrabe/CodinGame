import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
def convertToTernary(number):
    if(number < 0):
        BT = convertToTernary(-number)
        return ''.join(['1' if c == 'T' else ('T' if c == '1' else '0') for c in BT])
    if(number == 0):
        return ''
    if(number%3 == 2):
        return convertToTernary((number+1) // 3) + 'T';
    else:
        return convertToTernary(number//3) + str(number%3)
n = int(input())

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
if(n == 0):
    print('0')
else:
    print(convertToTernary(n))
