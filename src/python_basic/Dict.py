### 사전 자료형 ###
data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'Banana'
data['코코넛'] = 'Coconut'

print(data)

if '사과' in data :
  print("'사과'를 키로 가지는 데이터가 존재합니다")

# 키 데이터
print(data.keys())

# 값 데이터
print(data.values())

# 반복문으로 출력
for key in data :
  print(data[key])

# 실습
tot = {
  10 : 'Kane',
  7 : 'Son',
  33 : 'BD33'
}
print(tot)
print(tot[7])
print(tot.keys())
print(tot.values())