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
        System.out.println(makeAllFirstLetterUpper(str));

        //Enter in the console sentence of five words.
        //display the longest word in the sentence
        //determine the number of its letters
        //bring the second word in reverse order
        System.out.println("Please, enter sentence of five words");
        //Scanner sc = new Scanner(System.in);
        String fiveWordsStr = scanner.nextLine();
        String theLongestWord = getTheLongestWord(fiveWordsStr);
        System.out.println("The longest word is - " + theLongestWord + "\nthe number of its letters: " + theLongestWord.length());
        System.out.println("Second word in reverse - " + getSecondWordInReverse(fiveWordsStr));


    }
    public static String makeAllFirstLetterUpper(String str) {
        String tempArray[] = str.split(" ");
        int leng = tempArray.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < leng; i++) {
            char tempCh = Character.toUpperCase(tempArray[i].charAt(0));
            tempArray[i] = tempArray[i].replace(tempArray[i].charAt(0), tempCh);
            stringBuilder.append(tempArray[i]);
            stringBuilder.append(" ");
       }
       return stringBuilder.toString();
    }

    public static String getTheLongestWord(String str){
        String tempArray[] = str.split(" ");
        int max = tempArray[0].length();
        int index = 0;
        for (int i = 1; i < tempArray.length; i++){
            if (max < tempArray[i].length()) {
                max = tempArray[i].length();
                index = i;
            }
        }
        return tempArray[index];
    }

    public static String getSecondWordInReverse(String str){
        String tempArray[] = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder(tempArray[1]);
        return stringBuilder.reverse().toString();

    }
}
