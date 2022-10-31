### 리스트 자료형 ###
# 직접 데이터를 넣어 초기화
a = [1, 2, 3, 4, 5]
print(a)

# 특정원소 출력
print(a[3])

# 크기가 N이고, 모든 값이 0인 1차원 리스트 초기화
n = 10
a = [0] * n
print(a)

# 실습
a = [7, 3, 2, 5, 9]
print(a)

a[4] = 1
print(a)


### 리스트 인덱싱 ###
a = [1, 2, 3, 4, 5]

# 2번째 원소 출력
print(a[1])

# 뒤에서 3번째 원소 출력
print(a[-3])

# 원소값 변경
a[0] = 7
print(a)


### 리스트 슬라이싱 ###
# 2번째 부터 4번째 까지 출력
a = [1, 2, 3, 4, 5]
print(a[1:4])


### 리스트 컴프리헨션 ###
# 0~9까지 리스트
array = [i for i in range(10)]
print(array)

# 0~19까지 홀수만
array = [i for i in range(20) if i%2==1]
print(array)

# 1~9까지 제곱수
array = [i*i for i in range(1, 10)]
print(array)

# N * M 크기의 2차원 리스트 초기화
n = 4
m = 3
array = [[0] * m for _ in range(n)]
print(array)


### 리스트 관련 메서드 ###
a = [1, 4, 3]
print("리스트 : ", a)

# 삽입
a.append(2)
print("INSERT : ", a)

# 오름차순 정렬
a.sort()
print("SORT : ", a)

# 내림차순 정렬
a.sort(reverse=True)
print("REVERSE SORT : ", a)

a = [4, 3, 2, 1]

# 뒤집기
a.reverse()
print("REVERSE : ", a)

# 특정인덱스에 데이터 추가
a.insert(2, 3)
print("INSERT : ", a)

# 특정값 데이터 갯수
print("COUNT : ", a.count(3))

# 특정 값 데이터 삭제
a.remove(1)
print("REMOVE : ", a)

# 특정 값 가지는 원소 모두 삭제
a = [1, 2, 3, 4, 5, 5, 5]
remove_set = {3, 5}
result = [i for i in a if i not in remove_set]
print(result)