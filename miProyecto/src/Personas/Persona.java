package Personas;

public class Persona {
    public String nombre;
    public int edad;
    public char genero;
    public double altura;
    public double peso;
/**
 * 
 * @param nombre
 * @param edad
 * @param genero
 * @param altura
 * @param peso
 */
    public Persona (String nombre,int edad,char genero,double altura,double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.altura=altura;
        this.peso=peso;
    }
    /**
     * retorna el Indice de masa corporal(imc)
     * @return
     */
    public double imc(){
        return peso/altura*altura;
    }
    /**
     * retorna si es mayor de edad
     * @return
     */
    public boolean mayorEdad(){
        return edad>=18;
    }
    /**
     * retorna todos los parametros en una cadena
     * @return
     */
    @Override
    public String toString(){
        return String.format(nombre+"\n"+edad+"\n"+genero+"\n"+altura+"\n"+peso);
    }
}
