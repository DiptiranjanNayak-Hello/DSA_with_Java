package Arrays_and_Genera;

import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ënter a day: ");
        String day = sc.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("It's Sunday");
                break;
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Wednesday":
                System.out.println("It's Wednesday");
                break;
            case "Thursday":
                System.out.println("It's Thursday");
                break;
            case "Friday":
                System.out.println("It's Friday");
                break;
            case "Saturday":
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("Can you try capitalizing the day of the week you are writing?");
        }

    }

}
