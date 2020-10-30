import sys
import math
import re
# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

n = int(input())
line = [''] * n
for i in range(n):
    line[i] = input()
    emailTemplate = '\n'.join(line)
choicesCount = -1
def choiceReplace(match):
    global choicesCount
    choicesCount += 1
    choices = match.group()[1:-1].split('|')
    return choices[choicesCount % len(choices)]
email = re.sub('\([^)]*\)', choiceReplace, emailTemplate)
print(email)
