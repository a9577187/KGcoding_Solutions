def isPrime(num):
    if num < 2:
        print("Not a prime number")
        return
    for a in range(2,num):
        if num % a == 0:
            print("Not a prime number")
            return
    print("Prime number")
num1=int(input("Enter a number: "))
isPrime(num1)