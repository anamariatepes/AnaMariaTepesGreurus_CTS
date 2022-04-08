package Cerinta1;

public class TroleibuzFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
