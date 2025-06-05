import numpy as np
arr=np.array([1,2,3,4,5,6,7,8,9])
counter=0
for i in range(len(arr)-1):
    if arr[i]<arr[i+1]:
        counter+=1
if counter==len(arr)-1:
    print("Sorted")
else:
    print("Unsorted")