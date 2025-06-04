def printTable(num):
    for a in range(1,11,1):
        print(f"{num} X {a} = {num*a}")
num=int(input("Enter a number: "))
printTable(num)