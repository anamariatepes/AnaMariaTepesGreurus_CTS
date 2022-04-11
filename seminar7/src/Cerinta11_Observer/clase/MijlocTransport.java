package Cerinta11_Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private int nrLinie;
    private List<ICalator> lista;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.lista = new ArrayList<>();
    }

    public void adaugaCalator(ICalator calator){
        lista.add(calator);
    }
    public void stergeCalator(ICalator calator){
        lista.remove(calator);
    }
    public void trimiteMesaj(String mesaj){
        for( ICalator c : lista){
            c.primireMesaj(mesaj);
        }
    }
    public void trimiteMesajPlecareCapatLinie(){
        trimiteMesaj("Autobuzul numarul " + nrLinie + "am plecat de la capatul de linie");
    }

}
