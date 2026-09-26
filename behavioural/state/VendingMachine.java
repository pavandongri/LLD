package behavioural.state;

public class VendingMachine {
    // States hold no data of their own, so one instance of each is reused
    private final VendingMachineState selectProductState;
    private final VendingMachineState awaitingPaymentState;
    private final VendingMachineState productDispenseState;
    private final VendingMachineState refundState;

    private VendingMachineState state;
    private Product selectedProduct;
    private int balance;

    public VendingMachine() {
        this.selectProductState = new SelectProductState(this);
        this.awaitingPaymentState = new AwaitingPaymentState(this);
        this.productDispenseState = new ProductDispenseState(this);
        this.refundState = new RefundState(this);
        this.state = selectProductState;
    }

    // ---- actions available to the customer ----

    public void selectProduct(int productCode) {
        state.selectProduct(productCode);
    }

    public void insertAmount(int amount) {
        state.insertAmount(amount);
    }

    public void dispenseProduct() {
        state.dispenseProduct();
    }

    public void getRefund() {
        state.getRefund();
    }

    public void showMenu() {
        System.out.println("Available products:");
        for (Product product : Product.values()) {
            System.out.println(product);
        }
    }

    // ---- package-private: only states can change the machine ----

    void setState(VendingMachineState state) {
        this.state = state;
        System.out.println("  [state -> " + state + "]");
    }

    VendingMachineState getSelectProductState() {
        return selectProductState;
    }

    VendingMachineState getAwaitingPaymentState() {
        return awaitingPaymentState;
    }

    VendingMachineState getProductDispenseState() {
        return productDispenseState;
    }

    VendingMachineState getRefundState() {
        return refundState;
    }

    Product getSelectedProduct() {
        return selectedProduct;
    }

    void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    int getBalance() {
        return balance;
    }

    void addBalance(int amount) {
        this.balance += amount;
    }

    void deductBalance(int amount) {
        this.balance -= amount;
    }

    int returnBalance() {
        int amount = balance;
        balance = 0;
        return amount;
    }

    void reset() {
        selectedProduct = null;
        balance = 0;
        setState(selectProductState);
    }
}
