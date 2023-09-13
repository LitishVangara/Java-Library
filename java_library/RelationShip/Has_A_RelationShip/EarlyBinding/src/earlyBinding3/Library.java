package earlyBinding3;

public class Library {
	public int books;
	public Library() {}
	public Library(int books)
	{
		this.books = books;
	}
	Books b1 = new Books();
	public void use()
	{
		System.out.println("There are "+this.books+" books in the Library....");
		System.out.println("Use the Library to read the books....");
	}
}
