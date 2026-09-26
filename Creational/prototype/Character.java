package Creational.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Character implements CharacterPrototype<Character> {
    private String name;
    private int level;
    private int health;
    private List<String> inventory; // mutable reference: the field that makes copying interesting

    public Character(String name, int level, int health) {
        this(name, level, health, new ArrayList<>());
    }

    public Character(String name, int level, int health, List<String> inventory) {
        this.name = name;
        this.level = level;
        this.health = health;
        // defensive copy: we never store a list the caller still holds a reference to
        this.inventory = new ArrayList<>(inventory);
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getHealth() {
        return this.health;
    }

    public List<String> getInventory() {
        // hand out a read-only view, otherwise callers could mutate our list from outside
        return Collections.unmodifiableList(this.inventory);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addItem(String item) {
        this.inventory.add(item);
    }

    public void showCharacterInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Health: " + this.health);
        System.out.println("Inventory: " + this.inventory);
        System.out.println("=======");
    }

    @Override
    public Character clone() {
        // Deep copy. The constructor copies the list, so the clone owns its own
        // inventory. Assigning this.inventory straight across instead would be a
        // shallow copy: both characters would share one list, and adding an item
        // to either would show up on both.
        return new Character(this.name, this.level, this.health, this.inventory);
    }
}
