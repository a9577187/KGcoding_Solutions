import math
class Circle:
    def __init__(self,radius):
        self.radius=radius

    def getCircumference(self):
        return 2*math.pi*self.radius
    
    def getArea(self):
        return math.pi*self.radius*radius
    
    def __str__(self):
        return f"Circle(Radius={self.radius}, Area={self.getArea()}, Circumference={self.getCircumference()})"
    

radius=int(input("Enter radius: "))
c1=Circle(radius)
print(c1)
