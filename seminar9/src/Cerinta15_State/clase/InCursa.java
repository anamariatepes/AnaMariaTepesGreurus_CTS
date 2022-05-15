package Cerinta15_State.clase;

public class InCursa implements Stare{

    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatLinie){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" pleaca in cursa");
            autobuz.setStare(this);
        }else{
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" nu poate sa plece in cursa");
        }
    }
}
