package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica matematica;
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @Before
    public void creeazaObiectMatematica(){
        this.matematica = Matematica.getInstantaMatematica();
    }

    @Test
    public void testSingleton(){
        Matematica m = Matematica.getInstantaMatematica();
        assertSame(matematica, m);
    }

    @Test
    public void testSumaCorecta(){

        assertEquals(8,matematica.suma(3,5));
    }
    @Test
    public void testSumaNumereIdentice(){

        int nr= 3;
        assertEquals(6,matematica.suma(nr,nr));
    }
    @Test
    public void testRaportCorect(){
        assertEquals(2,matematica.raport(4,2),0.01);
    }

    @Test
    public void testRaportCuRezultatNumarReal(){
        assertEquals(2.5, matematica.raport(5,2), 0.01);
    }

    @Test
    public void testRaportShouldThrowException(){
        try{
            matematica.raport(56,0);
            fail("Metoda raportv nu arunca exceptie");
        }catch(IllegalArgumentException exceptie){

        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRaportThrowException(){
        matematica.raport(49,0);
    }

    @Test
    public void testVerificaPar(){
        assertTrue(matematica.estePar(2));
        assertFalse(matematica.estePar(3));
        assertTrue(matematica.estePar(0));
        assertFalse(matematica.estePar(-3));
        assertTrue(matematica.estePar(-2));
    }

    @Test
    public void returneazaListNrPare(){
        assertEquals(4,matematica.nNumerePare(4).size());
    }

    @Test
    public void testListaNumere(){
        List<Integer> lista =  matematica.nNumerePare(4);
        for(int i=0; i<4; i++){
           // assertTrue(lista.get(i)%2==0);
            assertTrue(matematica.estePar(lista.get(i)));
        }

    }

    @Test
    public void testListNula(){
        assertNull(matematica.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListaNrNegative(){
        matematica.nNumerePare(-3);
    }

    @Test
    public void testListaNrCrescatoare(){
        List<Integer> lista = matematica.nNumerePare(4);
        for( int i= 0; i<lista.size()-1; i++){
            assertTrue(lista.get(i)< lista.get(i+1));
        }
    }

}