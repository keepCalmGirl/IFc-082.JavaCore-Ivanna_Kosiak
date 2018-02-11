import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введіть радіус в сантиметрах");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();

        double per = 2*Math.PI*rad;
        double area = Math.PI*rad*rad;

        System.out.println("Perimeter of flower bed in cm is: " + per + "\nArea of flower bed in cm is: " + area);

    }
}
