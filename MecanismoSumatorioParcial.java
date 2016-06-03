
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
        int encrip = 0;
        int sum = num;
        while( sum >= getNumero()){
           encrip += sum;
            sum--;
        }
        return encrip;
    }

    /**
     * 
     */
    @Override
    public int desencripta(int num){
        int sum = getNumero();
        int encrip = num;
        while(sum < encrip){
            encrip -= sum;
            sum++;
        }
        return encrip;
    }

    
}
