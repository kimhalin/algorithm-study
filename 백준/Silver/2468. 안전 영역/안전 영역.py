import sys
from collections import deque
sys.setrecursionlimit(100000)


n = int(input())
field = []

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

for _ in range(n):
    field.append(list(map(int, input().split())))


rain = max(map(max, field))

def bfs(a, b, cur_rain):
    q = deque([])
    q.append((a,b))
    visited[a][b] = 1

    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if field[nx][ny] > cur_rain and visited[nx][ny] == 0:
                q.append((nx,ny))
                visited[nx][ny] = 1

result = 0
for i in range(rain):
    visited = [[0] * n for _ in range(n)]
    cnt = 0

    for j in range(n):
        for k in range(n):
            if field[j][k] > i and visited[j][k] == 0:
                bfs(j, k, i)
                cnt += 1
    
    if result < cnt:
        result = cnt

print(result)