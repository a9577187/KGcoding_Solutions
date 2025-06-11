class Calculator:
    def add(self,*num1:int | float) -> int | float:
        sum=0
        for i in num1:
            sum+=i
        return sum

c1=Calculator()
print(c1.add(1,2))
print(c1.add(1,2,3))
print(c1.add(1.2,2.4))