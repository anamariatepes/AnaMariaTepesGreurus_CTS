package Cerinta10_Strategy.clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata cu cardul bancar si suma este" + suma);
    }
}
