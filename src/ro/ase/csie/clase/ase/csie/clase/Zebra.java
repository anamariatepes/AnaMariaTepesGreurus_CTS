package ro.ase.csie.clase.ase.csie.clase;

public class Zebra extends Animal{
    public Zebra(String nume) {
        super(nume);
    }

    @Override
    public void mananca(String mancare) {
        System.out.println("Zebra "+this.getNume()+" mananca "+mancare);
    }
}
