### 그리디 알고리즘(탐욕법) ###
# <문제> 1이 될때까지
n, k = map(int, input().split())
cnt = 0
while n != 1:
  if(n % k == 0):
    n = n // k
  else:
    n -= 1
  cnt += 1
print(cnt)