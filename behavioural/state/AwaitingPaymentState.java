package behavioural.state;

public class AwaitingPaymentState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public AwaitingPaymentState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount(int amount) {
        vendingMachine.addBalance(amount);
        int price = vendingMachine.getSelectedProduct().getPrice();
        int balance = vendingMachine.getBalance();
        System.out.println("Amount " + amount + " has been entered. Total: " + balance);

        if (balance >= price) {
            System.out.println("Payment complete. Product can be dispensed now");
            vendingMachine.setState(vendingMachine.getProductDispenseState());
        } else {
            System.out.println("Please insert " + (price - balance) + " more");
        }
    }

    @Override
    public void selectProduct(int productCode) {
        System.out.println("You have already selected a product. Request a refund to cancel");
    }

    @Override
    public void dispenseProduct() {
        int remaining = vendingMachine.getSelectedProduct().getPrice() - vendingMachine.getBalance();
        System.out.println("Product cannot be dispensed now. Insert " + remaining + " more");
    }

    @Override
    public void getRefund() {
        int amount = vendingMachine.returnBalance();
        System.out.println("Order cancelled. Refunding " + amount);
        vendingMachine.reset();
    }

    @Override
    public String toString() {
        return "AwaitingPayment";
    }
}
