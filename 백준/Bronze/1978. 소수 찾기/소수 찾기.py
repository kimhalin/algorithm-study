N = int(input())
nums = list(map(int, (input()).split()))
count = len(nums)

for n in nums:
    if n == 1:
        count -= 1
        continue
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            count -= 1
            break

print(count)