N = int(input())
interview = [list(map(int, input().split())) for _ in range (N)]

answer = 0


def recur(idx, price):
    global answer
    if idx == N:
        answer = max(answer, price)
        return
    if idx > N:
        return
    
    recur(idx + interview[idx][0], price + interview[idx][1])
    recur(idx + 1, price)


recur(0, 0)
print(answer)