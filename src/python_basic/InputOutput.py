### 기본 입출력 ###
n = int(input())
# 공백을 기준으로 구분하여 입력
data = list(map(int, input().split()))
data.sort(reverse=True)
print(data)

# 데이터의 입력이 적을 경우 각각변수에 담을수 있다
a,b,c = map(int, input().split())
print(a,b,c)
print(a)
print(c)

# 문자열 입력 받기
import sys
data = sys.stdin.readline().rstrip()
print(data)