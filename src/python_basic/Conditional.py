### 조건문 ###
x = 15

if x >= 10:
  print("x가 10보다 크거나 같습니다!")

if x >= 0:
  print("x가 0보다 크거나 같습니다!")

if x >= 20:
  print("x가 20보다 크거나 같습니다!")

a = 5

if a >= 0:
  print("a >= 0")
elif a >= -10:
  print("-10 <= a <= 0")
else:
  print("a < -10")

# 실습
score = 85
if score >= 90:
  print("A학점!")
elif score >= 80:
  print("B학점!")
elif score >= 70:
  print("C학점!")
elif score >= 60:
  print("D학점!")
else:
  print("F학점!")

# 비교연산자
if True or False:
  print("yes")