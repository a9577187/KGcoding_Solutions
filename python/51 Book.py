class Book:
    totalBooks=10
    def __init__(self, title, author, isbn):
        self.title=title
        self.author=author
        self.isbn=isbn
        Book.totalBooks+=1
    
    def borrowBook(self):
        if Book.totalBooks==0:
            print("Books unavailable")
        else:
            Book.totalBooks-=1
            print("Borrow successful")

    def returnBook(self):
        Book.totalBooks+=1
        print("Return successful")
    
    @classmethod
    def getTotalBooks(cls):
        return cls.totalBooks

b1=Book("1984", "George Orwell", 12345)
b2=Book("Animal Farm", "George Orwell", 67890)
b1.borrowBook()
print(Book.getTotalBooks())