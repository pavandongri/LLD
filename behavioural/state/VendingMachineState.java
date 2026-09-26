package behavioural.state;

interface VendingMachineState {
    void insertAmount(int amount);
    void selectProduct(int productCode);
    void dispenseProduct();
    void getRefund();
}
