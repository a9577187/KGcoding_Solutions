def rev(num):
    temp=0
    while(num>0):
        temp=temp*10+(num%10)
        num//=10
    return temp
num=int(input("Enter a number: "))
if num==rev(num):
    print("Palindrome")
else:
    print("Not a Palindrome")