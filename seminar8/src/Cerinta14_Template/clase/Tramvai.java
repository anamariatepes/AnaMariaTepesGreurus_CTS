package Cerinta14_Template.clase;

public class Tramvai extends MijlocTransportPeSine{

    @Override
    protected void oprireStatieUnu() {
        System.out.println("Tramvaiul a ajuns in statia 1");

    }

    @Override
    protected void oprireStatieDoi() {
        System.out.println("Tramvaiul a ajuns in statia 2");

    }

    @Override
    protected void oprireStatieTrei() {
        System.out.println("Tramvaiul a ajuns in statia 3");

    }
}
