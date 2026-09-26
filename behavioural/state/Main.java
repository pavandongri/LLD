package behavioural.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.showMenu();

        System.out.println("\n=== Invalid actions before selecting ===");
        machine.dispenseProduct();
        machine.getRefund();
        machine.insertAmount(400);
        machine.selectProduct(9);

        System.out.println("\n=== Pay in parts, get change back ===");
        machine.selectProduct(2);
        machine.selectProduct(1);
        machine.insertAmount(100);
        machine.dispenseProduct();
        machine.insertAmount(200);
        machine.insertAmount(50);
        machine.dispenseProduct();
        machine.selectProduct(1);
        machine.getRefund();

        System.out.println("\n=== Exact amount, no refund step needed ===");
        machine.selectProduct(1);
        machine.insertAmount(150);
        machine.dispenseProduct();

        System.out.println("\n=== Cancel after inserting money ===");
        machine.selectProduct(3);
        machine.insertAmount(100);
        machine.getRefund();
    }
}
