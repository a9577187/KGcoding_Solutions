class Employee:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def __str__(self):
        return f"Employee(name='{self.name}', salary={self.salary})"

employees = [
    Employee("Prashant", 100),
    Employee("Sanchit", 1000),
    Employee("Ram", 10000),
    Employee("Shyam", 1),
    Employee("Mohan", 5)
]

sorted_employees = sorted(employees, key=lambda e: e.salary)

for emp in sorted_employees:
    print(emp)
