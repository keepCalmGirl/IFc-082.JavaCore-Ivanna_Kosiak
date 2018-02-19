public class Employee implements Payment{
    private String employed;

    public Employee() {
    }

    public Employee(String employed) {
        this.employed = employed;
    }

    public String getEmployed() {
        return employed;
    }

    public void setEmployed(String employed) {
        this.employed = employed;
    }


    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employed='" + employed + '\'' +
                '}';
    }
}
