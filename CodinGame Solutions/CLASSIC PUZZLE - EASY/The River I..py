import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
def getNextRiverNumber(riverNumber):
    nextRiverNumber = riverNumber
    while(riverNumber > 0):
        nextRiverNumber += riverNumber % 10
        riverNumber -= riverNumber % 10
        riverNumber //= 10
    return nextRiverNumber
r_1 = int(input())
r_2 = int(input())

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
while(r_1 != r_2):
    if(r_1 < r_2):
        r_1 = getNextRiverNumber(r_1)
    else:
        r_2 = getNextRiverNumber(r_2)
print(r_1)
