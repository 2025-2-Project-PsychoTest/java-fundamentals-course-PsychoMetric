import java.util.Scanner;

public class SistemaGestionMultiple {
    
    // Arrays para múltiples estudiantes
    private static Estudiante[] estudiantes = new Estudiante[10]; // Máximo 10
    private static int numEstudiantes = 0;
    
    public static void mostrarMenu() {
        System.out.println("\n======================================");
        System.out.println("   SISTEMA GESTIÓN MÚLTIPLE           ");
        System.out.println("======================================");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Listar todos los estudiantes");
        System.out.println("3. Buscar estudiante");
        System.out.println("4. Agregar calificación a estudiante");
        System.out.println("5. Salir");
        System.out.print("\nOpción: ");
    }
    
    public static void registrarEstudiante(Scanner scanner) {
        if (numEstudiantes >= 10) {
            System.out.println("\n✗ Límite de estudiantes alcanzado");
            return;
        }
        
        System.out.println("\n=== NUEVO ESTUDIANTE ===");
        System.out.print("Nombre: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Grado: ");
        scanner.nextLine();
        String grado = scanner.nextLine();
        
        estudiantes[numEstudiantes] = new Estudiante(nombre, edad, grado);
        numEstudiantes++;
        
        System.out.println("✓ Estudiante #" + numEstudiantes + " registrado");
    }
    
    public static void listarEstudiantes() {
        if (numEstudiantes == 0) {
            System.out.println("\n✗ No hay estudiantes registrados");
            return;
        }
        
        System.out.println("\n======================================");
        System.out.println("       LISTA DE ESTUDIANTES           ");
        System.out.println("======================================");
        
        for (int i = 0; i < numEstudiantes; i++) {
            Estudiante e = estudiantes[i];
            System.out.println("\n" + (i + 1) + ". " + e.getNombre());
            System.out.println("   Edad: " + e.getEdad() + " | Grado: " + e.getGrado());
            System.out.println("   Promedio: " + String.format("%.2f", e.calcularPromedio()));
        }
    }
    
    public static Estudiante buscarEstudiante(Scanner scanner) {
        if (numEstudiantes == 0) {
            System.out.println("\n✗ No hay estudiantes registrados");
            return null;
        }
        
        System.out.println("\n=== BUSCAR ESTUDIANTE ===");
        System.out.print("Nombre del estudiante: ");
        scanner.nextLine();
        String nombreBuscado = scanner.nextLine();
        
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("✓ Estudiante encontrado");
                return estudiantes[i];
            }
        }
        
        System.out.println("✗ Estudiante no encontrado");
        return null;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        System.out.println("======================================");
        System.out.println("     SISTEMA DE GESTIÓN ESCOLAR       ");
        System.out.println("======================================");
        
        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    registrarEstudiante(scanner);
                    break;
                case 2:
                    listarEstudiantes();
                    break;
                case 3:
                    Estudiante encontrado = buscarEstudiante(scanner);
                    if (encontrado != null) {
                        encontrado.mostrarInformacionCompleta();
                    }
                    break;
                case 4:
                    Estudiante est = buscarEstudiante(scanner);
                    if (est != null) {
                        System.out.print("Calificación (0-100): ");
                        double cal = scanner.nextDouble();
                        est.agregarCalificacion(cal);
                    }
                    break;
                case 5:
                    System.out.println("\n======================================");
                    System.out.println("         ¡HASTA PRONTO!               ");
                    System.out.println("======================================");
                    continuar = false;
                    break;
                default:
                    System.out.println("\n✗ Opción inválida");
            }
        }
        
        scanner.close();
    }
}