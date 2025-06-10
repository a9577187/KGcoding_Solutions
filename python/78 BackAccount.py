class BankAccount:
    def __init__(self,accountNumber,accountHolderName,balance):
        self.__accountNumber=accountNumber
        self.__accountHolderName=accountHolderName
        self.__balance=balance
    def getCurrentBalance(self):
        return self.__balance
    def deposit(self,amount):
        if amount>0:
            self.__balance+=amount
            print("Deposit successful")
        else:
            print("Nice try")
    def withdraw(self,amount):
        if amount>self.__balance:
            print("Low balance")
        else:
            self.__balance-=amount
            print(f"Withdrawal of ${amount:.2f} successful")

acc = BankAccount("12345", "Alice Smith", 1000.00)

print(f"\nInitial balance: ${acc.getCurrentBalance():.2f}")

acc.deposit(200.50)
acc.deposit(-50)

acc.withdraw(150.75)
acc.withdraw(1500.00)
acc.withdraw(-100)

print(f"\nFinal balance: ${acc.getCurrentBalance():.2f}")