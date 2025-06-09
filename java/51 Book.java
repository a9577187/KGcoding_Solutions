package code;
class Books{
	String title, author;
	int isbn;
	static int totalBooks=10;
	Books(String title,String author, int isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		totalBooks++;
	}
	void borrowBook() {
		totalBooks--;
		System.out.println("Borrow successful");
	}
	void returnBook() {
		totalBooks++;
		System.out.println("Return successful");
	}
	static int getTotalBooks() {
		return totalBooks;
	}
}
public class Test {
	public static void main(String[] args) {
		Books b1=new Books("1984", "George Orwell", 12345);
		Books b2=new Books("Animal Farm", "George Orwell", 67890);
		b1.borrowBook();
		System.out.print(Books.getTotalBooks());
	}
}
