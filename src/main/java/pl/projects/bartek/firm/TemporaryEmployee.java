package pl.projects.bartek.firm;

public class TemporaryEmployee extends Employee {

    private static final double TAX=0.9;

    public TemporaryEmployee(double grossSalary) {
        super(grossSalary);
    }


    @Override
    public double calculateNetSalary() {
        return getGrossSalary()*TAX;
    }

    @Override
    public String getMail() {
        return null;
    }
}
