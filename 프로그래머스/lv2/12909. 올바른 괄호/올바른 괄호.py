def solution(s):
    answer = True
    count = 0
    if s[0] == ')':
        return False
    for i in range(len(s)):
        if s[i] == '(':
            count +=1
        elif s[i] == ')' and count > 0:
            count -=1

    if count > 0:
        return False
    return True
