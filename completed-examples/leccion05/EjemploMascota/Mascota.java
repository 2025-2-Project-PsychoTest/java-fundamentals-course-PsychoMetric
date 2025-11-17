// Clase Mascota
public class Mascota {
    // Atributos (características)
    String nombre;
    String tipo;
    int edad;
    int nivelFelicidad;
    
    // Constructor (crea la mascota)
    public Mascota(String nombreMascota, String tipoMascota) {
        nombre = nombreMascota;
        tipo = tipoMascota;
        edad = 0;
        nivelFelicidad = 50;
    }
    
    // Métodos (acciones)
    public void alimentar() {
        nivelFelicidad = nivelFelicidad + 10;
        System.out.println(nombre + " ha comido. Felicidad: " + nivelFelicidad);
    }
    
    public void jugar() {
        nivelFelicidad = nivelFelicidad + 15;
        System.out.println(nombre + " está jugando. Felicidad: " + nivelFelicidad);
    }
    
    public void mostrarEstado() {
        System.out.println("\n--- Estado de " + nombre + " ---");
        System.out.println("Tipo: " + tipo);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nivel de felicidad: " + nivelFelicidad);
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println("¡" + nombre + " cumplió " + edad + " años!");
    }
}

