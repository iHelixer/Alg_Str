import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest extends CommonTest {

    @Test
    void pushQueueSuccess() {
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < inputElements.size(); i++) {
            queue.add(new Node<>(inputElements.get(i)));
        }
        List<Integer> actual = queue.getElements();
        assertThat(actual).isEqualTo(inputElements);
    }

    @Test
    void popQueueSuccess() {
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < inputElements.size(); i++) {
            queue.add(new Node<>(inputElements.get(i)));
        }
        queue.pop();
        inputElements.remove(0);
        List<Integer> actual = queue.getElements();
        assertThat(actual).isEqualTo(inputElements);
    }
}