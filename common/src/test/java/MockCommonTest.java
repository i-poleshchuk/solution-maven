import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MockCommonTest {

    CommonApp commonApp = new CommonApp();

    @Test
    public void mockTest() {
        Long res = 5L;
        assertEquals(res, commonApp.count);
    }
}
