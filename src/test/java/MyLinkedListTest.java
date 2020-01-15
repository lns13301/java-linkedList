import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MyLinkedListTest {
    private List<String> myLinkedList = new MyLinkedList<>();

    @Test
    public void createTest() {
        assertThat(myLinkedList).isNotNull();
    }

    @Test
    public void sizeTest() {
        assertThat(myLinkedList.size()).isEqualTo(0);
    }

    @Test public void emptyTest() {
        assertThat(myLinkedList.isEmpty()).isTrue();
    }
}