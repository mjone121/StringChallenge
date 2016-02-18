package P1;

import java.util.Scanner;

public class StringChallenge1 {

    public static void main(String[] john){
        String sentence;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter a sentence: ");
            sentence = input.nextLine();
            if (sentence.equals(""))
                break;

            // Split the sentence into words
            String[] tokens = sentence.split(" +");

            //Print each word
            for(String space:tokens) System.out.println(space);

            //Prints the number of words in each sentence
            System.out.println("Number of words: " + tokens.length);

            System.out.println("You entered " + sentence);

            System.out.println(isFirstCharacterCap(sentence) ? "First letter is a cap" :
                    "First letter is not a cap");

            System.out.println(isLastCharPunctuation(sentence) ? "Sentence does enter properly" :
                    "Sentence doesn't end properly");

        }while(!sentence.equals(""));

    }

    static boolean isFirstCharacterCap (String sent){
        return Character.isUpperCase(sent.charAt(0));
    }

    static boolean isLastCharPunctuation(String sent){
        // Try to match punctuations at the end of the sentence
        return sent.matches(".*[.!?]");
    }


}
