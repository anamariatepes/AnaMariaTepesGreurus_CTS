package Cerinta10_Strategy.main;

import Cerinta10_Strategy.clase.CardBancar;
import Cerinta10_Strategy.clase.Validator;

public class Main {
    public static void main(String[] args){
        Validator validator = new Validator (10);
        validator.validareCalatorie();
        validator.setModPlata(new CardBancar());
        validator.validareCalatorie();

    }
}
