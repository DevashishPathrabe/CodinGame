import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.
mimetype_map = {}
n = int(input())  # Number of elements which make up the association table.
q = int(input())  # Number Q of file names to be analyzed.
for i in range(n):
    # ext: file extension
    # mt: MIME type.
    ext, mt = input().split()
    mimetype_map[ext.lower()] = mt
for i in range(q):
    fileName = input()  # One file name per line.

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
    if(not "." in fileName):
        print("UNKNOWN")
        continue
    fileExtension = fileName.split(".")[-1].lower()
    if(mimetype_map.get(fileExtension)):
        print(mimetype_map[fileExtension])
    else:
        print("UNKNOWN")

# For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
