package pl.projects.bartek.firm;

public class Main {

    public static void main(String[] args) {


        Company company = new Company();
        Employee student = new Student(800.50);
        Employee fullTime = new FullTimeEmployee(1400.9);
        Employee temporary = new TemporaryEmployee(1200.34);

        company.addEmployee(student);
        company.addEmployee(fullTime);
        company.addEmployee(temporary);




        System.out.println(String.format("%.2f",company.sumOfSalary()));
        System.out.println(String.format("%.2f",company.averageOfSalaries()));
        System.out.printf("%.2f",company.averageOfSalaries());



    }
}
