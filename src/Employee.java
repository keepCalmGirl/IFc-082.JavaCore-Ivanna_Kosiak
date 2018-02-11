public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalHours;

    public Employee (){}

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours += hours;
    }

    public double salary (int rate, int hours){
        return rate*hours;
    }

    @Override
    public String toString() {
        return "Emlpoyee [Name = " + name + ", rate = " + rate + ", hours = " + hours + "]";
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static int getTotalHours() {
        return totalHours;
    }

    public double bonuses (int percent){
        return percent*rate*hours/100;
    }
}
