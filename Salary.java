
/**
 * Abstract class Employee - A simple example of an abstract class and its usage.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/09
 */
public class Salary extends Employee
{
    private double salary;
    public Salary(String name, String address, int age, double salary){
        super(name, address, age);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Within mailcheck of Salary class.");
        // We don't have to instantiate to access getName() from Employee 
        // since we are inheriting the Employee class
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }
}
