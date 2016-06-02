
/**
 * Write a description of class MecanismoSumatorioParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoSumatorioParcial extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int numeroA;

    /**
     * Constructor for objects of class MecanismoSumatorioParcial
     */
    public MecanismoSumatorioParcial(int num, int a)
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
    public int getNumeroA()
    {
        // put your code here
        return numeroA;
    }

    @Override
    public int encriptacion(){
        int numEncrip = 0;
        int result = 0;
        while(numeroA >= 1 && numeroA <= 9 ){
             if(getNumero() >= numeroA){
                result = getNumero() + getNumero() - 1;
                numEncrip = result + getNumero() - 2;
            }
            else{
                System.out.println("El numero no se puede encriptar");
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
