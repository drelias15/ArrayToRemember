import java.util.Scanner;

public class ArraytoRemember {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] president = new String[10];

        System.out.println("Please type in the names of the last ten presidents in the order they were elected. ");
        String answer = keyboard.nextLine();
        while (!answer.equalsIgnoreCase("history")) {
            for (int i = 0; i < president.length; i++) {

                president[i] = keyboard.nextLine();
            }
            for (int i = 9; i >= 0; i--) {
                System.out.println(president[i]);
            }
            System.out.println("Thank you.");
        }

//            System.out.println("You have entered the the list. Type history to see them listed starting from the recent one");
//            String answer = keyboard.nextLine();
        // if(answer.equalsIgnoreCase("history")){


    }
}