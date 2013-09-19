
/**
 * Sample implementation of IS-A relationship.
 * Dog is a subclass of Mammal class.
 * 
 * @author Reyes, Omar Matthew B. 
 * @version 2013/09/19
 */
public class Dog extends Mammal{
   public static void main(String args[]){

      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
} 