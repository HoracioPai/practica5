/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
*/
public class Maint{
    /*
     *metodo main
     *@param args
    **/
    public static void maint(String [] args){
	Cuenta nombre0 = new Cuenta();
	//se imprime el titular mas dinero con un get 
	System.out.print("titular: " + nombre0.getTitular());
	System.out.print("dinero: " + nombre0.getDinerodisponible());

	Cuenta nombre1 =new Cuenta("Horacio");
	//se imprime el titular y cuenta 2 con un get
	System.out.print("titular: " + nombre1.getTitular());
	System.out.print("dinero: " + nombre1.getDinerodisponible());
	
    }
}
