package Arrays_and_Genera;

public class printf_statement {
    public static void main(String[] args) {
//        String name = "Spongebob";
//        char firstletter = 'S';
//        int age = 30;
//        double height = 60.5;
//        boolean isEmployed = true;
//
//        // % - placeholder
//        // s - datatype/specifier
//        // , separate the var instead of + name
//        System.out.printf("Hello %s", name);
//        System.out.printf("Your name starts with a %c\n ", firstletter );
//        System.out.printf("You are %d years old\n", age);
//        System.out.printf("You are %f inches tall\n", height);
//        System.out.printf("Employed: %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old ", name, age);


        double p1 = 9.99;
        double p2 = 100.15;
        double p3 = -54.01;

        /*
        to limit the amount of digits displayed after a decimal can be done by
        adding .n between % and f
        n - number of digits you want to limit it to

        + = output a plus before positive numbers and - before negative ones
        , = comma grouping separator
        ( = negative numbers are enclosed by in ()
        space = display a minus if negative, space if positive

        0 = zero padding
        number = right justified padding
        negative number = left justified padding
         */

//        System.out.printf("%.1f\n", p1);
//        System.out.printf("%.3f\n", p2);
//        System.out.printf("%.2f\n", p3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d", id1);
    }
}
