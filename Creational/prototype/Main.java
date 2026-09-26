package Creational.prototype;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Character character1 = new Character("Hero", 1, 100, List.of("Sword", "Potion"));
        character1.setHealth(90);
        character1.showCharacterInfo();

        // clone copies the configured state without re-running the setup
        Character character2 = character1.clone();
        character2.setName("Villain");
        character2.setLevel(2);
        character2.addItem("Shield");
        character2.showCharacterInfo();

        // the point of the deep copy: "Shield" landed only on the clone
        System.out.println("Original after mutating the clone:");
        character1.showCharacterInfo();

        System.out.println("Separate list instances? " + (character1.getInventory() != character2.getInventory()));
    }
}
