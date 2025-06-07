while True:
    num1=int(input("Enter first number: "))
    operation=input("Enter + for addition\nEnter - for subraction\nEnter / for division\nEnter * for multiplication\n")
    num2=int(input("Enter second number: "))
    match operation:
        case '+':
            print(f"{num1} + {num2} = {num1+num2}")
        case '-':
            print(f"{num1} - {num2} = {num1-num2}")
        case '/':
            print(f"{num1} / {num2} = {num1/num2}")
        case '*':
            print(f"{num1} * {num2} = {num1*num2}")
        case _:
            print("Invalid input")
    exit=input("Press enter to continue or Type exit to quit: ")
    if exit==("exit" or "EXIT"):
        break
    else:
        continue
print("END")