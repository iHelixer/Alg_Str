import java.util.Objects;

public class Queue<T> extends Stack<T> {
    private Node<T> last;

    @Override
    public void add(Node<T> node) {
        if (Objects.isNull(last)) {
            head = last = node;
        } else {
            last.setNext(node);
            last = node;
        }
        size++;
    }
}