import heapq
class Student:
    def __init__(self,name,grade):
        self.name=name
        self.grade=grade

    def __lt__(self, other):
        return self.grade < other.grade
    
    def __str__(self):
        return f"{self.name}({self.grade})"
pq=[]
heapq.heappush(pq, Student("Alice", 90))
heapq.heappush(pq, Student("Bob", 75))
heapq.heappush(pq, Student("Charlie", 85))
heapq.heappush(pq, Student("Dave", 95))

print("Priority Queue (by grade):")
while pq:
    print(heapq.heappop(pq))