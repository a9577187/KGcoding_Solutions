arr=[[1,2,3,2,1],[4,5,6,5],[7,8,9]]
target=8
found=False
for i in range(len(arr)):
    for j in range(len(arr[i])):
        if arr[i][j]==target:
            print(f"Matched at row {i} and column {j}")
            found=True
            break
    if found:
        break
if not found:
    print("Not matched")