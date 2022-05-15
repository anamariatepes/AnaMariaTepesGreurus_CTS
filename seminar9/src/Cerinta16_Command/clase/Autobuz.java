package Cerinta16_Command.clase;

public class Autobuz {
    String model;

    public Autobuz(String model) {
        this.model = model;
    }

    public void pleacaInCursa(int nrLinie){
        System.out.println("Autobuzul " + model + "a plecat pe linia " + nrLinie);
    }
}
