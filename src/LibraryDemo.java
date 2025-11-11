public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("1", "Java", "James Gosling");
        Book b2 = new Book("2", "Spring Boot", "Craig Walls");
        Book b3 = new Book("3", "Java Script", "Tim berners lee");


        library.addItem(b1);
        library.addItem(b2);
        library.addItem(b3);

        library.displayAllItems();

        System.out.println("--- Borrowing and Returning ---");
        try {
            b1.borrowItem("user123");
            b1.borrowItem("user456");
            b1.returnItem("user456");
            b1.returnItem("user123");
        } catch (BookNotAvailableException | InvalidReturnException e) {
            System.out.println("Exception: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Exception " + e.getMessage());
        }

        library.displayAllItems();

    }
}
