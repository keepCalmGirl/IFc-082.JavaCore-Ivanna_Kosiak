import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year;
        boolean isLeap;
        System.out.println("Введіть рік");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0))
            isLeap = true;
        else
            isLeap = false;

        System.out.println("Year is leap - " + isLeap);
    }
}
