/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
*/
public class Cilindro {
    /*
     *metodo main
     *@pram args
     **/
    public static void main(String[] args){
	//utilizamos un print para mostrar los valores iniciales del cilindro
	System.out.print("Radio de cilindro: 10");
	System.out.print("Altura de cilindro: 20");
	// @param v,e,r,pi,z,a y b que representaran las formulas para el area y volumen
	double v, e, r, pi, z, x, a, b;

	pi = 3.1416;
	a = 10;
	b = 20;
	r = a*a;
	x = pi*2;
	z = a*b;
	

	v = pi*r*b;
	e = x*z;
	//se usa un print out para ver el resultado de las ecuaciones 
	System.out.println("Área y Volumen de un cilindro");
	System.out.println("El área del cilindro es: " + e + "cm²");
	System.out.println("El volumen del cilindro es: " + v + "cm²");


    }
}
