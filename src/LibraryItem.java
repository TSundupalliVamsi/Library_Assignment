public abstract class LibraryItem {
    String id;
    String title;
    boolean isAvailable = false;

    abstract void displayInfo();

    LibraryItem(String id, String title, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }
}
