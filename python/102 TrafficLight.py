import threading
import time
from enum import Enum

class TrafficColor(Enum):
    RED = 9
    YELLOW = 1
    GREEN = 3

class TrafficLightThread(threading.Thread):
    def __init__(self, color):
        super().__init__()
        self.color = color

    def run(self):
        print(f"{self.color.name} active")
        time.sleep(self.color.value)
        print(f"{self.color.name} inactive")


green = TrafficLightThread(TrafficColor.GREEN)
yellow = TrafficLightThread(TrafficColor.YELLOW)
red = TrafficLightThread(TrafficColor.RED)

green.start()
green.join()

yellow.start()
yellow.join()

red.start()
