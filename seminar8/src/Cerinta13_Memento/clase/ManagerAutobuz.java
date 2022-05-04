package Cerinta13_Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
    private List<MementoAutobuz> listaMementoAutobuz;

    public ManagerAutobuz() {
        this.listaMementoAutobuz = new ArrayList<>();
    }

    public void adaugareMementoAutobuz(MementoAutobuz mementoAutobuz){
        listaMementoAutobuz.add(mementoAutobuz);
    }
    public MementoAutobuz getMemementoAutobuz(int index){
        return listaMementoAutobuz.get(index);
    }
}
