
/**
 * Abstract class Employee - A simple example of an abstract class and its usage.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/09
 */
public class RunAbstract
{
    public static void main(String [] args){
        Salary sal = new Salary ("Omar Mathew", "Pasig City", 20, 500.00);
        Employee emp = new Salary ("C-Ann", "Quezon City", 21, 450.00);
        
        System.out.println("Call mailCheck using Salary reference-- ");
        sal.mailCheck();
        
        System.out.println("\nCall mailCheck using Employee reference-- ");
        emp.mailCheck();
    }
}
