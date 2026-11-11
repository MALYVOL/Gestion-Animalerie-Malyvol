public class Chat extends Animal {

    public Chat(String nom, int age, EtatSante etatSante) {
        super(nom, age, etatSante);
    }

    @Override
    public String bruit() {
        return "Meow";
    }

    @Override
    public String soinQuotidien() {
        return "Brosser le chat";
    }
}
