package behavioural.memento;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> mementos;

    public History() {
        this.mementos = new Stack<>();
    }

    public void push(EditorMemento memento) {
        this.mementos.push(memento);
    }

    public EditorMemento pop() {
        if (!this.mementos.isEmpty())
            this.mementos.pop();

        if (!this.mementos.isEmpty()) {
            return this.mementos.pop();
        }

        return new EditorMemento("");
    }
}
