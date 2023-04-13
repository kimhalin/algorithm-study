from collections import deque
def solution(brown, yellow):
    answer = []

    for i in range(1, yellow+1):
        if yellow % i == 0:
            yellow_y = yellow // i
            brown_x = brown - yellow_y * 2
            if brown_x // 2 == i + 2:
                return [(brown - brown_x) // 2 + 2, brown_x // 2]
    
    return answer
