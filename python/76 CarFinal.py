class Car:
    def __init__(self, noOfWheels, model, engineLiters):
        self._noOfWheels = noOfWheels
        self._model = model
        self._engineLiters = engineLiters

    @property
    def noOfWheels(self):
        return self._noOfWheels

    @property
    def model(self):
        return self._model

    @property
    def engineLiters(self):
        return self._engineLiters

c1 = Car(4, 2019, 6)
print(c1.noOfWheels)  # ✅ prints 4
c1.noOfWheels = 3     # ❌ AttributeError: can't set attribute
