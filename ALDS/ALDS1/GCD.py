# a / b = Q + r
# r = 0
def GCD(a,b):
    r = a % b
    if(r == 0):
        return b
    else:
        return GCD(b,r)
        
a,b = map(int,input().split())

ans = GCD(a,b)
print(ans)