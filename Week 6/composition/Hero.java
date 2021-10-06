package composition;

public class Hero {
    
    private String nama;
    private Skill skill;

    public Hero(String nama, String jenis, int damage) {
        this.nama = nama;
        skill = new Skill(jenis, damage);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void attack() {
        System.out.println("Nama hero : " + this.nama);
        System.out.println("Jenis hero : " + skill.getJenis());
        skill.giveDamage();
    }

}
