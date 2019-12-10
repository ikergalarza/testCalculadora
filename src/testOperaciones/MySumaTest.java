

import operaciones.MySuma;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
@RunWith(value = Parameterized.class)
public class MySumaTest {

    @Parameterized.Parameters
    public static List<Object[]> pruebas()
    {
        List<Object[]> o= new ArrayList<>();
        o.add(new Object[] {2,3,5});
        o.add(new Object[] {1,3,4});
        o.add(new Object[] {2,10,11});
        return o;
    }
    private  int m1;
    private  int m2;
    private  int esp;

    public MySumaTest(int m1, int m2, int esp) {
        this.m1 = m1;
        this.m2 = m2;
        this.esp = esp;
    }

    @Test
    public void testAdd()
    {
        int r= MySuma.suma(m1,m2);
        assertEquals(esp,r);
    }
}
