
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int numero;

    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int num)
    {
        // initialise instance variables
        numero = num;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumero()
    {
        // put your code here
        return numero;
    }
       
    public abstract int encriptacion(int num);
    
    public abstract int desencriptacion(int num);
    
    
    
 }
