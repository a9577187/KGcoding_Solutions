from com_example_geometry.geo import Circle
import math
def circleArea(c1 ):
    return math.pi*c1.radius**2
radius=int(input("Enter radius: "))
c1=Circle(radius)
print(f"Area of circle is {circleArea(c1)}")