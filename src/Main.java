

public class Main {

    public static void main(String[] args) {
        Employee employees[] = new Employee[3];
        employees[0] = new SalariedEmployee("Max Demian", 15.25, "078-05-1120", 75 );
        employees[1] = new ContractEmployee("Yamamoto Yasuhiro", 3000, "125-968-7748");
        employees[2] = new SalariedEmployee("Josh Mendez", 17.40, "014-521-6658", 64);

        int n = employees.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (employees[i].calculatePay() < employees[k].calculatePay()) {
                    Employee temp = new Employee();
                    temp = employees[i];
                    employees[i] = employees[k];
                    employees[k] = temp;
                }
            }

        }

        for (int i = 0; i < n; i++)
            System.out.println(employees[i].toString() + "monthly paiment = " + employees[i].calculatePay());

    }


}
