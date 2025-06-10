class LibrartItem:
    def __init__(self,itemId,title,author):
        self.itemId=itemId
        self.title=title
        self.author=author
        self.isCheckedOut = False

    def checkOut(self):
        if not self.isCheckedOut:
            self.isCheckedOut = True
            print(f"'{self.title}' (ID: {self.itemId}) has been checked out.")
        else:
            print(f"'{self.title}' (ID: {self.itemId}) is already checked out.")

    def returnItem(self):
        if self.isCheckedOut:
            self.isCheckedOut = False
            print(f"'{self.title}' (ID: {self.itemId}) has been returned.")
        else:
            print(f"'{self.title}' (ID: {self.itemId}) was not checked out.")
    
class DVD(LibrartItem):
    def __init__(self, itemId, title, author,duration):
        super().__init__(itemId, title, author)
        self.duration=duration

class Magazine(LibrartItem):
    def __init__(self, itemId, title, author,issueNum):
        super().__init__(itemId, title, author)
        self.issueNum=issueNum

class Book(LibrartItem):
    def __init__(self, itemId, title, author,isbnNum):
        super().__init__(itemId, title, author)
        self.isbnNum=isbnNum

b1 = Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565")
m1 = Magazine("M001", "National Geographic", "Various", "July 2025")
dvd1 = DVD("D001", "Inception", "Christopher Nolan", 148)

b1.checkOut()
b1.checkOut()
m1.checkOut()
dvd1.returnItem()

print(f"Book '{b1.title}' checked out: {b1.isCheckedOut}")
print(f"Magazine '{m1.title}' checked out: {m1.isCheckedOut}")
print(f"DVD '{dvd1.title}' checked out: {dvd1.isCheckedOut}")

b1.returnItem()
m1.returnItem()

print(f"Book '{b1.title}' checked out: {b1.isCheckedOut}")
print(f"Magazine '{m1.title}' checked out: {m1.isCheckedOut}")