package Arrays_and_Genera;

public class arrays {
    public static void main(String[] args) {
//        String[] cars = {"Camaro", "Subaru", "Dodge", "Porsche"};
//
//        cars[0] = "Mustang";
//        System.out.println(cars[2]);

        String[] cars = new String[5];

        cars[0] = "Camaro";
        cars[1] = "Subaru";
        cars[2] = "Dodge";
        cars[3] = "Mustang";
        cars[4] = "Porsche";

//        System.out.println(cars[2]);

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");
        }
    }
}
