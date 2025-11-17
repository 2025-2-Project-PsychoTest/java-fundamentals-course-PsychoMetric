public class OperacionesVariables {
    public static void main(String[] args) {
        // Variables matemáticas
        int manzanas = 5;
        int naranjas = 3;
        int totalFrutas = manzanas + naranjas; // 8
        
        System.out.println("Tengo " + manzanas + " manzanas");
        System.out.println("Tengo " + naranjas + " naranjas");
        System.out.println("Total de frutas: " + totalFrutas);
        
        // Más operaciones
        int precio = 100;
        int descuento = 20;
        int precioFinal = precio - descuento; // 80
        
        System.out.println("\nPrecio original: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio final: " + precioFinal);
        
        // Modificar variables
        int puntos = 0;
        System.out.println("\nPuntos iniciales: " + puntos);
        
        puntos = puntos + 10;
        System.out.println("Ganaste 10 puntos: " + puntos);
        
        puntos = puntos + 25;
        System.out.println("Ganaste 25 puntos más: " + puntos);
        
        // Concatenación de Strings
        String nombre = "Carlos";
        String apellido = "Pérez";
        String nombreCompleto = nombre + " " + apellido;
        
        System.out.println("\nNombre completo: " + nombreCompleto);
    }
}