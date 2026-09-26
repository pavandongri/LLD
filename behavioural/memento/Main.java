package behavioural.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.write("Hello ");
        editor.write("Pavan ");

        editor.display();
        editor.undo();

        editor.write("kumar ");
        editor.display();
    }
}
