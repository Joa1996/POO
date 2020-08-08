
package poo;


public class Gato extends Herencia_Animal
{
    
    //La sobrecarga de metodos consiste en sobrescibir un metodo de la clase padre desde la clase hija
    @Override
      public String  comer(String c)
      {
           c="Gato No puede Comer Nada" ;
          
          return c;
      }
//  Gracias a esto por ej. si la clase principal tuviera como metodo una formula matm. general pero debe cambiar su forma al
//  estar en una subclase con esta opcion podriamos sobrescribir el metodo
    
}
