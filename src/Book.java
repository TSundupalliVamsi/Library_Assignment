public class Book extends LibraryItem implements Barrowable{
    String author;
    String borrowedBy;
    public Book(String id, String title, String author) {
        super(id, title, true);
        this.author = author;
    }

    @Override
    public void borrowItem(String userId) throws BookNotAvailableException {
        if(!isAvailable){
            throw new BookNotAvailableException("Book '" + title + "' is already borrowed!");
        }
        this.isAvailable = false;
        this.borrowedBy = userId;
        System.out.println(userId + " borrowed the book: " + title);
    }

    @Override
    public void returnItem(String userId) throws InvalidReturnException {
        if (isAvailable || !userId.equals(borrowedBy)) {
            throw new InvalidReturnException("Invalid return attempt by user: " + userId);
        }
        this.isAvailable = true;
        this.borrowedBy = null;
        System.out.println(userId + " returned the book: " + title);
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}