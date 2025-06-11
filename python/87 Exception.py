try:
    num1=int(input("Enter first number: "))
    num2=int(input("Enter second number: "))
    res=num1/num2
    print(res)
except ZeroDivisionError:
    print("Can't divide by zero")
except ValueError:
    print("Invalid input")
except Exception:
    print("Some exception")
finally:
    print("END")