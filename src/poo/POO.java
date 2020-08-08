
package poo;

import java.util.*;

public class POO {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);  
       System.out.println("Ingrese el Nombre completo del Alumno");
        String nc=sc.nextLine();
        System.out.println("Ingrese la edad del Alumno");
        int Edad=sc.nextInt();
        System.out.println("Ingrese el DNI del Alumno");
        int dni=sc.nextInt();
        System.out.println("Ingrese la nota del Alumno");
        int nota=sc.nextInt();
        
        Alumno a=new Alumno(nc,Edad,dni,nota);
        
        
        //en vez de traer todos los parametros del objt. alumno para imprimir directamente llamamos al metodo toString() y este imprimira todos los atributos del objt. alumno
        System.out.println("Imprimimos");
        System.out.println(a.toString());//Como la unica forma de mostrar salidas en consola es con System.out.println, metemos el metodo dentro de System.out.println
        System.out.println(a.getResultado());
    
       
       
        Perro p=new Perro();
        System.out.println("INGRESE LA COMIDA QUE LE DARA AL PERRO");
        String e=sc.nextLine();
        System.out.println(p.comer(e));
        
          Gato g=new Gato();
         System.out.println("INGRESE LA COMIDA QUE LE DARA AL GATO");
         String t=sc.nextLine();
         System.out.println(g.comer(t));
       
    
    
    
    }
    
}
