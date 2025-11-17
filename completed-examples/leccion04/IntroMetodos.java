//Introducción a los métodos
public class IntroMetodos {
    
    // Método sin parámetros ni retorno
    public static void saludar() {
        System.out.println("¡Hola! Bienvenido al programa");
        System.out.println("Espero que estés aprendiendo mucho");
    }
    
    // Método con parámetros
    public static void saludarPersona(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Es un placer tenerte aquí");
    }
    
    // Método que retorna un valor
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    
    // Método más complejo
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        double suma = nota1 + nota2 + nota3;
        double promedio = suma / 3;
        return promedio;
    }
    
    public static void main(String[] args) {
        // Llamar métodos
        System.out.println("=== DEMOSTRACIÓN DE MÉTODOS ===\n");
        
        saludar();
        System.out.println();
        
        saludarPersona("Carlos");
        saludarPersona("María");
        System.out.println();
        
        int resultado = sumar(15, 27);
        System.out.println("15 + 27 = " + resultado);
        
        int resultado2 = sumar(100, 250);
        System.out.println("100 + 250 = " + resultado2);
        System.out.println();
        
        double promedio = calcularPromedio(85, 92, 88);
        System.out.println("Promedio: " + promedio);
    }
}