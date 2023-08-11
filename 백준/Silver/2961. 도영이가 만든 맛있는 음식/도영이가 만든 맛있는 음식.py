N = int(input())

ingre = [list(map(int, input().split())) for _ in range(N)]
answer = 9999999999999

def recur(idx, dan, zzan, use):
    global answer
    if idx == N:
        if use == 0:
            return
        answer = min(answer, abs(dan - zzan))
        return
    
    recur(idx+1, dan * ingre[idx][0], zzan + ingre[idx][1], use + 1)
    recur(idx+1, dan, zzan, use)

recur(0, 1, 0, 0)

print(answer)