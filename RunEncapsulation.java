
/**
 * Sample for Object Oriented Programming Concepts
 * 
 * Encapsulation
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/07
 */
public class RunEncapsulation{
    public static void main(String [] args){
        EncapsulationSample encap = new EncapsulationSample();
        encap.setName("Omar");
        encap.setAddress("Quezon City");
        encap.setAge(20);

        System.out.println("Name: " + encap.getName() + "\nAddress: "
        + encap.getAddress()+"\nAge: "+encap.getAge());
    }
}
