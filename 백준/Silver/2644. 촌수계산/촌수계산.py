import sys
from collections import deque
sys.setrecursionlimit(100000)


n = int(input())
p1, p2 = map(int, input().split())

num = int(input())
graph = [[] for _ in range(n + 1)]

check = [0] * (n+1)
for  _ in range(num):
    i, j = map(int, input().split())
    graph[i].append(j)
    graph[j].append(i)

def bfs(node):
    queue = deque()
    queue.append(node)
    while queue:
        node = queue.popleft()
        for n in graph[node]:
            if check[n] == 0:
                check[n] = check[node] + 1
                queue.append(n)

bfs(p1)
print(check[p2] if check[p2] > 0 else -1)
