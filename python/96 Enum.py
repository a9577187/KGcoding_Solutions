from enum import Enum
class Day(Enum):
    MONDAY=1
    TUESDAY=2
    WEDNESDAY=3
    THRUSDAY=4
    FRIDAY=5
    SATURDAY=6
    SUNDAY=7

print(Day.MONDAY)
print(Day.MONDAY.value)
