package Structural.facade;

class InventoryService {

    public boolean reserveItems() {
        System.out.println("Inventory: Reserving items...");
        return true;
    }

    public void releaseItems() {
        System.out.println("Inventory: Releasing reserved items...");
    }
}
