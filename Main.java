public class Main {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();
        shoppingFacade.placeOrder(1, "123 Main St");
        shoppingFacade.placeOrder(2, "456 Oak St");
    }
}
