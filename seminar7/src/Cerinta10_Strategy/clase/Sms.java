package Cerinta10_Strategy.clase;

public class Sms implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata a fost efectuata prin SMS si suma este" + suma);
    }
}
