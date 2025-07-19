package unit1;

public class methodstest1 {
    public static void main(String[] args) {
        int var;
        String hel = " hello";
        var = 5;
        int newnum = bar();
        foo(var, hel);
        System.out.println(newnum+5);

    }

    public static void foo(int a, String c) {
        System.out.println(a + c);
    }
    public static int bar()
    {
        return 58;
    }
}
