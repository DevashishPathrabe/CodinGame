import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

r = [input()]
l = int(input())

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
for i in range(l-1):
    tempList = list()
    lastChar = r[0]
    count = 0
    for char in r:
        if(lastChar == char):
            count += 1
        else:
            tempList.extend([str(count), lastChar])
            lastChar = char
            count = 1
    tempList.extend([str(count), lastChar])
    r = tempList
print(" ".join(r))
