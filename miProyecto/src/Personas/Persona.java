package Personas;

public class Persona {
    public String nombre;
    public int edad;
    public char genero;
    public double altura;
    public double peso;

    public Persona (String nombre,int edad,char genero,double altura,double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.altura=altura;
        this.peso=peso;
    }
    public double imc(){
        return peso/altura*altura;
    }
    public boolean mayorEdad(){
        return edad>=18;
    }
    public String ToString(){
        return String.format(nombre+"\n"+edad+"\n"+genero+"\n"+altura+"\n"+peso);
    }
}
