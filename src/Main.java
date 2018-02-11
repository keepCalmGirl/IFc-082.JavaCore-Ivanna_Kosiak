import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //leap year
        /*int year;
        boolean isLeap;
        System.out.println("Введіть рік");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0))
            isLeap = true;
        else
            isLeap = false;

        System.out.println("Year is leap - " + isLeap);*/

        //asterisk pyramid
        /*int number;
        System.out.println("Введіть непарне число");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int num = (int)(number/2);
        for (int i = 0; i < number+1;){
            for(int j = 0; j < num; j++) System.out.print(" ");
            for (int k = 0; k < i+1; k++) System.out.print("*");
            System.out.println("");
            num--;
            i+=2;
        }*/

        //sum of the series 1+11+111+1111 + .. n terms.
        int num;
        System.out.println("Input the number of terms ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sum = 0;
        String one = "1";
        for (int i = 0; i < num; i++){
            int j = Integer.parseInt(one);
            sum += j;
            one = one + 1;
        }

        System.out.println("The sum is: " + sum);
    }
}
