/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
 **/
public class CiclosWhile{
    /*
     *metodo principal
     *@param args
    **/
    public static void main(String[] args){
	/*
	 *@param de i
*@param de div
*@param de j
para los valores que tendremos de la operacion
*/
	int i = 1;
	int div;
	int j;
	//arreglos de condiciones while
	while (i<=1000){
	    div=0;
	    j=2;
	    while(j<=i/2){
		if(i%j==0){
		    div++;
		    break;
		}
		j++;
	    }
	    if(div ==0 && i !=1){
		//imprimimos los parametros segun los datos que teniamos antes en los parametros
		System.out.print(i + " ");
	    }
	    i++;
	}
    }
}
