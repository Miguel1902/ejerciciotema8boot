/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4bootcamp;

/**
 *
 * @author migue
 */
public class ejercicio_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        //acontinuacion creamos la persona1 en el main
        persona persona1 = new persona(); 
        //aqui hacemos atraves del set visible la edad
        persona1.setEdad(10);
        int edad = persona1.getEdad();
        System.out.println(edad);
        //aqui hacemos atraves del set visible el nombre 
        persona1.setNombre("antonio");
        String nombre = persona1.getnombre();
        System.out.println(nombre);
        //aqui hacemos atraves del set visible el número 
        persona1.setTelefono(952311017);
        int telefono = persona1.getTelefono();
        System.out.println(telefono);
    }
    
}
//creamos la clase persona
class persona{
    //declararmos las variables privadas 
    private int edad;
    private String nombre;
    private int telefono;
    //creamos el set de edad 
    public void setEdad(int edad){
        this.edad= edad;
    }
    //creamos el get de edad 
    public int getEdad(){
        return this.edad;
    }
    //creamos el set del nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //creamos el get de nombre 
    public String getnombre(){
        return this.nombre;
    }
    //creamos el set del telefono 
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    //creamos el get del telefono
    public int getTelefono(){
        return this.telefono;
    }
}
