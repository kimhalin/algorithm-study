def solution(name, yearning, photo):
    answer = [0] * len(photo)
    for j in range(len(photo)):
        for i in range(len(photo[j])):
            if photo[j][i] not in name:
                continue
            idx = name.index(photo[j][i])
            answer[j] += yearning[idx]

    return answer