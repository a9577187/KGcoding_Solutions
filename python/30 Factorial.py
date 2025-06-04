def fact(num):
    if(num==1 or num==0):
        return 1
    else:
        fact=1
        for a in range(1,num+1):
            fact*=a
        return fact
num=int(input("Enter a number: "))
print(f"Factorial is {fact(num)}")
