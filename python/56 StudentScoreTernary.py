marks=int(input("Enter your marks: "))
score="High" if marks>80 else "Moderate" if marks>50 else "Low"
print(f"Your marks are {score}")