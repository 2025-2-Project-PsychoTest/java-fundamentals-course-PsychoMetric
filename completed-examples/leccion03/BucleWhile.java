//Bucle while
public class BucleWhile {
    public static void main(String[] args) {
        // Ejemplo 1: Contar mientras sea menor que 5
        System.out.println("Bucle while básico:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; //contador = contador + 1
        }
        
        // Ejemplo 2: Juego de adivinanzas (simulado)
        System.out.println("\nJuego de adivinanzas:");
        int numeroSecreto = 7;
        int intento = 1;
        boolean adivinado = false;
        
        while (intento <= 3 && !adivinado) { //&& = y
            System.out.println("Intento #" + intento);
            int miNumero = intento * 2 + 1; // Simulación
            
            if (miNumero == numeroSecreto) { // verficaciones
                System.out.println("¡Adivinaste! El número era " + numeroSecreto);
                adivinado = true;
            } else {
                System.out.println("Ese no es. Intenta de nuevo.");
            }
            intento++;
        }
        
        if (!adivinado) {
            System.out.println("Se acabaron los intentos. El número era " + numeroSecreto);
        }
        
        // Ejemplo 3: Acumular puntos
        System.out.println("\nAcumulando puntos:");
        int puntos = 0;
        int nivel = 1;
        
        while (puntos < 100) {
            puntos = puntos + (nivel * 10);
            System.out.println("Nivel " + nivel + " completado. Puntos: " + puntos);
            nivel++;
        }
        System.out.println("¡Meta alcanzada!");
    }
}