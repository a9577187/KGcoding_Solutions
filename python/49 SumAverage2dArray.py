arr=[[1,2,3,2,1],[4,5,6,5],[7,8,9]]
sum=0
counter=0
found=False
for i in range(len(arr)):
    for j in range(len(arr[i])):
        sum+=arr[i][j]
        counter+=1
print(f"Sum is {sum} and average is {sum/counter}")