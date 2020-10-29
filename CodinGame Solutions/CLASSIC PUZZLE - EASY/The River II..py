import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
def getNextRiverNumber(riverNumber):
    nextRiverNumber = riverNumber
    while(riverNumber > 0):
        nextRiverNumber += riverNumber % 10
        riverNumber -= riverNumber % 10
        riverNumber /= 10
    return nextRiverNumber
r_1 = int(input())

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
riversMeetR1 = False
for i in range(r_1 - 1, 0, -1):
    riversMeetR1 = (getNextRiverNumber(i) == r_1)
    if(riversMeetR1):
        break
print("YES" if riversMeetR1 else "NO")
