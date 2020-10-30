import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

r = int(input())
v = int(input())
T = [0] * r
for i in range(v):
    c, n = [int(j) for j in input().split()]

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
    T[0] += (10**n) * (5**(c-n))
    T = sorted(T)
print(T[-1])
