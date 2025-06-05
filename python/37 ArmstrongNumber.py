def isArm(num):
    org=num
    temp=num
    digit=0
    while temp>0:
        digit+=1
        temp//=10
    res=0
    while num>0 :
        res+=(num%10)**digit
        num//=10
    if org==res:
        print("Yes")
    else:
        print("No")
num=int(input("Enter a number: "))
isArm(num)