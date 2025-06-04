def GCD(num1,num2):
    if num1>num2:
        min=num2
    else:
        min=num1
    hcf=1
    for a in range(min,0,-1):
        if num1%a==0 and num2%a==0:
            hcf=a
            break
    return hcf
num1=int(input("Enter first number: "))
num2=int(input("Enter second number: "))
print(f"GCD is {GCD(num1,num2)}")
