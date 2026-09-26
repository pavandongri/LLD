package behavioural.state;

public class SelectProductState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public SelectProductState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertAmount(int amount) {
        System.out.println("Money cannot be inserted now. First select a product");
    }

    @Override
    public void selectProduct(int productCode) {
        Product product = Product.fromCode(productCode);
        if (product == null) {
            System.out.println("Invalid product code " + productCode);
            vendingMachine.showMenu();
            return;
        }
        vendingMachine.setSelectedProduct(product);
        System.out.println("Selected " + product + ". Please insert money");
        vendingMachine.setState(vendingMachine.getAwaitingPaymentState());
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product cannot be dispensed now. First select a product");
    }

    @Override
    public void getRefund() {
        System.out.println("No refund without money entered. First select a product");
    }

    @Override
    public String toString() {
        return "SelectProduct";
    }
}
