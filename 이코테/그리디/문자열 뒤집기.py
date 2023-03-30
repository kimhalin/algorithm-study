num = list(input())

zero = 0
one = 0

if num[0] == '1':
    zero +=1
else:
    one +=1

for i in range(len(num) - 1):
    if num[i] != num[i+1]:
        if num[i+1] =='1':
            zero +=1
        else:
            one +=1

print(min(zero, one))
