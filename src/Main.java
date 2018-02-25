import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //practical tasks
	String str1 = "Max";
	String str2 = "Max Demian";
        System.out.println(str2.contains(str1));

        // changing the first letter of each word in the string to upper case
        System.out.println("Please, enter a sentence");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(PracticalTask.makeAllFirstLetterUpper(str));

        /*Enter in the console sentence of five words.
        - display the longest word in the sentence
        - determine the number of its letters
        - bring the second word in reverse order*/
        System.out.println("Please, enter sentence of five words");
        String fiveWordsStr = scanner.nextLine();
        String theLongestWord = PracticalTask.getTheLongestWord(fiveWordsStr);
        System.out.println("The longest word is - " + theLongestWord + "\nThe number of its letters is - " + theLongestWord.length());
        System.out.println("Second word in reverse is - " + PracticalTask.getSecondWordInReverse(fiveWordsStr));

        //Enter a sentence that contains the words between more than
        //one space. Convert all spaces, consecutive, one.
        System.out.println("\nPlease, enter a sentence that contains the words between more than one space");
        String string = scanner.nextLine();
        PracticalTask.deleteSpacesBetweenWords(string);

    }

}
