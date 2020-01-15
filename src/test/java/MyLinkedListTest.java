import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MyLinkedListTest {
    @Test
    public void createTest() {
        List<String> myLinkedList = new MyLinkedList<>();
        assertThat(myLinkedList).isNotNull();
    }
}