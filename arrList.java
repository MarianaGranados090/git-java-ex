import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //array list
        //grow oe shrink depending on the items we add
        ArrayList<String> sal = new ArrayList<>();
        sal.add("Hello");
        sal.add("you!");
        //sal.remove(1);
        System.out.println(sal);
        sal.indexOf("Hello");
        sal.contains("Hello");
        System.out.println(sal.get(0));
        sal.set(1, "mark");
        sal.clear();
        System.out.println(sal);
        sal.clear();
    }
}
