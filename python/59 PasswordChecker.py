while True:
    password=input("Enter your password: ")
    if len(password)<6:
        password=input("Renter your password: ")
    else:
        break
print("Password set successful")