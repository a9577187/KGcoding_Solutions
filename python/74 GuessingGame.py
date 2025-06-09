import random
num=random.randint(1,101)
while True:
    inp=int(input("Enter a number: "))
    if num==inp:
        break
    elif num>inp:
        print("Higher")
    else:
        print("Lower")
print("END")