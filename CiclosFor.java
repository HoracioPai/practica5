/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
*/
//utilizamos un scanner para saver datos del usuario 
import java.util.Scanner;
public class CiclosFor {
    /*
     *metodo main
     *@param args
    **/
    public static void main(String[] args){
	Scanner leer = new Scanner(System.in);
	//@param de limite definido como un int
	int limite;
	//utilizamos un print para darle al usuario instrucciones de lo que pude ingresar
	System.out.print("ingresa un numero del 1 al 1000:");
	limite = leer.nextInt();
	//lo guardamos en un arreglo de condiciones for if
	for(int i=1;i<limite;i++){
	    int count=0;
	    for(int j=1;j<=i;j++){
		if(i%j==0)
		    count++;
	    }
	    if(count==2)
		//usamos un println para imprimir los datos del ususario en el arreglo 
		System.out.println(i);
	}	
    }
}
