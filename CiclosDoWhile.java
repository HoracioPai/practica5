/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
*/
public class CiclosDoWhile{
    /*
     *metodo main
     * @param args
    **/
    public static void main(String[] args){
	/*
	 *@param de i del primer numero que sera asendente
	 *@param de j que sera el segund onumero asendente para una division 
	 *@param de pri donde se complementara la solucion del numero primo
*/
	int i = 1;
	int j = 2;
	boolean pri = true;
	//se guardan los arreglos de los datos anteriores
	do{
	    j=2;
	    pri = true;
	    do{
		if(i%j==0){
		    pri=false;
		    break;
		}
		j++;
		    }while(j<i);
	    if(pri){
		//se imprimen los arreglos de las condiciones de primos
		System.out.println(i + " ");
	    }
	    i++;
	}while(i<=1000);
 }
}
