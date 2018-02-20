public class Main {

    public static void main(String[] args) {
        //practical tasks
	String str1 = "Max";
	String str2 = "Max Demian";
        System.out.println(str2.contains(str1));

        System.out.println(makeAllFirstLetterUpper("Come here and help yourself"));

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
