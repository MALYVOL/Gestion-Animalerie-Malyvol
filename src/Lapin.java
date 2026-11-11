public class Lapin extends Animal {

    public Lapin(String nom, int age, EtatSante etatSante) {
        super(nom, age, etatSante);
    }

    @Override
    public String bruit() {
        return "Couinement";
    }

    @Override
    public String soinQuotidien() {
        return "Nettoyer la cage du lapin";
    }
}
