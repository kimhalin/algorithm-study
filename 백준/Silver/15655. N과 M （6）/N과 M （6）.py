N, M = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()


arr = []

def recurr(count):
    if count == M:
        print(*arr)
        return
    for i in nums:
        if i in arr or (arr and i < max(arr)):
            continue
        arr.append(i)
        recurr(count+1)
        arr.pop()

recurr(0)