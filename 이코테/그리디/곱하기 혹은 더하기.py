num = list(input())
num = [int(n) for n in num]
if 0 in num:
    num.remove(0)

res = 1
for n in num:
    res *= n

print(res)
