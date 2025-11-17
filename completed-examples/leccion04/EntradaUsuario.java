import java.util.Scanner;

public class EntradaUsuario {
    
    public static void pedirNombre() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();
        
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();
        
        System.out.println("\n¡Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años.");
        
        if (edad >= 13 && edad <= 17) { //&& -> y
            System.out.println("Eres adolescente y estás en la edad perfecta para aprender programación");
        }
    }
    
    public static double calcularArea() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== CALCULADORA DE ÁREA DE RECTÁNGULO ===");
        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingresa la altura: ");
        double altura = scanner.nextDouble();
        
        double area = base * altura;
        return area;
    }
    
    public static void main(String[] args) {
        pedirNombre();
        
        double area = calcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }
   
}