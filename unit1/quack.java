package unit1;

public class quack {
    public static void main(String[] args) {
        //Write a program which prints numbers from 1 to 40. After every third number, print “Quack.”.
        for(int i=1; i < 41; i++)
        {
            System.out.println(i);
            if(i % 3 == 0){
                System.out.println(i + "Quack");
            }
        }
    }
}
