def rev(list):
    lenght=len(list)
    for i in range(lenght//2):
        list[i],list[lenght-i-1]=list[lenght-1-i],list[i]
arr=[1,2,3,4,5,6,7,8,9]
print(arr)
rev(arr)
print(arr)