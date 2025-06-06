import numpy as np
arr=np.array([1,2,3,4,5,6,7,8,9])
max=arr[0]
min=arr[0]
for val in arr:
    if val>max:
        max=val
    if val<min:
        min=val
print(f"MAX is {max} and MIN is {min}")