package Cerinta14_Template.clase;

public abstract class MijlocTransportPeSine {
    protected  abstract void oprireStatieUnu();
    protected abstract void oprireStatieDoi();
    protected abstract void oprireStatieTrei();
//le am declarat final pt ca nimeni sa nu poata modifica traseul
    public final void parcurgereTraseu(){
        oprireStatieUnu();
        oprireStatieDoi();
        oprireStatieTrei();
    }
    public final void parcurgereTraseuInvers(){
        oprireStatieTrei();
        oprireStatieDoi();
        oprireStatieUnu();
    }


}
