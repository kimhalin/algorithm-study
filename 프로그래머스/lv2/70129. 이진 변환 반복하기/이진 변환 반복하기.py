def solution(x):
    
    cnt = 0
    zero = 0
    
    while True:
        if x == '1':
            break
        zero += x.count("0")
        x = x.replace("0", "")
        
        x = bin(len(x))[2:]
        
        cnt = cnt + 1
    return [cnt, zero]



