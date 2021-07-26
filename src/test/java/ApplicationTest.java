import com.diego.Application;
import com.diego.GestorDeCentros;
import com.diego.Main;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.logging.Logger;

import static org.testng.AssertJUnit.assertEquals;

public class ApplicationTest {
    @Test
    public void test1() throws FileNotFoundException {
        Application prueba = new Application();

        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream fips = new FileInputStream(new File("/home/diego/UTEC/is/examen-final-Dio12334/src/test/java/prueba.txt"));
        System.setIn(fips);

        assertEquals("correct", prueba.startMenu(new String[] {"hola", "aloh", "4"}));
        System.setIn(original);
    }
    @Test
    public void test2(){
        GestorDeCentros prueba = new GestorDeCentros();
        var inicio = System.currentTimeMillis();
        prueba.informacionConsolidada();
        var termino = System.currentTimeMillis();
        assert ((termino - inicio) <= 2000);
    }
    @Test
    public void test3() throws FileNotFoundException {

            String[] args = null;
            final InputStream original = System.in;
            final FileInputStream fips = new FileInputStream(new File("/home/diego/UTEC/is/examen-final-Dio12334/src/test/java/prueba.txt"));
            System.setIn(fips);
            Main.main(args);
            System.setIn(original);


    }
}
