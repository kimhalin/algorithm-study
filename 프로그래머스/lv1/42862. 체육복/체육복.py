def solution(n, lost, reserve):
    answer = n - len(lost)
    lost.sort()
    for s in lost:
        if len(reserve) == 0:
            break
        if s in reserve:
            reserve.remove(s)
            answer += 1
            continue
        if s - 1 in reserve:
            reserve.remove(s-1)
            answer += 1
        elif s + 1 in reserve and s + 1 not in lost:
            reserve.remove(s+1)
            answer += 1
    return answer