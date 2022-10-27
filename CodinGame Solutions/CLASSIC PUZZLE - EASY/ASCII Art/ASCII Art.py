import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

l = int(input())
h = int(input())
t = input().upper()
unknownCharIndex = ord('Z') - ord('A') + 1
for i in range(h):
    row = input()

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
    for j in range(len(t)):
        charIndex = ord(t[j]) - ord('A')
        letterIndex = charIndex if(t[j].isalpha()) else unknownCharIndex
        asciiArt = row[letterIndex * l : (letterIndex + 1) * l]
        print(asciiArt, end='')
    print()
