package Cerinta10_Strategy.clase;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata cu cardul STB si suma este" + suma);
    }
}
