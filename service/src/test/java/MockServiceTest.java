import org.junit.jupiter.api.Test;
import org.poleshchuk.service.ServiceApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockServiceTest {

    private final ServiceApp serviceApp = new ServiceApp();

    @Test
    public void mockTest() {
        assertEquals("12345", serviceApp.num);
    }
}
