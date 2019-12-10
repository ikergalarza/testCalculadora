

import operaciones.MyDivision;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class MyDivisionTest {

    @Parameterized.Parameters
    public static List<Object[]> pruebas()
    {
        List<Object[]> o= new ArrayList<>();
        o.add(new Object[] {2,0});
        o.add(new Object[] {1,0});
        o.add(new Object[] {0,0});
        return o;
    }
    private  int n;
    private  int d;

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