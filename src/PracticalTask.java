public class PracticalTask {
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
