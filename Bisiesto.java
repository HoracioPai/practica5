/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
 **/
//utilizamos un scanner para obtener datos del usuario 
import java.util.Scanner;
public class Bisiesto {
    /*
     *metodo main
     *@param args
     **/
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	//utilizamos un print para que el ususario sepa que valores poner 
	System.out.print("Escriba año que desea saber si es bisiesto:");
	int año = in.nextInt();
	//guardamos el arreglo con la condicional if else
	if((año % 4 == 0) && (año % 100 != 0 || año % 400 == 0)) {
	    System.out.println(año + " si es un año bisiesto");
	}else {
	    //usamos un println para dar los valores del usuario atravez del arreglo
	    System.out.println(año + " no es un año bisiesto");
	    
	}

    }

}
