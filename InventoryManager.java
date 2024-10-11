public class InventoryManager {
    public boolean checkStock(int productId) {
        // Mock implementation to check stock availability
        return productId % 2 == 0;  // Assume even product IDs are in stock
    }

    public void updateStock(int productId) {
        // Mock implementation to reduce stock
        System.out.println("Stock updated for product " + productId + ".");
    }
}
