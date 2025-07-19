package unit1;
//Write a quiz program with five true-or-false questions.
// Display a question to the user, and ask the user to enter either true or false,
// then move on to the next question. At the end of the quiz display the user’s score.
//Use three arrays, a String array for holding the questions, a boolean array for the
// answers, and another boolean array for the user’s answers.

import java.util.Scanner;

public class ex2 {
    static Scanner scanner = new Scanner(System.in);
    static String quest[] = {"Humans have two eyes", "Octopus have one heart only", "There are 40 days in december"};
    static Boolean CorrectAnsw[] = {true, false, false};
    static Boolean UserAnsw[] = new Boolean[3];

    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Answer these true or false questions: ");
        for(int i = 0; i < 3; i++)
        {
            System.out.println(quest[i]);
            System.out.print("Your answer: ");
            UserAnsw[i] = scanner.nextBoolean();
            if(UserAnsw[i].equals(CorrectAnsw[i]))
            {
                counter++;
            }

        }
        System.out.println("Your score is "+counter+" out of 3");
    }
}
