public class Motor {
    int cc = 250;
    String merk = "Honda";

    public void melaju() {
        System.out.println("Motor dengan merk " + this.merk + " melaju dengan cepat");
    }
    
    public void mengerem() {
        System.out.println("Motor dengan cc " + this.cc + " mengerem secara mendadak");
    }

    public static void main(String[] args) {
        Motor mtr = new Motor();

        System.out.println();
        
        mtr.melaju();
        System.out.println();
        
        mtr.mengerem();
        System.out.println();
    }
}
