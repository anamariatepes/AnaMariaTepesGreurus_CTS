package Cerinta15_State.clase;

public class LaReparat implements Stare {
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatLinie){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" intra in service");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate fi trimis in service");
        }
    }
}
