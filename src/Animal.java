public abstract class Animal {

    private String nom;
    private int age;
    private EtatSante etatSante;

    public Animal(String nom, int age, EtatSante etatSante) {
        this.nom = nom;
        this.age = age;
        this.etatSante = etatSante;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EtatSante getEtatSante() {
        return etatSante;
    }

    public void setEtatSante(EtatSante etatSante) {
        this.etatSante = etatSante;
    }

    public abstract String bruit();

    public abstract String soinQuotidien();
}
