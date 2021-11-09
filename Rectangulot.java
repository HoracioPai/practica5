/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
 **/
public class Rectangulot{
    //los valores de las base,altura,area y perimetro del cilindro
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    public Rectangulot(){
	/*
	 *constructores que resiben 4 valores reales
	 *@param base del cilindro
	 *@param altura del cilindro
	 *@param area del cilindro
	 *@param perimetro del cilindro
*/
	this.base = 4;
	this.altura = 8;
	this.area = base * altura;
	this.perimetro = 2*(base + altura);
    }
    /*
     *metodo que devuelve la base
     *@return la base del cilindro
*/
    public double getBase(){
	return this.base;
    }
    public void setBase(double base){
	this.base = base;
    }
    /*
     *metodo que devuelve la altura
     *@return altura del cilindro
*/
    public double getAltura(){
	return this.base;
    }
    public void setAltura(double altura){
	this.altura = altura;
    }
    /*metodo tostring donde se convierte la base en un string
@return base tostring
     */
    public String toString(){
	return base + " " + altura;
    }
    /*
     *metodo que devuelve el area del cilindro
     *@return area del cilindro
*/
    public double getArea(){
	return this.area;
    }
    public void setArea(double area){
	this.area = area;
    }
    /*
     *metodo que devuelve el perimetro del cilindro
     *@return perimetro cilindro
*/
        public double getPerimetro(){
	return this.perimetro;
    }
    public void setPerimetro(double perimetro){
    }
}
