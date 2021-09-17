package contructor;

public class Hero {
    Senjata senjata;

    public Hero(Senjata senjata) {
        this.senjata = senjata;
    }

    public void showHero() {
        System.out.println("Objek hero ini senjatanya adalah " + this.senjata.showSenjata());
    }

    public static void main(String[] args) {
        Hero h1 = new Hero( new Senjata("Keris") );
        h1.showHero();

        Hero h2 = new Hero(new Senjata("Kujang"));
        h2.showHero();
    }
}
