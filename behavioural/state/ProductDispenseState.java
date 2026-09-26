package behavioural.state;

public class ProductDispenseState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public ProductDispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount(int amount) {
        System.out.println("Cannot insert money now. It's already paid");
    }

    @Override
    public void selectProduct(int productCode) {
        System.out.println("You have already selected a product");
    }

    @Override
    public void dispenseProduct() {
        Product product = vendingMachine.getSelectedProduct();
        vendingMachine.deductBalance(product.getPrice());
        System.out.println("Dispensing " + product + ", please collect it");

        // Only wait for a refund when change is actually owed
        if (vendingMachine.getBalance() > 0) {
            System.out.println("Please collect your change of " + vendingMachine.getBalance());
            vendingMachine.setState(vendingMachine.getRefundState());
        } else {
            vendingMachine.reset();
        }
    }

    @Override
    public void getRefund() {
        int amount = vendingMachine.returnBalance();
        System.out.println("Order cancelled. Refunding " + amount);
        vendingMachine.reset();
    }

    @Override
    public String toString() {
        return "ProductDispense";
    }
}
