package unit1;

import java.io.PrintStream;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String input = sc.nextLine();
        PrintStream printf = System.out.printf("You entered %s", input);
    }
}
