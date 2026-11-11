public class Veterinaire extends Employe {

    public Veterinaire(String nom, String prenom, double salaire, String role) {
        super(nom, prenom, salaire, role);
    }

    @Override
    public String effectuerTache(Animal animal) {
        if (animal.getEtatSante() == EtatSante.SOIN_INTENSIF) {
            animal.setEtatSante(EtatSante.SOIN_LEGER);
            return animal.getNom() + " passe en soin leger.";
        }

        if (animal.getEtatSante() == EtatSante.SOIN_LEGER) {
            animal.setEtatSante(EtatSante.SAIN);
            return animal.getNom() + " passe en sain.";
        }

        return animal.getNom() + " est deja sain.";
    }



}
