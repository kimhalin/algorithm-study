n = input()
coins = list(map(int, input().split()))

coins.sort()

target = 1
for i in coins:
    if i > target:
        break
    else:
        target +=i
        

print(target)
