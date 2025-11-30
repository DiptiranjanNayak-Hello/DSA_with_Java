package Arrays_and_Genera;

import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random r = new Random();

        int x = r.nextInt(1, 7);
//        double y = r.nextDouble();
        boolean z = r.nextBoolean();

        System.out.println(z);

    }
}
