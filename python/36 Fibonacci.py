def fib(num):
    if num <= 0:
        return
    elif num == 1:
        print(0)
        return
    prev = 0
    current = 1
    print(prev, current, end=" ")
    for _ in range(num - 2):
        prev, current = current, current + prev
        print(current, end=" ")
num = int(input("Enter a number: "))
fib(num)