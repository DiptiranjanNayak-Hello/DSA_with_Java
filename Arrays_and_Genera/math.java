package Arrays_and_Genera;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
//        double x = 3.14;
//        double y = -19;
//
//        double z = Math.max(x, y);
//        double a = Math.min(x, y);
//        double b = Math.abs(x);
//        double c = Math.sqrt(y);
//        double d = Math.ceil(x);
//        double e = Math.round(x);
//        System.out.println(c);

        Scanner sc = new Scanner(System.in);

        double z;

        System.out.println("Enter the height of the triangle: ");
        double x = sc.nextDouble();

        System.out.println("Enter the base of the triangle: ");
        double y = sc.nextDouble();

        z = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        double area = Math.sqrt((x*x)+(y*y));

        System.out.println(z);
        System.out.println(area);

        sc.close();
    }
}
