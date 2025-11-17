//Bucle For
public class BucleFor {
    public static void main(String[] args) {
        // Ejemplo 1: Contar del 1 al 5
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i++) { //i = i + 1
            System.out.println("Número: " + i);
        }
        
        // Ejemplo 2: Tabla de multiplicar
        System.out.println("\nTabla del 5:");
        for (int i = 1; i <= 10; i++) { //i = i + 1
            int resultado = 5 * i;
            System.out.println("5 x " + i + " = " + resultado);
        }
        
        // Ejemplo 3: Cuenta regresiva
        System.out.println("\nCuenta regresiva:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("¡Despegue! 🚀");
        
        // Ejemplo 4: Sumar números
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println("\nLa suma de 1 a 100 es: " + suma);
    }
}