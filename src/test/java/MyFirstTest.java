import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {

    @Test
    public void testJava21() {
        System.out.println("Hello Java 21! JUnit 5 配置成功！");
        assertEquals(4, 2 + 2);
    }
}