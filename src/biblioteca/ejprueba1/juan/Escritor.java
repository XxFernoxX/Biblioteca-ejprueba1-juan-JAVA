
package biblioteca.ejprueba1.juan;


public class Escritor {
    
    private String nombre;
    private int edad;

    public Escritor() {
    }

    public Escritor(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=1 && edad<=150){
            this.edad = edad;
        }else{
            System.out.println("Edad fuera de rango!!");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()>=3){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre demasiado pequeño!!");
        }        
    }

    @Override
    public String toString() {
        return "Escritor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    
}
