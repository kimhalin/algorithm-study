n, m = map(int, input("행과 열의 개수를 입력하세요: ").split())
pos = list(map(int, input().split()))
arr = [list(map(int, input().split())) for _ in range(n)]

dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]

count = 1
turn = 0

while(True):
    direc = pos[2]

    if direc == 0:
        pos[2] = 3
    else:
        pos[2] -= 1

    next_pos = pos[0] + dx[pos[2]], pos[1] + dy[pos[2]]
    
    if arr[next_pos[1]][next_pos[0]] == 0:
        arr[next_pos[1]][next_pos[0]] = 1
        pos[0] = next_pos[0]
        pos[1] = next_pos[1]
        count += 1
        turn = 0
        continue

    else:
        turn += 1

    if turn == 4:
        next_pos = pos[0] - dx[pos[2]], pos[1] - dy[pos[2]]
        if arr[next_pos[1]][next_pos[0]] == 0:
            pos[0] = next_pos[0]
            pos[1] = next_pos[1]    
        else:
            break
        turn = 0

print(count)
