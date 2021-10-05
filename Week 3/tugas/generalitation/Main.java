package generalitation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Batman batman = new Batman("Bruce Wayne", "Black Metal");
        Spiderman spiderman = new Spiderman("Tom Holland", "Black Spidey");

        batman.savePeople();
        batman.fight();
        batman.recoverPisau(10);
        batman.pisauShot(9);
        System.out.println("Sisa pisau " + batman.showSisaPisau() + " biji");

        System.out.println();

        spiderman.savePeople();
        spiderman.fight();
        spiderman.recoverJaring(8);
        spiderman.webShot(4);
        System.out.println("Sisa jaring " + spiderman.showSisaJaring()  + " biji");
    }
}
