num1=float(input("Enter principle amount: "))
num2=float(input("Enter time: "))
num3=float(input("Enter rate of interest: "))
print(f"Compound interest is {num1*(1+num3/100)**num2}")