public interface Payment {
    double calculatePay();
    default void doNothing(){}
}
