
def outputTable (table):
  r = len(table)
  c = len(table[0])
  for i in range(r):
    for j in range(c-1):
      print(str(table[i][j])+' ',end='')
    print(str(table[i][j+1]))


r, c = map(int, input().split())

ans_r = r+1
ans_c = c+1

table = [[0 for i in range(ans_c)] for j in range(ans_r)]
for i in range(r):
  inputRow = list(map(int,input().split()))
  for j in range(c):
    table[i][j] = inputRow[j]
  table[i][c] = sum(inputRow)

for i in range(ans_c):
  table[r][i] = sum([row[i] for row in table[:][:r]])
outputTable(table)