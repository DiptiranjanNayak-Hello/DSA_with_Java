package OOPs_2;

public class InnerClasses {

    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Dipti");
        Test b = new Test("Pritish");
    }
}
