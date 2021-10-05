package flow;

public class FlowIf {
    
    public static void main(String[] args) {
        double celcius = -2;

        if(celcius < 50) {
            System.out.println("Panas");
        }
        if(celcius < 30) {
            System.out.println("Gerah");
        }
        if(celcius < 20) {
            System.out.println("Sejuk");
        }
        if(celcius < 10) {
            System.out.println("Dingin");
        }
        if(celcius < 0) {
            System.out.println("Beku");
        }
    }

}
