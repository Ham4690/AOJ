def ExchangeChar(c): 
  charNum = ord(c)
  if(ord("a") <= charNum and charNum <= ord("z")):
    return chr(charNum - 32) 
  elif(ord("A") <= charNum and charNum <= ord("Z")):
    return chr(charNum + 32)
  else:
    return c

words = list(input())
ans = []
for i in range(len(words)):
  ans.append(ExchangeChar(words[i]))

if(len(ans) == 1):
  print(ans[0])
else:
  for i in range(len(ans)-1):
    print(ans[i],end='')
  print(ans[i+1])
