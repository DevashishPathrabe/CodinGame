import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

n = int(input())  # the number of temperatures to analyse
inputs = input().split()
if(n <= 0):
    print(0)
    quit()
closestToZero = sys.maxsize
for i in range(n):
    T = int(inputs[i])
    if(abs(T) < abs(closestToZero)):
        closestToZero = T
    elif(abs(T) == abs(closestToZero)):
        closestToZero = max(closestToZero, T)
print(closestToZero)