package pl.projects.bartek.firm;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(double grossSalary) {
        super(grossSalary);
    }

    @Override
    public double calculateNetSalary() {
        return (getGrossSalary()-1000)*0.8;
    }

    @Override
    public String getMail() {
        return null;
    }
}
