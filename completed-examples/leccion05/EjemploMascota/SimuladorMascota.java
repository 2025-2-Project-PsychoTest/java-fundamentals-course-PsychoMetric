// Programa principal
public class SimuladorMascota {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE MASCOTA ===\n");
        
        // Crear objetos (mascotas)
        Mascota miPerro = new Mascota("Max", "Perro");
        Mascota miGato = new Mascota("Luna", "Gato");
        
        // Interactuar con las mascotas
        System.out.println("Día 1:");
        miPerro.mostrarEstado();
        miGato.mostrarEstado();
        
        System.out.println("\nAlimentando a las mascotas...");
        miPerro.alimentar();
        miGato.alimentar();
        
        System.out.println("\n¡Hora de jugar!");
        miPerro.jugar();
        miPerro.jugar();
        miGato.jugar();
        
        System.out.println("\nEstado actualizado:");
        miPerro.mostrarEstado();
        miGato.mostrarEstado();
        
        System.out.println("\n¡Es el cumpleaños de Max!");
        miPerro.cumplirAnios();
        miPerro.mostrarEstado();
    }
}