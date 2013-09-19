
/**
 * Abstract class Employee - A simple example of an abstract class and its usage.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/09
 */
public abstract class Employee
{
    private String name, address;
    private int age;
    public Employee(String name, String address, int age){
        System.out.println("Constructing on Employee");
        // this.(var) modifies the variable inside Employee class
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public double computePay(){
        System.out.println("Inside computePay");
        return 0.0;
    }
    public void mailCheck(){
        // Calls name and address from Employee.
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    public String toString(){
        return name + " " + address + " " + age;
    }

    // Accessor
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }

    // Mutator
    public void setAddress(String newAddress){
        address = newAddress;
    }
}
