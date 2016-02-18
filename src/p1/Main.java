package p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;

        do{
            System.out.print("Type a sentence: ");
            sentence = input.nextLine();
            System.out.println("You entered:\n" + sentence);

            String[] tokens = sentence.split(" +"); //the plus means one or more spaces, rather than splitting on each
            //one when multiple spaces are entered

            for (String each : tokens) {
                System.out.println(each);
            }

            System.out.println("Number of words: " + tokens.length);

            System.out.println(isFirstCharCapital(sentence) ?
                    "Starts with a capital letter" :
                    "Does not start with a capital letter ");
            System.out.println(isLastCharPunctuation(sentence) ?
                    "Ends with a punctuation mark" :
                    "Doesn't end with a punctuation mark");
        } while (!sentence.equals(""));
    }

    static boolean isFirstCharCapital(String arg){
        //checks the first letter in the sentence to see if it is capital for purposes of confirming an actual sentence
        return Character.isUpperCase(arg.charAt(0));

    }
    static boolean isLastCharPunctuation(String arg){
        return arg.matches(".*[.?!]"); //could be [a-z] [0-9], ascii ranges
    }
}
