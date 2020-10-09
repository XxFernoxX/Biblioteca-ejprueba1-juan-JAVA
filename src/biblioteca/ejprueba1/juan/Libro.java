
package biblioteca.ejprueba1.juan;

public class Libro {
    
    private String titulo;
    private double precioCosto;
    private Escritor autor;

    public Libro() {
    }

    public Libro(String titulo, double precioCosto, Escritor autor) {
        this.setTitulo(titulo);
        this.setPrecioCosto(precioCosto);
        this.autor = autor;
    }
    
    /*a.Obtener el precio de venta del libro aplicandole un 19% de iva
    + un 30% de margen de ganancia */
    public double obtenerPrecioVenta(){
        double precioVenta = precioCosto*1.19*1.30;
        return precioVenta;
    }
    
    /*b. Mostrar informacion del libro que incluya:
    titulo - nombre auto - precio venta  */
    public void mostrarInfoLibro(){
        System.out.println("Datos del Libro");
        System.out.println("Titulo:"+titulo);
        System.out.println("Auto..:"+autor.getNombre());
        System.out.println("Precio.:"+obtenerPrecioVenta());
    }
    
    /*c. Obtener el valor de descuento, segun x% aplicado
    al precio de venta del libro*/
    
    public double obtenerDescuento(double porDesc){
        double precioVenta = obtenerPrecioVenta();
        double descuento = precioVenta*porDesc/100;
        return descuento;
    }

    public Escritor getAutor() {
        return autor;
    }

    public void setAutor(Escritor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length()>=3){
            this.titulo = titulo;
        }else{
            System.out.println("Titulo muy corto!!");
        }
        
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        if(precioCosto>1000 && precioCosto<=15000){
            this.precioCosto = precioCosto;
        }else{
            System.out.println("Precio de costo fuera de rango");
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precioCosto=" + precioCosto + ", autor=" + autor + '}';
    }
    
    
}
