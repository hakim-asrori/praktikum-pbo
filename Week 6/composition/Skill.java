package composition;

public class Skill {
    
    private String jenis;
    private int damage;

    public Skill(String jenis, int damage) {
        this.jenis = jenis;
        this.damage = damage;
    }

    public void giveDamage() {
        System.out.println("Damage yang diberikan sebesar : " + this.damage);
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }

}
