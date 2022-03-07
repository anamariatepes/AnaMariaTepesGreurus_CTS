package ro.ase.csie.clase.ase.csie.clase;


public class IngrijitorZOO {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO(String nume) {
        this.nume = nume;
    }
    public void hranesteAnimal(Animal animal,String mancare){
        animal.mananca(mancare);
    }
}
