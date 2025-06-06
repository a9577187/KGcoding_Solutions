arr=[[1,2,3],[4,5,6],[7,8,9]]
sum=0
n=len(arr)
for i in range(n):
    sum+=arr[i][i]
    if i is not n-1-i:
        sum+=arr[i][n-1-i]
print("Sum is ",sum)