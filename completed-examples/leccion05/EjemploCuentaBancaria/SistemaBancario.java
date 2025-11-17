import java.util.Scanner;

public class SistemaBancario {
    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ ===");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA BANCARIO ===\n");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresa número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        
        CuentaBancaria cuenta = new CuentaBancaria(nombre, numeroCuenta);
        
        boolean continuar = true;
        
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            
            if (opcion == 1) {
                System.out.print("\nCantidad a depositar: $");
                double cantidad = scanner.nextDouble();
                cuenta.depositar(cantidad);
                
            } else if (opcion == 2) {
                System.out.print("\nCantidad a retirar: $");
                double cantidad = scanner.nextDouble();
                cuenta.retirar(cantidad);
                
            } else if (opcion == 3) {
                cuenta.consultarSaldo();
                
            } else if (opcion == 4) {
                System.out.println("\n¡Gracias por usar nuestro sistema!");
                cuenta.consultarSaldo();
                continuar = false;
                
            } else {
                System.out.println("\nOpción inválida");
            }
        }
    }
}