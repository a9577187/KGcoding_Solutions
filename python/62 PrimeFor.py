num=int(input("Enter a number: "))
isPrime=None
for i in range(2,num):
    if num%i==0:
        isPrime=False
        break
    else:
        isPrime=True
if isPrime:
    print("Prime number")
else:
    print("Not a prime number")