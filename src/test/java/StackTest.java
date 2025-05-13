import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest extends CommonTest {

    @Test
    void pushStackSuccess() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < inputElements.size(); i++) {
            stack.add(new Node<>(inputElements.get(i)));
        }
        List<Integer> actual = stack.getElements();
        Collections.reverse(inputElements);
        assertThat(actual).isEqualTo(inputElements);
    }

    @Test
    void popSuccess() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < inputElements.size(); i++) {
            stack.add(new Node<>(inputElements.get(i)));
        }
        stack.pop();
        inputElements.remove(inputElements.size() - 1);
        List<Integer> actual = stack.getElements();
        Collections.reverse(inputElements);
        assertThat(actual).isEqualTo(inputElements);
    }
}