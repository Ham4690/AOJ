import math
def isPrimeNum(num):
    sqrtNum = int(math.sqrt(num)) + 1
    if(num == 2 or num == 3):
        return True
    elif(num % 2 == 0):
        return False
    else:
        for i in range(3, sqrtNum , 2):
            if(num % i == 0 ):
                return False
        return True
    
count = 0
N = int(input())
for i in range(N):
    num = int(input())
    if(isPrimeNum(num)):
        count += 1

print(count)