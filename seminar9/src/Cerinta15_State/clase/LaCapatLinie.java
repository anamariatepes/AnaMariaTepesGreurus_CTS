package Cerinta15_State.clase;

public class LaCapatLinie implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if(! (autobuz.getStare() instanceof LaCapatLinie)){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este la capat de linie");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+"  este deja la capat de linie");
        }

    }
}
