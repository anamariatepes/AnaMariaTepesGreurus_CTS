package Cerinta9_Flyweigth.main;

import Cerinta9_Flyweigth.clase.Autobuz;
import Cerinta9_Flyweigth.clase.AutobuzLinie;
import Cerinta9_Flyweigth.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args){
        AutobuzLinie a1 = new Autobuz("model1", 2020,20);
        AutobuzLinie a2 = new Autobuz("model2", 2019,30);
        AutobuzLinie a3 = new Autobuz("model3", 2022,40);
        AutobuzLinie a4 = new Autobuz("model4", 2021,50);


        FlyweightFactory factory = new FlyweightFactory();

        a1.descrie(factory.getLinie(168));
        a2.descrie(factory.getLinie(226));
        a3.descrie(factory.getLinie(168));
        a4.descrie(factory.getLinie(137));
    }
}
