from enum import Enum
class Day(Enum):
    MONDAY=1
    TUESDAY=2
    WEDNESDAY=3
    THRUSDAY=4
    FRIDAY=5
    SATURDAY=6
    SUNDAY=7
    def isWeekEnd(self):
        if self.value ==6 or self.value==7:
            print(f"{self.name} is Weekend")
        else:
            print(f"{self.name} is Weekday")

for day in list(Day):
    print(day.name, day.value)
    day.isWeekEnd()

