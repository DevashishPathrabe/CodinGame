import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

w, H = map(int, input().split())
T = input().split('  ')
Ti = list(range(len(T)))
for i in range(H-2):
    line = input().split('|')
    for j in range(len(line)):
        if(line[j] == '--'):
            for k in range(len(Ti)):
                if(Ti[k] == j-1):
                    Ti[k] += 1
                elif(Ti[k] == j):
                    Ti[k] -= 1
B = input().split('  ')
for i in range(len(T)):
    print(T[i] + B[Ti[i]])
