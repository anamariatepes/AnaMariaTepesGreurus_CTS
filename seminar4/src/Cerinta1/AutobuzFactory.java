package Cerinta1;

public class AutobuzFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
