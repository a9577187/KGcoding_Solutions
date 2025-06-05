import numpy as np
arr=np.array([1,2,3,1,2,2,2,1,3,2,1])
print(arr)
num=int(input("Enter a number: "))
occurrence=0
for i in range(arr.__len__()):
    if arr[i]==num:
        occurrence+=1
print(occurrence)