#from functools import cache
#@cache
def fib(num):
    if num==0:
        return 0
    elif num==1:
        return 1
    else:
        return fib(num-1)+fib(num-2)
def printfib(num, current=0):
    if current<num:
        print(fib(current),end=" ")
        printfib(num, current+1)
num=int(input("Enter a number: "))
printfib(num)