
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    // instance variables - replace the example below with your own
  

    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public int encripta(Mecanismo mecanismo01, int num)
    {
        int result = -1;
        if(num > 10)
            result = mecanismo01.encripta();
        return result;
    }

    
    public int desencripta(Mecanismo mecanismo01, int num)
    {
        int result = mecanismo01.desencripta();
        if(result <= 10)
            result = -1;
        return result;
    }
}
