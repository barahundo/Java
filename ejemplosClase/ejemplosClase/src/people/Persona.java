/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 * 
 * @author juanp
 */
public class Persona {
    public String nombre;
    public int edad;
    public char genero;
    public double peso;
    public double altura;
    
    public Persona(String nombre,int edad,char genero, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.peso=peso;
        this.altura=altura;
    }
    /**
     * indice de masa corporal
     * @return 
     */
    public double imc(){
        return peso/altura*altura;
    }
    /**
     * retorna falso o verdadero
     * @return 
     */
    public boolean mayorEdad(){
        return edad>=18;
    }
    /**
     * @return 
     */
    public String ToString(){
        return String.format(nombre+"\n"+edad+"\n"+genero+"\n"+peso+"\n"+altura);
    }
    
}
