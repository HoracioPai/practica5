/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
*/
//utilizamos un scanner para que el usuario ingrese datos
import java.util.Scanner;
public class Condicionales {
    /*
     *metodo main
     *@param args
    **/
    public static void main(String[] args){
	//utilizamos el scanner para el arreglo de los numero de misma forma que @param de n1 y n2 son puestos
	Scanner in = new Scanner(System.in);
	System.out.print("Deme el nuemero 1: ");
	int n1 = in.nextInt();
	System.out.print("Dame el numero 2: ");
	int n2 = in.nextInt();
	//guardamos en un arreglo 
	if(n1 > n2){
	    //imprimimos el arreglo con las condiciones que puso el usuario
	    System.out.println("el numero con mayor valor es: " + n1);
	}else {
	    System.out.println("el numero con mayor valor es: " + n2);
	}
    }
}
