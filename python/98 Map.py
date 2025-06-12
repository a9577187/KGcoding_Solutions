contry={"India":"New delhi","Nepal":"Katmandu","BG":"Dhaka","Japan":"Tokyo","Russia":"Moscow"}
con=input("Enter a country: ")
if con in contry:
    print(f"Capital is {contry[con]}")
else:
    print("Unavilable")
