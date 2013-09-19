
/**
 * Sample for Object Oriented Programming Concepts
 * 
 * Encapsulation
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/07
 */
public class EncapsulationSample{
    private String name;
    private String address;
    private int age;

    // Objects that allows private variables be accessed by other classes
    /** "Getter" methods or accessor **/
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }

    // Set variable values that can be accessed from other classes.
    /** "Setter" methods or mutator **/
    public void setName(String newName){
        name = newName;
    }  
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setAge(int newAge){
        age = newAge;
    }
}
