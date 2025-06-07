class Course:
    maxCapacity=100
    @classmethod
    def setMaxCapacity(cls, capacity):
        cls.maxCapacity=capacity
        print(f"Updated capacity is {cls.maxCapacity}")
    
    def __init__(self,courseName):
        self.courseName=courseName
        self.enrolledStudents=[]
    
    def enrollStudents(self, name):
        if len(self.enrolledStudents)>=Course.maxCapacity:
            print(f"Cannot enroll {name}. Max capacity reached for {self.courseName}.")
        elif name in self.enrolledStudents:
            print(f"{name} is already enrolled in {self.courseName}.")
        else:
            self.enrolledStudents.append(name)
            print(f"Student {name} enrolled successfully in {self.courseName}.")
        
    def unenrollStudents(self, name):
        if name not in self.enrolledStudents:
            print(f"{name} is not enrolled in {self.courseName}.")
        else:
            self.enrolledStudents.remove(name)
            print(f"Student {name} has been unenrolled from {self.courseName}.")
c1=Course("Abc")
c1.enrollStudents("Xyz")
Course.setMaxCapacity(1)
c1.enrollStudents("XYZ")