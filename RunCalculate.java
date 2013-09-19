
/**
 * A simple execution of encapsulation using the "setter" method multiple times.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/08
 */
public class RunCalculate{
    public static void main(String [] args){
        int x = 2,y = 3;
        Calculator calc = new Calculator();
        calc.calculate(x,y);
        System.out.println("Sum of " + x + " and " + y + " is "+calc.getResult());

        x = 4;
        y = 3;
        calc.calculate(x,y);
        System.out.println("Sum of " + x + " and " + y + " is "+calc.getResult());
    }
}
