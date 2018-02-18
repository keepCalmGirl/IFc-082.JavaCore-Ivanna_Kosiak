package Task1;

import Task1.Employee;

public class Main {

    public static void main(String[] args) {
	Employee employee1 = new Employee("Jack Milton", 25, 40);
	Employee employee2 = new Employee("Stephany MacClean", 27, 75);
	Employee employee3 = new Employee("Yasuhito Tsubasa", 30, 47);

	    System.out.println("The total hours of all workers: " + Employee.getTotalHours());
    }
}
