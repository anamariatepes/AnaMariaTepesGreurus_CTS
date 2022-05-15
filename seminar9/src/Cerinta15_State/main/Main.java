package Cerinta15_State.main;

import Cerinta15_State.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(300);
        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.ajungeCapatLinie();
        autobuz.pleacaInCursa();
        autobuz.intraInService();
        autobuz.pleacaInCursa();
    }
}
