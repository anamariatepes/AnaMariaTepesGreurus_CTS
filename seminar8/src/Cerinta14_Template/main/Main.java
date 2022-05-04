package Cerinta14_Template.main;

import Cerinta14_Template.clase.MijlocTransportPeSine;
import Cerinta14_Template.clase.Tramvai;

public class Main {
    public static void main(String[] args){
        MijlocTransportPeSine mijlocTransportPeSine = new Tramvai();
        mijlocTransportPeSine.parcurgereTraseu();
        mijlocTransportPeSine.parcurgereTraseuInvers();


        //mijlocTransportPeSine.oprireStatieDoi();
    }
}
