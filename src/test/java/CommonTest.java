import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonTest {
    protected Random random = new Random();
    protected int inputElementsSize = 19;
    protected List<Integer> inputElements = new ArrayList<>();

    @BeforeEach
    public void setUp() {
        setInputElements();
    }

    private void setInputElements() {
        for (int i = 0; i < inputElementsSize; i++) {
            inputElements.add(getRandomElement());
        }
    }

    private Integer getRandomElement() {
        return random.nextInt(108); // From 0 to 107
    }
}