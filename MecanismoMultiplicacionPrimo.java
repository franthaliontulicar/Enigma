
/**
 * Write a description of class MecanismoMultiplicacionPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int numeroPrimo;

    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoMultiplicacionPrimo(int primo)
    {
        // initialise instance variables
        super(5);
        numeroPrimo = primo;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getPrimo()
    {
        // put your code here
        return numeroPrimo;
    }
    
    @Override
    public int encripta(){
       return getNumero()* numeroPrimo;
    }
    
    @Override
    public int desencripta(){
       return encripta()/numeroPrimo;
    }
    
    @Override
    public String toString(){
       String dato = "el numero primo es: "+numeroPrimo+ " el numeor encriptado es: "+encripta();
       return super.toString() +dato;
    }
}
