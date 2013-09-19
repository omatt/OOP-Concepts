
/**
 * A simple execution of encapsulation using the "setter" method multiple times.
 * 
 * @author Reyes, Omar Matthew B.
 * @version 2013/09/08
 */
public class Calculator
{
    private int result;
    
    public int getResult(){
        return result;
    }
    
    public void calculate(int a, int b){
        result = a + b;
    }
}
