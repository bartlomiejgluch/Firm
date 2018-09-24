package pl.projects.bartek.firm;

public abstract class Employee implements Person {

    private double grossSalary;

    public Employee(double grossSalary) {
        this.grossSalary = grossSalary;
    }


    public double getGrossSalary() {
        return grossSalary;
    }

    public  abstract double calculateNetSalary();
}
