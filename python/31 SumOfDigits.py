def digitSum(num):
    if(num<0):
        num=-num
    temp=num
    sum=0
    while(temp>0):
        sum+=temp%10
        temp//=10
    return sum
num=int(input("Enter a number: "))
print(f"Sum is {digitSum(num)}")
