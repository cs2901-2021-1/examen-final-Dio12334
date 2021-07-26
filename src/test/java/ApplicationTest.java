import com.diego.Application;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

import static org.testng.AssertJUnit.assertEquals;

public class ApplicationTest {
    @Test
    void test1(){
        Application prueba = new Application();

        String input = "add 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("5 dda", prueba.reverseString(input));
    }
}
