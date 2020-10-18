import sys

while True:
    x = input()
    sum = 0
    if x == '0' :
        break

    in_list = list(x)
    for i in range(len(in_list)):
        sum += int(in_list[i])
    print(sum)
