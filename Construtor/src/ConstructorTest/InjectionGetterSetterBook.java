package ConstructorTest;

public class InjectionGetterSetterBook {

	public static void main(String[] args) {		
        Book book = new Book();
        
        book.setIsbn("978-0134685991");
        book.setTitle("Effective Java");
        book.setAuthor("Joshua Bloch");
        book.setPrice(45.99);
        book.setPublisher("Addison-Wesley");      
     
        System.out.println("ISBN      : " + book.getIsbn());
        System.out.println("Title     : " + book.getTitle());
        System.out.println("Author    : " + book.getAuthor());
        System.out.println("Price     : $" + book.getPrice());
        System.out.println("Publisher : " + book.getPublisher());

	}
}
class Book {
	 private String Isbn;
	    private String publisher;
	    private String Title;
	    private String author;
	    private double price;
	public void setIsbn(String Isbnno) {
		this.Isbn = Isbnno;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public void setPublisher(String publisher) {
        this.publisher = publisher;
    }   
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
	public String getIsbn() {
		return this.Isbn;
	}
	public String getTitle() {
		return this.Title;
	}
	public String getPublisher() {
        return publisher;
    }
  
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}
