class Person:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    
    def __eq__(self, other):
        if other.name==self.name and other.age==self.age:
            return True
        else:
            False
    def __hash__(self):
        return hash(self.name,self.age)
    
p1=Person("ABC",70)
p2=Person("abc",70)
p3=Person("ABC",70)

print(f"p1 == p2: {p1 == p2}")
print(f"p1 == p3: {p1 == p3}")
print(f"p2 == p3: {p2 == p3}")