package Cerinta11_Observer.main;

import Cerinta11_Observer.clase.Calator;
import Cerinta11_Observer.clase.ICalator;
import Cerinta11_Observer.clase.MijlocTransport;

public class Main {
    public static void main(String[] args){
        MijlocTransport m1 = new MijlocTransport(168);
        ICalator c1 = new Calator("Mihai");
        ICalator c2 = new Calator("Ana");
        ICalator c3 = new Calator("Elena");

        m1.adaugaCalator(c1);
        m1.adaugaCalator(c2);

        m1.trimiteMesajPlecareCapatLinie();

        m1.stergeCalator(c2);
        m1.adaugaCalator(c3);

        m1.trimiteMesajPlecareCapatLinie();


    }
}
