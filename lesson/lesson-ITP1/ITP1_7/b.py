def checkConnum(n, x):
    cnt = 0
    for i in range(1,n+1):
        j = i + 1
        k = j + 1
        while((i+j+k) <= x and j <= n ):  
            while((i+j+k) <= x and k <= n):
                if((i+j+k) == x ):
                    cnt += 1
                k+= 1
            j += 1
            k = j + 1

    return cnt

def ansOutPut(ans, ansnum):
    for i in range(ansnum):
        print(ans[i])

N, X = map(int, input().split())
ans = []
while(N != 0 or X != 0 ):
    ans.append(checkConnum(N,X))
    N, X = map(int, input().split())

ansOutPut(ans, len(ans))
