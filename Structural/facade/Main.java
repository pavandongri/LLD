package Structural.facade;

public class Main {
    public static void main(String[] args) {
        // The client knows only the facade: one call replaces seven
        // subsystem calls in the right order, with the rollback on failure.
        CheckoutFacade checkoutFacade = new CheckoutFacade();

        checkoutFacade.checkout();
    }
}
