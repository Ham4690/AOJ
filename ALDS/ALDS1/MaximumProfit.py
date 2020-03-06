n = int(input())
numbers = []

minv = int(input())
num = int(input())

max_r = num - minv

if(minv > num):
    minv = num

for i in range(2,n):
    num = int(input())
    if(max_r <(num - minv)):
        max_r = num - minv

    if(minv > num):
        minv = num

print(max_r)

