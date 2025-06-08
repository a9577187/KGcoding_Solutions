arr=[1,2,3,4,5,6,6,5,4,3,2,1,4,5,3,1,1,5,4,2,1,3,4]
print(arr)
num=int(input("Enter a number: "))
counter=0
for i in arr:
    if i==num:
        counter+=1
print(f"Freq of {num} is {counter}")