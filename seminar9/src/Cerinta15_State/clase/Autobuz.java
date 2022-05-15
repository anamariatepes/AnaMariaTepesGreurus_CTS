package Cerinta15_State.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz( int nrAutobuz) {
        this.stare = new LaCapatLinie();
        this.nrAutobuz = nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }
    public void pleacaInCursa(){
        InCursa stareInCursa=new InCursa();
        stareInCursa.doAction(this);

    }
    public void intraInService(){
        LaReparat stareInService=new LaReparat();
        stareInService.doAction(this);

    }
    public void ieseDinService(){
        LaCapatLinie stareLaCapatDeLinie=new LaCapatLinie();
        stareLaCapatDeLinie.doAction(this);

    }
    public void ajungeCapatLinie(){
        LaCapatLinie stareLaCapatDeLinie=new LaCapatLinie();
        stareLaCapatDeLinie.doAction(this);

    }
}
