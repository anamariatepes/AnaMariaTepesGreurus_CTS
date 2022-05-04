package Cerinta12_ChainOfResponsability.main;

import Cerinta12_ChainOfResponsability.clase.AutobuzHandler;
import Cerinta12_ChainOfResponsability.clase.MetrouHandler;
import Cerinta12_ChainOfResponsability.clase.TramvaiHandler;
import Cerinta12_ChainOfResponsability.clase.TroleibuzHandler;

public class Main {

    public static void main(String[] args){
        AutobuzHandler autobuz = new AutobuzHandler(5);
        TroleibuzHandler troleibuz = new TroleibuzHandler(3);
        TramvaiHandler tramvai = new TramvaiHandler(11);
        MetrouHandler metrou = new MetrouHandler(100);

        troleibuz.setHandler(autobuz);
        autobuz.setHandler(tramvai);
        tramvai.setHandler(metrou);

        troleibuz.afisareMijlocTransport(7);
        troleibuz.afisareMijlocTransport(20);
        troleibuz.afisareMijlocTransport(2);
        troleibuz.afisareMijlocTransport(4);

        //facem pt cazul in care nu avem metrou in acel oras
        AutobuzHandler aCluj = new AutobuzHandler(1000);
        TroleibuzHandler tCluj = new TroleibuzHandler(5);
        TramvaiHandler trCluj = new TramvaiHandler(2);

        trCluj.setHandler(tCluj);
        tCluj.setHandler(aCluj);

        trCluj.afisareMijlocTransport(1);
        trCluj.afisareMijlocTransport(3);
        trCluj.afisareMijlocTransport(10);

    }
}
