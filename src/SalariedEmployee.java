public class SalariedEmployee extends Employee implements Payment {
    @Override
    public double calculatePay() {
        return hourlyRate * hours;
    }

    private double hourlyRate;
    private String socialSecurityNumber;
    private int hours;

    public SalariedEmployee(String employed, double hourlyRate, String socialSecurityNumber, int hours) {
        super(employed);
        this.hourlyRate = hourlyRate;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "SalariedEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hours=" + hours +
                '}';
    }
}
