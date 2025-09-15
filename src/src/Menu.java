import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
    }

    public MenuItem searchItem(String name) {
        // Search for menu item with given name
        for (MenuItem item : this.menuItems) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void displayMenu() {

        for (MenuItem item : this.menuItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}