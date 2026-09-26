package behavioural.state;

public class RefundState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public RefundState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount(int amount) {
        System.out.println("Please collect your change first");
    }

    @Override
    public void selectProduct(int productCode) {
        System.out.println("Please collect your change first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product has already been dispensed");
    }

    @Override
    public void getRefund() {
        int amount = vendingMachine.returnBalance();
        System.out.println("Refunding " + amount + ", please collect it");
        vendingMachine.reset();
    }

    @Override
    public String toString() {
        return "Refund";
    }
}
