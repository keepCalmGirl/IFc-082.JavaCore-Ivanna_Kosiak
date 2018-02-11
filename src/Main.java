import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Введіть радіус в сантиметрах");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();

        double per = 2*Math.PI*rad;
        double area = Math.PI*rad*rad;

        System.out.println("Perimeter of flower bed in cm is: " + per + "\nArea of flower bed in cm is: " + area);*/

        String name;
        int age;
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.next();

        System.out.println("How old are you?");
        age = sc.nextInt();

        System.out.println("The person's name is: " + name + "\nThe person's age is: " + age);

    }
}
