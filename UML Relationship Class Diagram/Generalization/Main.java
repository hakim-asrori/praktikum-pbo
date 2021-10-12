package Generalization;

public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee("Hakim Asrori", 20);

        em1.setJabatan("Dosen");
        em1.showPerson();
        em1.showEmployee();

        System.out.println();

        Person p1 = new Person("Sahrul", 18);
        p1.showPerson();
    }
}
