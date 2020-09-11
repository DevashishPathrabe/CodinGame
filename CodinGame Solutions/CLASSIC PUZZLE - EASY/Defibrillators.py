import sys
import math

def distance(lonA, latA, lonB, latB):
    lonA = math.radians(lonA)
    lonB = math.radians(lonB)
    latA = math.radians(latA)
    latB = math.radians(latB)
    x = (lonB - lonA) * math.cos((latA + latB) / 2)
    y = latB - latA
    return math.sqrt(x * x + y * y) * 6371

#Read inputs.
lonA = float(input().replace(',', '.'))
latA = float(input().replace(',', '.'))
n = int(input())
min = sys.maxsize
minName = ''
for i in range(n):
    #Read defibrillator.
    defib = input().split(';')
    lonB = float(defib[4].replace(',', '.'))
    latB = float(defib[5].replace(',', '.'))
    d = distance(lonA, latA, lonB, latB)
    if(d < min):
        min = d
        minName = defib[1]
#Print nearest defibrillator.
print(minName);
