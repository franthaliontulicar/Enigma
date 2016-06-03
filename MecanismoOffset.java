
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset( int num)
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
    public int encriptacion(int num){
        int encrip = 0;
        int index = 0;
        int result;
        while(num > 10){
            result = (num % 10) + getNumero();
            if(result >= 10)
                result = result % 10;
            encrip += result * (Math.pow(10, index));
            num = num / 10;
            index++;
        }
        encrip += num * (Math.pow(10, index));
        return encrip;
    }

    /**
     * 
     */
    @Override
    public int desencriptacion(int num){
        int des = 0;
        int index = 0;
        int result;
        while(num > 10){
            result = (num % 10) - getNumero() + 10;
            if(result >= 10)
                result = result % 10;
            des += result * (Math.pow(10, index));
            num = num / 10;
            index++;
        }
        des += num * (Math.pow(10, index));
        return des;
    }

   

}
