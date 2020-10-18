import sys

BIG_NUM = 2000000000
MOD = 1000000007
EPS = 0.000000001


while True:
    table = str(input())
    if(table[0] == '0'):
        break
    print(sum(int(num) for num in(table)))

