import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MockServiceTest {

    ServiceApp serviceApp = new ServiceApp();

    @Test
    public void mockTest() {
        assertEquals("12345", serviceApp.num);
    }
}
