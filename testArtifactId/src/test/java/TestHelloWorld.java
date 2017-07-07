import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Elena.Dubkova on 07.07.2017.
 */
public class TestHelloWorld {
    @Test
    public void testGetGreeting() throws Exception {
    assertEquals("Hello,user",helloWorld.getGreeting("user"));
    }
}
