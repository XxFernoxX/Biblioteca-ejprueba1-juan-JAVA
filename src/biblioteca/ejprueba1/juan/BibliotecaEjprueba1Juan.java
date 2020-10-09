
package biblioteca.ejprueba1.juan;

public class BibliotecaEjprueba1Juan {

 
    public static void main(String[] args) {
        Escritor escritor = new Escritor("Julio José", 45);
        Libro libro = new Libro("Libro Nuevo ", 2500, escritor);
        
        libro.mostrarInfoLibro();
        double precioVenta = libro.obtenerDescuento(15);
        System.out.println("************************************");
        System.out.println("Precio de Venta..:"+precioVenta);
        
        
        double descuento = libro.obtenerDescuento(15);
        System.out.println("Descuento..:"+descuento);
        System.out.println("Holy shit");
        
    }
    
}
