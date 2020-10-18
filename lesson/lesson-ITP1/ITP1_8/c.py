import sys

def outWordRate(in_str):
    str_lower = in_str.lower()
    for word in range(ord('a'), ord('z') + 1):
        print(f'{chr(word)} : {str_lower.count(chr(word))}')
    return

in_str =  sys.stdin.read()
outWordRate(in_str)