import javax.swing.*;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        intro();

        String userAdjective1 = getUserInput("Enter an adjective:");
        String userPlace = getUserInput("Enter a place:");
        String userVerb = getUserInput("Enter a verb:");
        String userAdjective2 = getUserInput("Enter an adjective:");
        String userNoun = getUserInput("Enter a noun:");
        String userName = getUserInput("Enter a person's name:");

        printMadLib(userAdjective1,userPlace,userVerb,userAdjective2,userNoun,userName);

    }
    public static void intro() {
        System.out.println("The following madLib is based on a round of the game '5 words'");
    }

    public static void printMadLib(String adjective, String place, String verb, String adjective2, String noun, String name) {
        System.out.println("It is "+ adjective +" outside today");
        System.out.println("I think I'll go to the " + place);
        System.out.println("To " + verb + " some Costco samples");
        System.out.println("Because they're free and " + adjective2 +  ".");
        System.out.println("I go to get " + noun);
        System.out.println("But there is no more");
        System.out.println("Because " + name + " stole it");
    }
    public static String getUserInput(String prompt) {
        System.out.println(prompt);

        Scanner bob = new Scanner(System.in);
        String response = bob.nextLine();

        return response;
    }
}
