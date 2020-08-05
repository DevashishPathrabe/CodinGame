import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

# w: width of the building.
# h: height of the building.
w, h = [int(i) for i in input().split()]
n = int(input())  # maximum number of turns before game over.
x0, y0 = [int(i) for i in input().split()]
min_x = min_y  = 0
max_x = w - 1 
max_y = h - 1
# game loop
while True:
    bomb_dir = input()  # the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

    # Write an action using print
    # To debug: print("Debug messages...", file=sys.stderr, flush=True)
    if(bomb_dir.find("U") > -1):
        max_y = y0 - 1
    elif(bomb_dir.find("D") > -1):
        min_y = y0 + 1
    if(bomb_dir.find("L") > -1):
        max_x = x0 - 1
    elif(bomb_dir.find("R") > -1):
        min_x = x0 + 1
    x0 = min_x + math.ceil((max_x - min_x) / 2)
    y0 = min_y + math.ceil((max_y - min_y) / 2)

    # the location of the next window Batman should jump to.
    print("{0} {1}".format(int(x0), int(y0)))
