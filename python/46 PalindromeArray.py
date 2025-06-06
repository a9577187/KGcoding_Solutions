arr=[1,2,3,4,5,4,3,2,1]
length=len(arr)
counter=0
i=0
while i<length//2:
    if(arr[i]==arr[length-1-i]):
        counter+=1
    i+=1
if counter==length//2:
    print("Palindrome")
else:
    print("No")