package variable;

public class NarrowingCasting {
    public static void main(String[] args) {
        double phiDouble = 3.14;
        int phiInt = (int) phiDouble;

        System.out.println("phi double : " + phiDouble);
        System.out.println("phi int : " + phiInt);
    }
}
