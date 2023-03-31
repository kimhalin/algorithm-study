def solution(n):
    inv_three = ''
    while n >= 1:
        n, b = divmod(n, 3)
        inv_three += str(b)

    return int(inv_three, 3)