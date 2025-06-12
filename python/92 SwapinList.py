arr = [1,1,2,3,4,2,5,4,3,2,1,3,3,2,3,4,4,5,5,3,2,1,2]
print("Original:", arr)

i1 = int(input("Enter first element: "))
i2 = int(input("Enter second element: "))

i1_index = arr.index(i1)
i2_index = arr.index(i2)

arr[i1_index], arr[i2_index] = arr[i2_index], arr[i1_index]

print("Modified:", arr)