package testOperaciones;

import operaciones.myOperaciones;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class testMyOperaciones {

    private static int m1;
    private static int m2;

    @Before
    public void setUp() throws Exception
    {
        m1=0;
        m2=1;
    }

    @After
    public void tearDown() throws Exception
    {
        // En este caso no hay nada que "limpiar"
    }

    @Test
    public void test()
    {
        // Manera 1 de chequear excepciones
        try
        {
            myOperaciones.division(m1,m2);
            fail();
            //si no salta la excepcion no habremos encontrado el error
        } catch (Exception e)
        {

        }
    }
}
