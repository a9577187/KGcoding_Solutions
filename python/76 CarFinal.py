from typing import Final
class Car:
    def __init__(self,noOfWheels,model,engineLiters):
        self.noOfWheels:Final=noOfWheels
        self.model:Final=model
        self.engineLiters:Final=engineLiters

c1=Car(4,2019,6)
print(c1.noOfWheels)     # ✅ prints 4
c1.noOfWheels = 3        # ❗ allowed at runtime (but a static checker would flag it)
print(c1.noOfWheels)     # ✅ prints 3
