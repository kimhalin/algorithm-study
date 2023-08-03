A, B = map(int, input().split())
A -= 1
countA, countB = A, B

for i in range(1, 99):
    countA += (A//(2**i)) * ((2**i) - (2**(i-1)))
    countB += (B//(2**i)) * ((2**i) - (2**(i-1)))

print(countB - countA)