num=5
while True:
    guess=int(input("Enter a number (0 to 9): "))
    if guess>9 or guess<0:
        print("Out of range")
    elif guess>num:
        print("Guess lower")
    elif guess<num:
        print("Guess higher")
    elif guess==num:
        break
print("Game end")