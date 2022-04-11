package Cerinta9_Flyweigth.clase;

public class Autobuz implements AutobuzLinie{
    private String modelAutobuz;
    private int an;
    private int nrLocuri;

    public Autobuz(String modelAutobuz, int an, int nrLocuri) {
        this.modelAutobuz = modelAutobuz;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", an=").append(an);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descrie(Linie linie) {
        System.out.println(this.toString()+ " "+ linie.toString());
    }

}

