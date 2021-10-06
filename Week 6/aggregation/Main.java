package aggregation;

public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("Spiderman");
        Hero h2 = new Hero("Batman");

        Weapon w1 = new Weapon(100);
        Weapon w2 = new Weapon(150);

        h1.takeWeapon(w1);
        h2.takeWeapon(w2);

        h1.useWeapon(h1.getNama());

        System.out.println();
        
        h2.useWeapon(h2.getNama());
    }
}
