package aggregation;

public class Weapon {
    
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
        
    }

    public void giveDamage() {
        System.out.println("Damage yang diberikan sebesar : " + this.damage);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

}
