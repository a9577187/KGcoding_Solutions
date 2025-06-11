from abc import ABC, abstractmethod
class Flyable(ABC):
    @abstractmethod
    def fly(self):
        pass

class Bird(Flyable,ABC):
    def __init__(self,sound="ki...ki...ki..."):
        self.sound=sound

    '''By re-declaring fly as @abstractmethod again within Bird (and not providing an implementation), 
    you are essentially saying: "Yes, Bird still has an abstract fly method, 
    and it must still be implemented by any concrete subclass of Bird."'''
    @abstractmethod
    def fly(self):
        pass

class Eagle(Bird):
    def __init__(self,speed, sound="ki...ki...ki..."):
        super().__init__(sound)
        self.speed=speed

    def fly(self):
        print(f"Eagle flies at {self.speed}")

eagle = Eagle(100)
eagle.fly()
print(f"Eagle sound: {eagle.sound}")