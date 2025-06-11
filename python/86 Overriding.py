class Vehicle:
    def service(self):
        print("Vehicle service")

class Car(Vehicle):
    def __init__(self,name):
        self.name=name
    def service(self):
        super().service()
        print(f"{self.name} service")

v1=Vehicle()
v1.service()
c1=Car("BMW")
c1.service()