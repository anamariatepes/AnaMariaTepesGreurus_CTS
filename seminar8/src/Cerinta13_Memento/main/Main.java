package Cerinta13_Memento.main;

import Cerinta13_Memento.clase.Autobuz;
import Cerinta13_Memento.clase.ManagerAutobuz;

public class Main {
    public static void main(String[] args){
        Autobuz a = new Autobuz("Gigel", 6, 2003, "Otokar");

        ManagerAutobuz managerAutobuz = new ManagerAutobuz();
        managerAutobuz.adaugareMementoAutobuz(a.createMementoAutobuz());

        a.setNumeSofer("Doru");
        managerAutobuz.adaugareMementoAutobuz(a.createMementoAutobuz());

        a.setConsumMediu(8);
        managerAutobuz.adaugareMementoAutobuz(a.createMementoAutobuz());
        System.out.println(a);

        a.setMementoAutobuz(managerAutobuz.getMemementoAutobuz(0));
        System.out.println(a);

    }
}
