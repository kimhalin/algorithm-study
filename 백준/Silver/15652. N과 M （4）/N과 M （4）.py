N, M = map(int, input().split())

arr = []

def recurr(count):
    if count == M:
        print(*arr)
        return
    for i in range(1, N + 1):
        if arr and i < max(arr):
            continue
        arr.append(i)
        recurr(count+1)
        arr.pop()

recurr(0)