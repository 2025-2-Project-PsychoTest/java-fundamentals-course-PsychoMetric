import java.util.Scanner;
// BUENAS PRÁCTICAS EN JAVA

// 1. NOMBRES DESCRIPTIVOS
// ✓ Bien
int edadEstudiante = 15;
String nombreCompleto = "Ana García";

// ✗ Mal
int e = 15;
String n = "Ana García";

// 2. CONSTANTES EN MAYÚSCULAS
final int MAX_ESTUDIANTES = 10;
final double PI = 3.14159;

// 3. COMENTARIOS ÚTILES
// Calcula el promedio de todas las calificaciones
public double calcularPromedio() {
    // código...
}

// 4. VALIDACIÓN DE DATOS
public void setEdad(int edad) {
    if (edad > 0 && edad < 120) {
        this.edad = edad;
    } else {
        System.out.println("Edad inválida");
    }
}

// 5. MANEJO DE ERRORES
Scanner scanner = new Scanner(System.in);
try {
    int numero = scanner.nextInt();
    System.out.println("Número ingresado: " + numero);
} catch (Exception e) {
    System.out.println("Error: Debes ingresar un número");
}

// 6. CÓDIGO REUTILIZABLE
// En lugar de repetir código, crea métodos
public static void imprimirLinea() {
    System.out.println("════════════════════════════");
}

// 7. INDENTACIÓN CONSISTENTE
public class Ejemplo {
    public void metodo() {
        if (condicion) {
            // código indentado
        }
    }
}