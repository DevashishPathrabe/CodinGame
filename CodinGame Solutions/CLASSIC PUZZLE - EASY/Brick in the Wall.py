import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

x = int(input())
n = int(input())
m = sorted(map(int, input().split()), reverse=True)
w = 0
for i in range(n):
    l = i // x
    w += l * .65 * m[i]
print('%.3f' % round(w, 3))
