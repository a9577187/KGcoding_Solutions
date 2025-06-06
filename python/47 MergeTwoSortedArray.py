arr1=[1,3,5,7,9]
arr2=[2,4,6,8]
i=0
j=0
length1=len(arr1)
length2=len(arr2)
res=[]
while i<length1 and j<length2:
    if arr1[i]<=arr2[j]:
        res.append(arr1[i])
        i+=1
    else:
        res.append(arr2[j])
        j+=1
while i<length1:
    res.append(arr1[i])
    i+=1
while j<length2:
    res.append(arr2[j])
    j+=1
print(res)