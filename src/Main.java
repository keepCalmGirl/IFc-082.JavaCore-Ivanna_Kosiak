import Task1.Continents;
import Task2.Departments;
import Task2.Employee;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //по введеній країні визначити континент
       // System.out.println("Please, enter country");
        Scanner sc = new Scanner(System.in);
        /*String country = sc.next();
        Continents continent = Continents.NEVERLAND; //знаю що так не можна але по іншому не компілюється
        switch (country){
            case "Ukraine" : case "Poland" : case "Germany" : case "Great Britan" :
                continent = Continents.EUROPE; break;
            case "Peru" : case "Brasilia" : case "Argentina" :
                continent = Continents.SOUTH_AMERICA; break;
            case "USA" : case "Canada" : case "Mexico" :
                continent = Continents.NORTH_AMERICA; break;
            case "Kenya" : case "Libya" : case "Cameroon" :
                continent = Continents.AFRICA; break;
            case "Australia" : case "Fiji" : case "Samoa" : case "New Zeland" :
                continent = Continents.AUSTRALIA_AND_OCEANIA; break;
            case "China" : case "Korea" : case "Japan" : case "Thailand" :
                continent = Continents.ASIA; break;
            default:
                System.out.println("Даної країни немає в базі даних або не існує");
        }

        System.out.println(country + " is in " + continent);

        //операції над масивом цілих чисел
        int arr[] = {-8,5,69,-9,87,9,20,-87,46,13};
        int max = arr[0];
        int sumPositive = 0;
        int amountNeg = 0;
        int amountPos = 0;

        for (int i = 0; i < 10; i++){
            if (max < arr[i]) max = arr[i];
            if (arr[i] > 0){
                sumPositive += arr[i];
                amountPos++;
            } else
                amountNeg++;
        }

        System.out.println("\nThe biggest of numbers:\t" + max + "\nSum of positive numbers in array:\t" + sumPositive + "\nAmount of negative numbers in array:\t" + amountNeg + "\nAmount of positive numbers in array:\t" + amountPos);

        if (amountNeg > amountPos)
            System.out.println("Negative values are more");
        else if (amountNeg < amountPos)
            System.out.println("Positive values are more");
        else
            System.out.println("Amount of positive and negative value is equal");*/

        //вибірка, сортування і enum
        Employee employees[] = new Employee[5];
        employees[0] = new Employee("John Watson", Departments.CUSTOMER_SERVICE, 2500 );
        employees[1] = new Employee("Max Demian", Departments.IT, 3000);
        employees[2] = new Employee("Lee Dong Wook", Departments.RESEARCH_AND_DEVELOPMENT, 3200);
        employees[3] = new Employee("Natsume Takada", Departments.TECHNICAL_SUPPORT, 3500);
        employees[4] = new Employee("Janusz Novak", Departments.LOGISTICS, 2700);

        //з консолі імені департаменту і виведення працівників даного департаменту
        /*System.out.println("\nPlease, enter department in upper case");
        String dep = sc.next();
         for (int i = 0; i < 5; i++){
             if (employees[i].getDepartment().equals(dep)) {
                 System.out.println(employees[i].toString());
             }

         }*/

         //сортування по зарплатті бульбашкою за зростанням
        System.out.println("\nAscending bubble sort by field salary");
        int n = employees.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (employees[i].getSalary() > employees[k].getSalary()) {
                    Employee temp = new Employee();
                    temp = employees[i];
                    employees[i] = employees[k];
                    employees[k] = temp;
                }
            }
         }

         for (int i = 0; i < n; i++)
             System.out.println(employees[i].toString());

        System.out.println("\nDescending bubble sort by field salary");

        //сортування по зарплатті бульбашкою за спаданням
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (employees[i].getSalary() < employees[k].getSalary()) {
                    Employee temp = new Employee();
                    temp = employees[i];
                    employees[i] = employees[k];
                    employees[k] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++)
            System.out.println(employees[i].toString());
    }
  }

