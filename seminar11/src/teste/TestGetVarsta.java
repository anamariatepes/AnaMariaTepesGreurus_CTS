package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGetVarsta {

    @Test
    public void testRightVarsta(){
        Persoana persoana = new Persoana("Alex", "1981212765876");
        assertEquals(23,persoana.getVarsta());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Alex", "3000101275876");
        assertEquals(222,persoana.getVarsta());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Alex", "6220101275876");
        assertEquals(0,persoana.getVarsta());
    }

    @Test(expected = CnpInvalidException.class)
    public void testErrorGetVarsta(){
        Persoana persoana = new Persoana("Alex", "6250101275876");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Alex", "6200101275876");
        persoana.getVarsta();
    }

    @Test
    public void testFormatVarsta(){
        Persoana persoana = new Persoana("Alex", "6210101275876");
        assertTrue(persoana.getVarsta()>= 0);
    }

    @Test
    public void testOrderVarsta(){
        Persoana persoana1 = new Persoana("Alex", "2980101275876");
        Persoana persoana2 = new Persoana("Alin", "6020101275876");

        assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistenceVarsta(){
        Persoana persoana = new Persoana("Alex", null);
        persoana.getVarsta();
    }

}
