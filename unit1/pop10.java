package unit1;

public class pop10 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for(int i=0;i<20;i++)
        {
            numbers[i] = i+1;
        }
        for(int i=0;i<20; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
