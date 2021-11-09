/*
 *clase que obtiene area y volumen de un cilindro
 *@author Horacio Mares
 *@version 1
 **/
public class Cuentat{
    //el nombre del titular
    private String titular;
    //el dinero disponible
    private double dinerodisponible;
    /*
     *constructor que resive los 2 valores del 
     *titular y dinero de dicha cuenta
     *@param titular el parametro que representa el titular
     *@param dinerodisponible que representa el dinero disonible
*/
    public Cuentat(String titular){
	this.titular = titular;
	this.dinerodisponible = 0;
	
    }
    public Cuentat(){
	titular = "Horacio";
	dinerodisponible = 100;
    }
    /*metodo que devuelve el titular
     *@return titular
*/
    public String getTitular(){
	return titular;
    }
    public void setTitular(String titular){
	this.titular = titular;
    }
    /*
     *metodo que devuelve e ldinero disponible
     *@return dinerodisponible
*/
    public double getDinerodisponible(){
	return dinerodisponible;
    }
    public void setDinerodisponible(double dinerodisponible){
	this.dinerodisponible = dinerodisponible;
    }
    /*
     *metodo que devuelve un tostring
     *@return el tostring del titular
*/
    public String toString(){
	return titular + " " + dinerodisponible; }
}
