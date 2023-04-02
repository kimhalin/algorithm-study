# 배추흰지렁이 상하좌우 배추로 이동 가능
# 인접한 배추들이 몇 군데 퍼져있는지 조사하기

import sys
sys.setrecursionlimit(10000)

test = int(input())

def dfs(x, y):
    dx = [0,0,-1,1]
    dy = [1,-1,0,0]

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if (0 <= nx < m) and (0 <= ny < n): 
            if field[nx][ny] == 1:
                field[nx][ny] = 0
                dfs(nx, ny)

for _ in range(test):
    m, n, k = map(int, input().split())
    count = 0
    field =[[0]*(n) for _ in range(m)]

    for _ in range(k):
        x, y = map(int, input().split())
        field[x][y] = 1

    for x in range(m):
        for y in range(n):
            if field[x][y] == 1:
                dfs(x,y)
                count +=1
    
    print(count)