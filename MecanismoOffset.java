
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
    public MecanismoOffset(int num, int a)
    {
        // initialise instance variables
        super(num);
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
    public int encriptacion(){
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
    public int desencriptar(){
        int des = 0;
        if(encriptacion() < 10 ){
            des = encriptacion() - numeroA;
        }
        else{
            des = encriptacion() %10 - numeroA;
        }
        return des;
    }

    @Override
    public String toString(){
        String dato = "el numero A es: "+numeroA+ " el numeor encriptado es: "+encriptacion();
        return super.toString() +dato;
    }

}
