### 함수 ###
def add(a,b):
  return a+b

print(add(3,5))

def add(a,b):
  print(a+b)

add(2,4)
add(b=10, a=5)

# 실습
a = 10
def func():
  global a
  a += 1
  print(a)
func()


### 람다 ###
print((lambda a, b: a + b)(3, 7))