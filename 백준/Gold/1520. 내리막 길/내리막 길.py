import sys

M, N = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(M)]
dp = [[-1] * N for _ in range(M)]

sys.setrecursionlimit(10**6)


def recur(y, x):
    if dp[y][x] > -1:
        return dp[y][x]
    if y == M - 1 and x == N - 1:
        return 1
    
    route = 0

    for dy, dx in [[0, 1], [0, -1], [1, 0], [-1, 0]]:
        ey = y + dy
        ex = x + dx
        if 0 <= ey < M and 0 <= ex < N:
            if graph[y][x] > graph[ey][ex]:
                route += recur(ey, ex)
    
    dp[y][x] = route
    return dp[y][x]

print(recur(0,0))