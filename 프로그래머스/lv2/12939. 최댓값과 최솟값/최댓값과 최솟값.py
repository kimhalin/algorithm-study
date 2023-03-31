def solution(s):
    num = [int(n) for n in s.split()]
    m = min(num)
    n = max(num)
    answer = str(m) + ' ' + str(n)
    return answer