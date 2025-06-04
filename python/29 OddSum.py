def oddSum(num):
    sum=0
    for a in range(1,num,2):
        sum+=a
    return sum
num=int(input("Enter a number: "))
print(f"Sum is {oddSum(num)}")
