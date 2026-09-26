package behavioural.memento;

public class EditorMemento {
    private String value;

    public EditorMemento(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
