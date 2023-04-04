dp = [0] * 10001

N = int(input())  
dp[1] =  1
dp[2] = 2
dp[3] = 3
dp[4] = 4
dp[5] = 8

for i in range(3, N + 1):
    dp[i] = dp[i-1] + dp[i-2]
        
print(dp[N] % 10007)