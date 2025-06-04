def rev(num):
    if num<0:
        num=-num
    temp=0
    while(num>0):
        temp=temp*10+num%10
        num//=10
    return temp
num=int(input("Enter a number: "))
print(f"Reverse is {rev(num)}")