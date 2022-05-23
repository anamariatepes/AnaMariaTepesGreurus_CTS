package teste;


import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGetSex {
    //RIGHT BICEP
    @Test
    public void testRightM(){
        Persoana persoana = new Persoana("Mihnea", "1001211061524");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Mihnea", "1001211061524");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Ana", "6000908046251");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public  void testCrossCheck(){
        Persoana persoana = new Persoana("Florina", "6000908046251");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2 !=0 ? "M": "F", persoana.getSex());
    }

    @Test(expected = CnpInvalidException.class)
    public void testError(){
        Persoana persoana = new Persoana("Florina", "0000908046251");
        persoana.getSex();
    }

    @Test(expected = CnpInvalidException.class)
    public void testError2(){
        Persoana persoana = new Persoana("Florina", "L000908046251");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Florina", "6000908046251");
        persoana.getSex();

    }
    //CORRECT

    @Test
    public void testFormatGetSex(){
        Persoana persoana = new Persoana("Florina", "6000908046251");
        assertEquals(1,persoana.getSex().length());
    }

    @Test
    public void testRangeGetSex(){
        Persoana persoana = new Persoana("Florina", "7000908046251");
        assertEquals("N/A", persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void testExistenceGetSex(){
        Persoana persoana = new Persoana("Florina", null);
        persoana.getSex();

    }









}
