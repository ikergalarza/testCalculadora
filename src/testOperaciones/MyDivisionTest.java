

import operaciones.MyDivision;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Vamos a utilizar un runner particular (Parameterized). Que irá directo a donde esté la anotación @Parame...
 */
@RunWith(value = Parameterized.class)
public class MyDivisionTest {
    /**
     * Necesitamos algo iterable. (List de tipo Object)
     * Cuando ejecutemos la prueba con el runner (Parameterized) va a buscar la anotación @Parameterized...
     * @return retornamos una lista en la que hay arrays de objetos.
     */
    @Parameterized.Parameters
    public static List<Object[]> pruebas()
    {
        List<Object[]> o= new ArrayList<>();
        /**
         * Al hacer estos nos fijamos en cómo hemos configurado el constructor.
         */
        o.add(new Object[] {2,0});
        o.add(new Object[] {1,0});
        o.add(new Object[] {0,0});
        return o;
    }
    private  int n;
    private  int d;
/**
 * Creamos el constructor que va a ser llamado por el propio JUnit.
 */
    public MyDivisionTest(int m1, int m2) {
        this.n = m1;
        this.d = m2;

    }

    @Test
    public void division() {
        try{
            MyDivision.division(n, d);
            fail();
        }
        catch (Exception e)
        {

        }
    }

}