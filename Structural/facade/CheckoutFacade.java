package Structural.facade;

public class CheckoutFacade {

    private final CartService cartService;
    private final InventoryService inventoryService;
    private final PricingService pricingService;
    private final PaymentService paymentService;
    private final OrderService orderService;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    // The client only needs to know the facade, so it wires up the
    // subsystem itself.
    public CheckoutFacade() {
        this.cartService = new CartService();
        this.inventoryService = new InventoryService();
        this.pricingService = new PricingService();
        this.paymentService = new PaymentService();
        this.orderService = new OrderService();
        this.shippingService = new ShippingService();
        this.notificationService = new NotificationService();
    }

    public boolean checkout() {

        // 1. Validate cart
        if (!cartService.validateCart()) {
            System.out.println("Checkout failed: Invalid cart");
            return false;
        }

        // 2. Reserve stock
        if (!inventoryService.reserveItems()) {
            System.out.println("Checkout failed: Items out of stock");
            return false;
        }

        // 3. Price it
        double total = pricingService.calculateTotal();

        // 4. Take the money, undoing the reservation if it fails
        if (!paymentService.processPayment(total)) {
            inventoryService.releaseItems();
            System.out.println("Checkout failed: Payment declined");
            return false;
        }

        // 5. Record the order
        int orderId = orderService.createOrder(total);

        // 6. Arrange shipping
        shippingService.arrangeShipping(orderId);

        // 7. Send confirmation
        notificationService.sendConfirmation(orderId);

        System.out.println("\nCheckout completed successfully!");
        return true;
    }
}
