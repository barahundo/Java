package UI;

import Funciones.Numerica;
import Personas.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona p=new Persona("Juan K", 41, 'm', 1.65, 65);
        System.out.println(p.mayorEdad());
        /*Numerica.impCuadrados(1, 100);
        Numerica.im_pares(2, 100);
        Numerica.im_pares(1, 99);
        Numerica.descendente(99);*/
        Numerica.impFactorial(5);
    }
}
