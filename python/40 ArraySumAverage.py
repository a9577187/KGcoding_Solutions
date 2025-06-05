import numpy as np
arr=np.array([1,2,3,4,5,6,7,8,9])
sum=0
lenght=0
for i in arr:
    sum+=i
    lenght+=1
print(f"Sum is {arr.sum()}")
print(f"Sum is {sum}")
print(f"Average is {arr.mean()}")
print(f"Average is {arr.sum()/arr.__len__()}")
print(f"Average is {sum/lenght}")

