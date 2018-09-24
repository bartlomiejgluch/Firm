package pl.projects.bartek.firm;

public class Student extends Employee {

    private static final double TAX=0.95;

    public Student(double grossSalary) {
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
