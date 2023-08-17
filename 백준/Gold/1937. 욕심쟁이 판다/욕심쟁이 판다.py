import sys

N = int(input())
graph = [list(map(int, input().split())) for _ in range(N)]
dp = [[0] * N for _ in range(N)]

sys.setrecursionlimit(10**6)
def recur(y, x):
    if dp[y][x]:
        return dp[y][x]

    for dy, dx in [[1,0], [-1,0], [0,1], [0, -1]]:
        ey = y + dy
        ex = x + dx
        if 0 <= ey < N and 0 <= ex < N:
            if graph[y][x] < graph[ey][ex]:
                dp[y][x] = max(dp[y][x], recur(ey, ex) + 1)
    
    return dp[y][x]

for y in range(N):
    for x in range(N):
        recur(y, x)


print(max(map(max, dp)) + 1)