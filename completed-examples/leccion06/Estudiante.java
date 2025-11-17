// Clase para representar un estudiante
public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;
    private double[] calificaciones;
    private int numCalificaciones;
    
    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.calificaciones = new double[5]; // Máximo 5 calificaciones
        this.numCalificaciones = 0;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getGrado() {
        return grado;
    }
    
    // Agregar calificación
    public void agregarCalificacion(double calificacion) {
        if (numCalificaciones < 5) {
            if (calificacion >= 0 && calificacion <= 100) {
                calificaciones[numCalificaciones] = calificacion;
                numCalificaciones++;
                System.out.println("✓ Calificación agregada exitosamente");
            } else {
                System.out.println("✗ La calificación debe estar entre 0 y 100");
            }
        } else {
            System.out.println("✗ Ya tiene el máximo de calificaciones");
        }
    }
    
    // Calcular promedio
    public double calcularPromedio() {
        if (numCalificaciones == 0) {
            return 0.0;
        }
        
        double suma = 0;
        for (int i = 0; i < numCalificaciones; i++) {
            suma = suma + calificaciones[i];
        }
        
        return suma / numCalificaciones;
    }
    
    // Obtener letra de calificación
    public String obtenerLetraCalificacion() {
        double promedio = calcularPromedio();
        
        if (promedio >= 90) {
            return "A - Excelente";
        } else if (promedio >= 80) {
            return "B - Muy Bueno";
        } else if (promedio >= 70) {
            return "C - Bueno";
        } else if (promedio >= 60) {
            return "D - Suficiente";
        } else {
            return "F - Insuficiente";
        }
    }
    
    // Mostrar todas las calificaciones
    public void mostrarCalificaciones() {
        System.out.println("\nCalificaciones de " + nombre + ":");
        if (numCalificaciones == 0) {
            System.out.println("  No hay calificaciones registradas");
        } else {
            for (int i = 0; i < numCalificaciones; i++) {
                System.out.println("  Calificación " + (i + 1) + ": " + calificaciones[i]);
            }
        }
    }
    
    // Mostrar información completa
    public void mostrarInformacionCompleta() {
        System.out.println("\n======================================");
        System.out.println("     INFORMACIÓN DEL ESTUDIANTE       ");
        System.out.println("======================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Grado: " + grado);
        
        mostrarCalificaciones();
        
        if (numCalificaciones > 0) {
            System.out.println("\nPromedio: " + String.format("%.2f", calcularPromedio()));
            System.out.println("Calificación: " + obtenerLetraCalificacion());
        }
    }
}