package unit1;

public class staticmeth {
    //static is used to indicate that a field, method or
    //block belongs to the class itself, rather than to
    //instances. It is shared among all instances of a class
    //there is only one copy of the variable
    static int x = 6;
    public static void main(String[] args) {
        System.out.println(x);
    }

    public static void foo(int x)
    {
        System.out.println(x);
    }
}
