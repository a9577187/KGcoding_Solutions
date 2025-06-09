class Student:
    def __init__(self,name, clas, rollno, marks):
        self.name=name
        self.clas=clas
        self.rollno=rollno
        self.marks=marks
    def __str__(self):
        return f"Student(Name: {self.name}, Class: {self.clas}, Roll No: {self.rollno}, Marks: {self.marks})"
s1=Student("ABC",9,101,85)
print(s1)