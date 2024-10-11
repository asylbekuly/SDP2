public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        productCatalog = new ProductCatalog();
        paymentProcessor = new PaymentProcessor();
        inventoryManager = new InventoryManager();
        shippingService = new ShippingService();
    }

    public void placeOrder(int productId, String address) {
        Product product = productCatalog.selectProduct(productId);

        if (!inventoryManager.checkStock(productId)) {
            System.out.println("Product out of stock!");
            return;
        }

        double shippingCost = shippingService.calculateShippingCost(address);
        double totalAmount = product.getPrice() + shippingCost;

        if (!paymentProcessor.processPayment(totalAmount)) {
            System.out.println("Payment failed. Please try again.");
            return;
        }

        inventoryManager.updateStock(productId);
        shippingService.shipProduct(productId);

        System.out.println("Order placed successfully for " + product + "!");
    }
}
