
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int numeroA;

    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset( int a)
    {
        // initialise instance variables
        super(5);
        numeroA = a;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getNumA()
    {
        // put your code here
        return numeroA;
    }

    @Override
    public int encripta(){
        int numEncrip = 0;
        int result = 0;
        while(numeroA >= 1 && numeroA <= 9 ){
            if(getNumero() < 10){
               result = getNumero() + numeroA;     
               numEncrip = result;
            }
            else{
               result = (getNumero()/10) + numeroA;
               if(result > 10){
                   numEncrip = result % 10 +numeroA;
               }
              
            }
        }
        return numEncrip;
    }

    @Override
    public int desencripta(){
        int des = 0;
        if(encripta() < 10 ){
            des = encripta() - numeroA;
        }
        else{
            des = encripta() %10 - numeroA;
        }
        return des;
    }

    @Override
    public String toString(){
        String dato = "el numero A es: "+numeroA+ " el numeor encriptado es: "+encripta();
        return super.toString() +dato;
    }

}
