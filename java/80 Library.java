package code;
class LibraryItem{
	String itemID,title,author;
	boolean isCheckOut;

	public LibraryItem(String itemID, String title, String author) {
		this.itemID = itemID;
		this.title = title;
		this.author = author;
		this.isCheckOut=false;
	}
	void checkOut() {
		if(!this.isCheckOut) {
			this.isCheckOut=true;
			System.out.println("Checked out");
		}
		else {
			System.out.println("Already checked out");
		}
	}
	void returnItem() {
		if(this.isCheckOut) {
			this.isCheckOut=false;
			System.out.println("Returned");
		}
		else {
			System.out.println("Not checked out");
		}
	}
}
class Book extends LibraryItem{
	int ISBN;

	public Book(String itemID, String title, String author, int iSBN) {
		super(itemID, title, author);
		ISBN = iSBN;
	}
	
}
class DVD extends LibraryItem{
	int duration;

	public DVD(String itemID, String title, String author, int duration) {
		super(itemID, title, author);
		this.duration = duration;
	}
}
class Magazine extends LibraryItem{
	int issuenum;

	public Magazine(String itemID, String title, String author, int issuenum) {
		super(itemID, title, author);
		this.issuenum = issuenum;
	}
}
public class Test {
	public static void main(String[] args) {
		Book book1 = new Book("B001", "The Java Handbook", "John Doe", 978123456);
        DVD dvd1 = new DVD("D001", "Learning Java in 10 Hours", "Jane Smith", 600);
        Magazine mag1 = new Magazine("M001", "Tech Monthly", "Various", 105);

        book1.checkOut();
        book1.checkOut();

        dvd1.returnItem();
        dvd1.checkOut();
        dvd1.returnItem();
	}
}