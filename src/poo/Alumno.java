
package poo;


public class Alumno 
{
    
    
String NombreCompleto;
int Edad;
int Dni;
int nota;
String resultado;

    public Alumno(String NombreCompleto, int Edad, int Dni, int nota) 
    {
        this.NombreCompleto = NombreCompleto;
        this.Edad = Edad;
        this.Dni = Dni;
        this.nota = nota;
        
    }
    
  /*Los metodos Get(Obtener) y Setter(Enviar) son unos metodos que proporciona java para obtener y enviar valores de un atributo
    para el caso de Get devuelve el valor de un atributo y para el caso de set le asigna un valor a un atributo, de esta forma gracias 
    a estos metodos podriamos usar la variable nota obtener el valor de esta y hacer la operacion que quisieramos, otro uso de estos 
    metodos es para obtener valores que no pasan por parametros 
    
  */
  
    //Gracias a este get le mandamos a la clase principal el resultado
    public String getResultado() {

        if (this.nota>5)
            resultado="Aprobado";
            else
            resultado="Desaprobado";
        
        return this.resultado;

    }
    

    
  
    
    
 //Metodo ToString() es un metodo que puede estar contenida dentro de una clase y se usa para mostrar todos lo que querramos de 
//ese Objeto, sin la necesidad de tener que estar llamando variables u otros metodos para mostrar algo de un objeto, de esta manera dentro
//de este metodo realizamos todo lo que tengamos que hacer para que muestre lo que querramos y luego lo intanciamos desde el objeto de esa clase
    @Override
    public String toString() {
        return "Alumno{" + "NombreCompleto=" + NombreCompleto + ", Edad=" + Edad + ", Dni=" + Dni + ", nota=" + nota + '}';
    }
    //En este caso mostramos solamente los atributos del objeto Alumno
  
    
    
    
    
}
