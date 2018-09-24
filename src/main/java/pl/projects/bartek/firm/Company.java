package pl.projects.bartek.firm;

import java.util.LinkedList;
import java.util.List;

public class Company {

    private List<Employee> employees = new LinkedList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);


    }


    public  double sumOfSalary(){
double sum = 0;
        for (Employee employee : employees) {
            sum +=employee.calculateNetSalary();
        }


        return sum;


    }

    public double averageOfSalaries(){
        return sumOfSalary()/employees.size();




    }


}
