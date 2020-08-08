
package poo;
/* La herencia es una de las carateristicas mas importante de la POO, consiste en hacer que de una clase princiapal(Padre o SuperClase) podamos crear
una o mas clases(Hijas) que usen sus metodos y atributos, esto es aplicable por ej. si tenemos una clase principal Familia cuyos atributos
serian Nombre, edad y de ella creamos las clases hijas, Padre,Madre,Hijo, etc. que tendran el atributo Nombre y edad y algun metodo
de la clase padre
Clase Abstracta es aquella que no tendra instancias de ella pero si sus subclases a no ser que sus subclases no sean tambien
abstractas, en este caso Herencia_Animal sera una clase abstracta ya que solo vamos a crear instancias de sus hijas pero no de ella
*/
public class Herencia_Animal 
{
    String Raza;
    double peso;
 
    public String  comer(String c)
    {
        String s;
        if(c.equalsIgnoreCase("Balanceado"))
        s="COME ESO";
        else
        s="NO COME ESO";
      
        return s;
        
    }
//El metodo super() es utilizado por las clases hijas para hacer referencia a un metodo o atributo especifico
//de la clase padre, por ej. si la clase hija imprime una cierta cosa, pero quiere imprimir algo de la clase padre
//con el metodo super lo podra hacer  https://www.youtube.com/watch?v=1zyKcZ7XdQg





}
