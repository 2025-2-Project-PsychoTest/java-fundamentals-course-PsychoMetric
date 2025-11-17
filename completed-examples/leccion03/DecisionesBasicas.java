public class DecisionesBasicas {
    public static void main(String[] args) {
        // Ejemplo 1: Verificar edad
        int edad = 16;
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        
        // Ejemplo 2: Calificaciones
        int nota = 85;
        
        if (nota >= 90) {
            System.out.println("¡Excelente! Calificación: A");
        } else if (nota >= 80) {
            System.out.println("Muy bien! Calificación: B");
        } else if (nota >= 70) {
            System.out.println("Bien. Calificación: C");
        } else if (nota >= 60) {
            System.out.println("Suficiente. Calificación: D");
        } else {
            System.out.println("Necesitas estudiar más. Calificación: F");
        }
        
        // Ejemplo 3: Videojuego
        int vidas = 3;
        int puntos = 150;
        
        if (vidas > 0 && puntos >= 100) {
            System.out.println("¡Sigues en el juego y vas muy bien!");
        } else if (vidas > 0) {
            System.out.println("Sigues jugando, pero necesitas más puntos");
        } else {
            System.out.println("Game Over");
        }
    }
}