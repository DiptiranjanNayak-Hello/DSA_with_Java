package Assignment_ch18;

interface StringProcessor{
    int stringLength(String str);
}
public class Q1 {
    public static void main(String[] args) {
        StringProcessor sp = (str) -> {return str.length();};
        String str = "HelpMeNa";
        System.out.println("Length of string is: "+sp.stringLength(str));
    }
}
