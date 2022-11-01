### 주요 라이브러리 ###
# sum
result = sum([1,2,3,4,5])
print(result)

# min, max
min_result = min(7,3,5,2)
max_result = max(7,3,5,2)
print(min_result, max_result)

# eval
result = eval("(3+5)*7")
print(result)

# sorted
result = sorted([9,1,8,5,4])
reverse_result = sorted([9,1,8,5,4], reverse=True)
print(result)
print(reverse_result)

# sorted 정렬기준 설정
array = [('KANE', 10), ('SON', 7), ('RICHARLISON', 9)]
result = sorted(array, key=lambda x: x[1], reverse = False)
print(result)

# 순열
from itertools import permutations

data = ['A', 'B', 'C']
result = list(permutations(data,3))
print(result)

# 조합
from itertools import combinations

data = ['A', 'B', 'C']
result = list(combinations(data,2))
print(result)

# 중복순열
from itertools import product
data = ['A', 'B', 'C']
result = list(product(data, repeat=2))
print(result)

# 중복조합
from itertools import combinations_with_replacement
data = ['A', 'B', 'C']
result = list(combinations_with_replacement(data, 2))
print(result)

# 등장횟수
from collections import Counter
counter = Counter(['red', 'red', 'blue', 'red', 'green', 'blue', 'blue'])
print(counter['blue'])
print(counter['green'])
print(dict(counter))