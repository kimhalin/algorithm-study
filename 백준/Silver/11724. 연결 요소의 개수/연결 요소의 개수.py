import heapq
import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline

def dfs(v):
    visited[v] = True
    for i in graph[v]:
        if visited[i] == False:
            visited[i] = True
            dfs(i)

n, m = map(int, input().split())
graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

for _ in range(m):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

count = 0
for i in range(1, n + 1):
    if visited[i] == False:
        count+=1
        dfs(i)

print(count)