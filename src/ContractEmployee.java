public class ContractEmployee extends Employee implements Payment {
    @Override
    public double calculatePay() {
        return fixedPaid;
    }

    private double fixedPaid;
    private String federalTaxIdMember;

    public ContractEmployee(String employed, double fixedPaid, String federalTaxIdMember) {
        super(employed);
        this.fixedPaid = fixedPaid;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getFixedPaid() {

        return fixedPaid;
    }

    public void setFixedPaid(double fixedPaid) {
        this.fixedPaid = fixedPaid;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public String toString() {
        return super.toString() + "ContractEmployee{" +
                "fixedPaid=" + fixedPaid +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'' +
                '}';
    }
}
