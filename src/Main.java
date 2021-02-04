import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String []args)
    {
        int w = 0;
        char reponse = ' ',indice;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        double option;
        String str1, str2;

        do {//Main loop

            System.out.println("-------------------- HANGMAN GAME --------------------\n ");
            System.out.println("Ask one of your friend to type a word to guess :");
            str1 = sc1.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            do{
                do{
                    System.out.println("Clue : the word has " + str1.length() + " letters.");
                    System.out.println("Choose an action :\n 1 - Guess the word\n 2 - Know the position of one letter\n");
                    option = sc2.nextDouble();
                    // Message if no valid option
                    if (option != 1 && option != 2) {System.out.println("Error - no valid option");}
                } while (option != 1 && option != 2);

                // Guessing the word
                if (option == 1) {
                    System.out.println("Enter the word to guess :");
                    str2 = sc1.nextLine();
                    if (str1.toLowerCase().equals(str2.toLowerCase())) {
                        w = 1;
                        System.out.println("Nice job !!! " + str1.toUpperCase() + " was the word to guess.\n");}
                    else { System.out.println(str2.toUpperCase() + " was not the good word :(\n");}
                }

                // Knowing the position of a letter
                else if (option == 2) {
                    System.out.println("Enter the letter to know its hypothetical position :");
                    indice = sc1.nextLine().charAt(0);
                    int index = str1.indexOf(indice);
                    if(index == - 1) {
                        System.out.println("The letter " + indice + " is not part of the word.\n");
                    } else {
                        System.out.println("The letter " + indice + " is in the position number : " + (index+1) + "\n");
                    }
                }
            }while(w != 1);
            //Back to init
            do{
                System.out.println("Do you want to re-try ? (Y/N)");
                reponse = sc1.nextLine().charAt(0);
            }while(reponse != 'N' && reponse != 'Y');
        }while (reponse == 'Y');

        System.out.println("Good-bye !");

    }
}
