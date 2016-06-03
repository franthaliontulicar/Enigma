
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial( int num)
    {
        // initialise instance variables
        super(num);
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
    @Override
    public int encripta(int num){
        int result = 0;
        int sum = num;
        while( sum >= getNumero()){
            result += sum;
            sum--;
        }
        return result;
    }

    /**
     * 
     */
    @Override
    public int desencripta(int num){
        int result = 0;
        int divi = num - getNumero();
        int sum = 1;
        for(int i = 0; i <= divi; i++)
            sum += i;
        result = (num + sum)/ divi;
        return result;
    }

    
}
