def LCM(num1,num2):
    if num1>num2:
        min=num2
    else:
        min=num1
    res=num1*num2
    hcf=1
    for a in range(min,0,-1):
        if num1%a==0 and num2%a==0:
            hcf=a
            break
    res//=hcf
    return res
num1=int(input("Enter first number: "))
num2=int(input("Enter second number: "))
print(f"LCM is {LCM(num1,num2)}")
