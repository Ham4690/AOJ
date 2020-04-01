def outputList(l):
  r = len(l)
  c = len(l[0])
  
  if r==1 and c==1:
    print(l[0][0])
  else:
    for i in range(r):
      for j in range(c-1):
        print(f'{l[i][j]} ',end='')
      print(l[i][j+1])


n, m, l = map(int, input().split())

a = []
b = []
c = [[0 for i in range(l)] for j in range(n)]

for i in range(n):
  a.append(list(map(int, input().split())))

for i in range(m):
  b.append(list(map(int, input().split())))

for i in range(n):
  for j in range(l):
    for k in range(m):
      c[i][j] += a[i][k] * b[k][j]

outputList(c)



