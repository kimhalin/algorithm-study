N = int(input())
nums = list(map(int, (input()).split()))

prefix = [0 for _ in range(N+1)]

for i in range(N):
    prefix[i+1] = max(prefix[i] + nums[i], nums[i])

print(max(prefix[1:]))
