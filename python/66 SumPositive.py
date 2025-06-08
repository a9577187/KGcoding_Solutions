sum=0
while True:
    num=int(input("Enter a number: "))
    if num<0:
        continue
    else:
        sum+=num
        print(f"Sum is {sum}")
    exit=None
    exit=input("Type yes to exit or Press Enter to continue: ")
    if exit=="yes":
        break
    else:
        continue
print("END")