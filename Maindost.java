/*
 *clase main
 *@author Horacio Mares
 *@version 1
 **/
public class Maindost{
    /*
     *metodo main
     *@param args
     **/
    public static void main(String[] args){
	Rectangulo area = new Rectangulo();
	//imprimimos los valores del area y perimetro
	System.out.println("area es: " + area.getArea());
	System.out.println("perimetro es: " + area.getPerimetro());
    }
}
