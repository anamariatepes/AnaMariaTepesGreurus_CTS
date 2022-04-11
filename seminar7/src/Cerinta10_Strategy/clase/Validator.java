package Cerinta10_Strategy.clase;

public class Validator {
    private float pret;
    ModPlata modPlata;

    public Validator(float pret) {
        this.pret = pret;
        this.modPlata = new CardSTB();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void validareCalatorie(){
        this.modPlata.plateste(this.pret);
    }
}
