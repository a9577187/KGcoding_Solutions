from abc import ABC, abstractmethod
import math
class Shape(ABC):
    def __init__(self,colour):
        super().__init__()
        self.colour=colour

    @abstractmethod
    def calculateArea(self):
        pass

    def __str__(self):
        return f"Colour is {self.colour}"
    
class Circle(Shape):
    def __init__(self,radius, colour="red"):
        super().__init__(colour)
        self.radius=radius
    
    def calculateArea(self):
        return math.pi*self.radius**2

class Square(Shape):
    def __init__(self,side, colour="black"):
        super().__init__(colour)
        self.side=side
    
    def calculateArea(self):
        return self.side**2
    
circle1 = Circle(5, "blue")
square1 = Square(10)
circle2 = Circle(2)

print(f"Area of {circle1.__class__.__name__}: {circle1.calculateArea():.2f}")
print(f"Area of {square1.__class__.__name__}: {square1.calculateArea():.2f}")
print(f"Area of {circle2.__class__.__name__}: {circle2.calculateArea():.2f}")