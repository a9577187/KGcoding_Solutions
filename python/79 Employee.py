class Employee:
    def __init__(self,name="ABC",age=25,salary=40000):
        self.__name=name
        self.__age=age
        self.__salary=salary

    def getAge(self):
        return self.__age
    
    def getName(self):
        return self.__name
    
    def getSalary(self):
        return self.__salary
    
    def setAge(self,age):
        self.__age=age

    def setName(self,name):
        self.__name=name

    def setSalary(self,salary):
        self.__salary=salary

    def displayDetails(self):
        print(f"Name = {self.__name} Age = {self.__age} Salary = {self.__salary}")

        
e1=Employee()
e1.displayDetails()