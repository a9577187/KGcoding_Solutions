from functools import reduce
import operator

def factorial(num):
    if num == 0 or num == 1:
        return 1
    fact = 1
    for i in range(2, num + 1):
        fact *= i
    return fact

number = 9
print("Factorial using two ways")

# First way: loop
print(factorial(number))

# Second way: reduce
result = reduce(operator.mul, range(2, number + 1), 1)
print(result)
