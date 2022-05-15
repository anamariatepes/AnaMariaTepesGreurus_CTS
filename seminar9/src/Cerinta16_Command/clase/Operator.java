package Cerinta16_Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda>comenzi;

    public Operator() {
        comenzi=new ArrayList<>();
    }

    public void invoca(IComanda comanda){
        comenzi.add(comanda);
    }
    public void  executaComanda(){
        if(comenzi.size()>0) {
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }

}
