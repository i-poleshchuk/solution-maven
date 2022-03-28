import org.junit.jupiter.api.Test;
import org.poleshchuk.common.CommonApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockCommonTest {

    private final CommonApp commonApp = new CommonApp();

    @Test
    public void mockTest() {
        Long actual = 5L;
        assertEquals(actual, commonApp.count);
    }
}
