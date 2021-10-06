package aggregation;

public class Hero {
    
    private Weapon weapon;
    private String nama;

    public Hero(String nama) {
        this.nama = nama;
    }

    public void takeWeapon(Weapon w) {
        this.weapon = w;
    }

    public void useWeapon(String hero) {
        System.out.println("Hero : " + hero);
        weapon.giveDamage();
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

}
