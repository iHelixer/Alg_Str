import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    protected Node<T> head;
    protected int size;

    public void add(Node<T> element) {
        element.setNext(head);
        head = element;
        size++;
    }

    public void pop() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }

    public List<T> getElements() {
        List<T> elements = new ArrayList<>();
        Node<T> temp = head;
        while (temp != null) {
            elements.add(temp.getElement());
            temp = temp.getNext();
        }
        return elements;
    }
}