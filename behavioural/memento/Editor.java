package behavioural.memento;

public class Editor {
    private String value;
    private History history;

    public Editor() {
        this.value = "";
        this.history = new History();
    }

    public void write(String s) {
        this.value += s;
        history.push(new EditorMemento(this.value));
    }

    public void undo() {
        this.value = this.history.pop().getValue();
    }

    public void display() {
        System.out.println("Editor word = " + value);
    }
}
