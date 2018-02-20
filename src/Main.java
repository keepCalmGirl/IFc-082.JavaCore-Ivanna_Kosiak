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
        String str = scanner.next();
        System.out.println(makeAllFirstLetterUpper(str));

    }
    public static String makeAllFirstLetterUpper(String str) {
        String tempArray[] = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tempArray.length; i++) {
            char tempCh = Character.toUpperCase(tempArray[i].charAt(0));
            tempArray[i] = tempArray[i].replace(tempArray[i].charAt(0), tempCh);
            stringBuilder.append(tempArray[i]);
            stringBuilder.append(" ");
       }
       return stringBuilder.toString();
    }
}
