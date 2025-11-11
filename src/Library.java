import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, LibraryItem> items = new HashMap<>();

    public void addItem(LibraryItem item) {
        items.put(item.id, item);
    }

    public LibraryItem findItemById(String id) {
        return items.get(id);
    }

    public void displayAllItems() {
        System.out.println("Library Items:");
        for (LibraryItem item : items.values()) {
            item.displayInfo();
        }
    }
}
