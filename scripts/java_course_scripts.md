# Guiones Completos del Curso de Java para Principiantes como Guía

## Lección 1: ¿Qué es Java y la Programación? (6 minutos)

### Guion Narrativo

**Introducción**
"¡Hola! Bienvenidos al curso de Fundamentos de Java para Principiantes. Me alegra mucho que estén aquí. En esta primera lección, vamos a descubrir qué es la programación y por qué Java es un lenguaje perfecto para comenzar tu aventura en el mundo del código."

**¿Qué es la Programación?**
"Imagina que quieres enseñarle a tu mejor amigo a preparar tu receta favorita. Tienes que darle instrucciones muy claras: primero esto, después aquello, si pasa esto entonces haz esto otro. ¡Eso es programación! Es el arte de dar instrucciones precisas a una computadora para que haga lo que queremos.

Las computadoras son muy poderosas, pero también muy literales. No pueden adivinar lo que queremos; debemos decirles exactamente qué hacer, paso a paso. Y para comunicarnos con ellas, usamos lenguajes de programación."

**¿Qué es Java?**
"Java es uno de los lenguajes de programación más populares del mundo. Fue creado en 1995 y se usa en millones de dispositivos. ¿Sabías que tu teléfono Android funciona con Java? ¿O que Minecraft fue creado con Java? ¡Incluso muchos sitios web y aplicaciones que usas todos los días están hechos con Java!

¿Por qué Java es tan especial? Por tres razones principales:
1. **Funciona en cualquier lugar**: Puedes escribir código una vez y ejecutarlo en Windows, Mac, Linux, teléfonos... ¡en casi cualquier dispositivo!
2. **Es fácil de aprender**: Java tiene una sintaxis clara y lógica, perfecta para principiantes.
3. **Tiene una gran comunidad**: Millones de programadores usan Java, así que siempre encontrarás ayuda y recursos."

**Tu Primer Programa en Java**
"Ahora viene la parte emocionante. Vamos a escribir tu primer programa en Java. Es una tradición en programación que el primer programa que escribas muestre el mensaje 'Hola Mundo'. 

Abre el enlace que está en la descripción del video. Te llevará a OnlineGDB, un editor de código en línea. No necesitas instalar nada, solo tu navegador."


```java
public class MiPrimerPrograma {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
        System.out.println("Este es mi primer programa en Java");
        System.out.println("¡Estoy aprendiendo a programar!");
    }
}
```

"Vamos a entender este código:
- `public class MiPrimerPrograma`: Esta es la clase principal. En Java, todo el código vive dentro de clases. Por ahora, piensa en una clase como un contenedor.
- `public static void main`: Esta es la puerta de entrada de tu programa. Java siempre empieza a ejecutar desde aquí.
- `System.out.println()`: Este es el comando para mostrar texto en la pantalla. Todo lo que pongas entre comillas se mostrará."

**Cierre**
"¡Excelente! Acabas de escribir y ejecutar tu primer programa en Java. Ya eres oficialmente un programador. En la próxima lección, aprenderemos sobre variables, que son como cajas donde podemos guardar información. ¡Nos vemos pronto!"

---

## Lección 2: Variables y Tipos de Datos (9 minutos)

### Guion Narrativo

**Introducción**
"¡Bienvenidos de nuevo! En la lección anterior escribimos nuestro primer programa. Hoy vamos a aprender sobre variables, que son fundamentales en programación. Las variables son como cajas donde guardamos información que nuestro programa necesita recordar."

**¿Qué son las Variables?**
"Imagina que estás jugando un videojuego. El juego necesita recordar tu nombre, tu puntuación, tu nivel, cuántas vidas te quedan... Toda esa información se guarda en variables.

Una variable tiene tres cosas importantes:
1. **Un nombre**: Para identificarla (como 'puntaje' o 'nombreJugador')
2. **Un tipo**: Qué clase de información guarda (números, texto, etc.)
3. **Un valor**: La información que contiene

En Java, antes de usar una variable, debemos declararla. Es como decirle a Java: 'Oye, voy a necesitar una caja para guardar esto'."

**Tipos de Datos Básicos**

```java
public class VariablesBasicas {
    public static void main(String[] args) {
        // Números enteros
        int edad = 15;
        int nivel = 1;
        int puntos = 0;
        
        // Números decimales
        double altura = 1.65;
        double promedio = 9.5;
        
        // Texto
        String nombre = "Ana";
        String mensaje = "¡Bienvenido al juego!";
        
        // Verdadero o Falso
        boolean estaJugando = true;
        boolean tieneVidas = false;
        
        // Caracteres individuales
        char inicial = 'A';
        char grado = 'B';
        
        // Mostrar las variables
        System.out.println("Jugador: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Está jugando: " + estaJugando);
    }
}
```

"Veamos los tipos de datos principales en Java:

- **int**: Para números enteros (sin decimales). Ejemplo: edad, puntos, nivel.
- **double**: Para números con decimales. Ejemplo: altura, promedio, precio.
- **String**: Para texto. Siempre va entre comillas dobles. Ejemplo: nombres, mensajes.
- **boolean**: Solo puede ser true (verdadero) o false (falso). Útil para decisiones.
- **char**: Para un solo carácter. Va entre comillas simples."

**Operaciones con Variables**

```java
public class OperacionesVariables {
    public static void main(String[] args) {
        // Variables matemáticas
        int manzanas = 5;
        int naranjas = 3;
        int totalFrutas = manzanas + naranjas;
        
        System.out.println("Tengo " + manzanas + " manzanas");
        System.out.println("Tengo " + naranjas + " naranjas");
        System.out.println("Total de frutas: " + totalFrutas);
        
        // Más operaciones
        int precio = 100;
        int descuento = 20;
        int precioFinal = precio - descuento;
        
        System.out.println("\nPrecio original: " + precio);
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio final: " + precioFinal);
        
        // Modificar variables
        int puntos = 0;
        System.out.println("\nPuntos iniciales: " + puntos);
        
        puntos = puntos + 10;
        System.out.println("Ganaste 10 puntos: " + puntos);
        
        puntos = puntos + 25;
        System.out.println("Ganaste 25 puntos más: " + puntos);
        
        // Concatenación de Strings
        String nombre = "Carlos";
        String apellido = "Pérez";
        String nombreCompleto = nombre + " " + apellido;
        
        System.out.println("\nNombre completo: " + nombreCompleto);
    }
}
```

"Podemos hacer operaciones con variables:
- Sumar: `total = manzanas + naranjas`
- Restar: `precioFinal = precio - descuento`
- Multiplicar: `area = base * altura`
- Dividir: `promedio = suma / cantidad`

También podemos modificar el valor de una variable. Fíjate en `puntos = puntos + 10`. Esto toma el valor actual de puntos, le suma 10, y guarda el resultado nuevamente en puntos."


"Reglas importantes para nombrar variables:
1. Debe empezar con una letra, $ o _
2. No puede empezar con un número
3. No puede tener espacios ni guiones
4. No uses palabras reservadas de Java (como 'int', 'class', 'public')
5. Java distingue mayúsculas de minúsculas: 'edad' es diferente de 'Edad'

En Java usamos 'camelCase': la primera palabra en minúscula, y cada palabra siguiente empieza con mayúscula. Ejemplo: `nombreDelEstudiante`, `puntajeMaximo`."


**Cierre**
"¡Genial! Ahora sabes cómo guardar y usar información en tu programa. Las variables son la base de todo en programación. En la próxima lección, aprenderemos a tomar decisiones en nuestro código con if-else. ¡Hasta pronto!"

---

## Lección 3: Estructuras de Control - Decisiones y Bucles (11 minutos)

### Guion Narrativo

**Introducción**
"¡Hola de nuevo! Hasta ahora, nuestros programas ejecutan cada línea de código en orden, de arriba hacia abajo. Pero ¿qué pasa si queremos que nuestro programa tome decisiones o repita acciones? Eso es lo que aprenderemos hoy: estructuras de control."

**Condicionales: if-else**

```java
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
```

"Las estructuras `if-else` son como preguntas que hace tu programa:

- **if (condición)**: Si esto es verdad, haz esto
- **else**: Si no, haz esto otro
- **else if**: Si la primera condición no se cumple, prueba esta otra

Los operadores de comparación son:
- `==` : igual a
- `!=` : diferente de
- `>` : mayor que
- `<` : menor que
- `>=` : mayor o igual que
- `<=` : menor o igual que

También podemos combinar condiciones:
- `&&` : Y (ambas deben ser verdad)
- `||` : O (al menos una debe ser verdad)
- `!` : NO (invierte el resultado)"

**Bucle for**

```java
public class BucleFor {
    public static void main(String[] args) {
        // Ejemplo 1: Contar del 1 al 5
        System.out.println("Contando del 1 al 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
        
        // Ejemplo 2: Tabla de multiplicar
        System.out.println("\nTabla del 5:");
        for (int i = 1; i <= 10; i++) {
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
```

"El bucle `for` es perfecto cuando sabes cuántas veces quieres repetir algo. Su estructura es:

```
for (inicio; condición; incremento) {
    // código a repetir
}
```

Por ejemplo: `for (int i = 1; i <= 5; i++)`
- **inicio**: `int i = 1` - Empieza en 1
- **condición**: `i <= 5` - Continúa mientras i sea menor o igual a 5
- **incremento**: `i++` - Aumenta i en 1 cada vez

`i++` es lo mismo que `i = i + 1`. Es una forma corta de incrementar."

**Bucle while**

```java
public class BucleWhile {
    public static void main(String[] args) {
        // Ejemplo 1: Contar mientras sea menor que 5
        System.out.println("Bucle while básico:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
        
        // Ejemplo 2: Juego de adivinanzas (simulado)
        System.out.println("\nJuego de adivinanzas:");
        int numeroSecreto = 7;
        int intento = 1;
        boolean adivinado = false;
        
        while (intento <= 3 && !adivinado) {
            System.out.println("Intento #" + intento);
            int miNumero = intento * 2 + 1; // Simulación
            
            if (miNumero == numeroSecreto) {
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
```

"El bucle `while` se usa cuando no sabes exactamente cuántas veces necesitas repetir, pero tienes una condición:

```
while (condición) {
    // código a repetir
}
```

El bucle continúa mientras la condición sea verdadera. ¡Cuidado! Si la condición siempre es verdadera, el bucle nunca terminará (bucle infinito).

**Diferencia entre for y while:**
- Usa `for` cuando sabes cuántas repeticiones necesitas
- Usa `while` cuando repites hasta que algo cambie"

**Cierre**
"¡Excelente trabajo! Ahora puedes hacer que tus programas tomen decisiones y repitan acciones. Estas son herramientas super poderosas. En la próxima lección, aprenderemos sobre métodos, que nos permiten organizar mejor nuestro código. ¡Nos vemos!"

---

## Lección 4: Métodos e Introducción a POO (13 minutos)

### Guion Narrativo

**Introducción**
"¡Bienvenidos! Hasta ahora, todo nuestro código ha estado en el método `main`. Hoy aprenderemos a crear nuestros propios métodos y daremos nuestro primer paso en la Programación Orientada a Objetos."

**¿Qué son los Métodos?**

```java
public class MetodosBasicos {
    
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
```

"Los métodos son como mini-programas dentro de tu programa. Son bloques de código reutilizables que realizan una tarea específica.

**¿Por qué usar métodos?**
1. **Reutilización**: Escribe el código una vez, úsalo muchas veces
2. **Organización**: Tu código es más fácil de leer y entender
3. **Mantenimiento**: Si necesitas cambiar algo, lo haces en un solo lugar

**Partes de un método:**
- `public static`: Por ahora, siempre los usaremos así
- `void` o tipo de retorno: `void` si no devuelve nada, o el tipo de dato que devuelve
- Nombre del método: Usa camelCase
- Paréntesis con parámetros: La información que el método necesita
- Llaves con el código: Lo que el método hace"

**Entrada del Usuario con Scanner**

```java
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
        
        if (edad >= 13 && edad <= 17) {
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
```

"Para que nuestros programas sean interactivos, necesitamos recibir información del usuario. Para eso usamos la clase `Scanner`:

1. Importamos Scanner: `import java.util.Scanner;`
2. Creamos un objeto Scanner: `Scanner scanner = new Scanner(System.in);`
3. Usamos métodos para leer datos:
   - `nextLine()`: Lee texto
   - `nextInt()`: Lee números enteros
   - `nextDouble()`: Lee números decimales

¡Importante! Siempre usa `System.out.print()` antes de leer, para que el usuario sepa qué debe escribir."

**Cierre**
Bien!, ahora sabes crear métodos, obtener entrada del usuario. En la siguiente lección vamos a enteder por fin que son las clases, sus principios, y como usarlos.

## Lección 5: Introducción a Clases y Objetos
¡Bienvenidos a la Programación Orientada a Objetos (POO)! 

**¿Qué es una clase?**
Una clase es como un molde o plano. Define cómo será algo. En nuestro ejemplo, la clase `Mascota` define qué características y acciones tendrá cualquier mascota.

**¿Qué es un objeto?**
Un objeto es una instancia de una clase. Es algo real creado a partir del molde. `miPerro` y `miGato` son dos objetos diferentes creados a partir de la clase `Mascota`.

**Componentes de una clase:**
1. **Atributos**: Variables que guardan las características (nombre, tipo, edad, nivelFelicidad)
2. **Constructor**: Método especial que crea el objeto y establece valores iniciales
3. **Métodos**: Acciones que el objeto puede realizar (alimentar, jugar, mostrarEstado)

**Crear y usar objetos:**
```java
Mascota miPerro = new Mascota("Max", "Perro");
miPerro.alimentar();
miPerro.mostrarEstado();
```

La POO nos ayuda a organizar código complejo modelando cosas del mundo real."

```java
// Clase Mascota
class Mascota {
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

// Programa principal
public class SimuladorMascota {
    public static void main(String[] args) {
        System.out.println("=== SIMULADOR DE MASCOTA ===\n");
        
        // Crear objetos (mascotas)
        Mascota miPerro = new Mascota("Max", "Perro");
        Mascota miGato = new Mascota("Luna", "Gato");
        
        // Interactuar con las mascotas
        System.out.println("Día 1:");
        miPerro.mostrarEstado();
        miGato.mostrarEstado();
        
        System.out.println("\nAlimentando a las mascotas...");
        miPerro.alimentar();
        miGato.alimentar();
        
        System.out.println("\n¡Hora de jugar!");
        miPerro.jugar();
        miPerro.jugar();
        miGato.jugar();
        
        System.out.println("\nEstado actualizado:");
        miPerro.mostrarEstado();
        miGato.mostrarEstado();
        
        System.out.println("\n¡Es el cumpleaños de Max!");
        miPerro.cumplirAnios();
        miPerro.mostrarEstado();
    }
}
```



**Encapsulación con Getters y Setters**

```java
class Estudiante {
    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;
    private boolean estaActivo;
    
    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = 0.0;
        this.estaActivo = true;
    }
    
    // Getters (obtener valores)
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getPromedio() {
        return promedio;
    }
    
    public boolean isActivo() {
        return estaActivo;
    }
    
    // Setters (modificar valores con validación)
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
            nombre = nuevoNombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }
    
    public void setPromedio(double nuevoPromedio) {
        if (nuevoPromedio >= 0 && nuevoPromedio <= 100) {
            promedio = nuevoPromedio;
        } else {
            System.out.println("Promedio debe estar entre 0 y 100");
        }
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (estaActivo ? "Activo" : "Inactivo"));
    }
    
    // Método para determinar estado académico
    public String obtenerEstadoAcademico() {
        if (promedio >= 90) {
            return "Excelente";
        } else if (promedio >= 80) {
            return "Muy Bueno";
        } else if (promedio >= 70) {
            return "Bueno";
        } else if (promedio >= 60) {
            return "Regular";
        } else {
            return "Necesita mejorar";
        }
    }
}

public class SistemaEstudiantes {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ESTUDIANTES ===\n");
        
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Ana García", 15);
        Estudiante estudiante2 = new Estudiante("Carlos López", 16);
        
        // Asignar promedios
        estudiante1.setPromedio(92);
        estudiante2.setPromedio(78);
        
        // Mostrar información
        estudiante1.mostrarInformacion();
        System.out.println("Estado académico: " + estudiante1.obtenerEstadoAcademico());
        
        estudiante2.mostrarInformacion();
        System.out.println("Estado académico: " + estudiante2.obtenerEstadoAcademico());
        
        // Intentar asignar promedio inválido
        System.out.println("\nIntentando asignar promedio de 150...");
        estudiante1.setPromedio(150);
        
        // Acceder a valores
        System.out.println("\nNombre del estudiante 1: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
    }
}
```

"**Encapsulación** es uno de los principios fundamentales de POO. Significa proteger los datos de una clase.

**¿Por qué usar private?**
Cuando declaramos atributos como `private`, no se pueden modificar directamente desde fuera de la clase. Esto nos protege de errores.

**Getters y Setters:**
- **Getter**: Método para OBTENER el valor de un atributo
  ```java
  public String getNombre() {
      return nombre;
  }
  ```
- **Setter**: Método para MODIFICAR el valor de un atributo
  ```java
  public void setPromedio(double nuevoPromedio) {
      if (nuevoPromedio >= 0 && nuevoPromedio <= 100) {
          promedio = nuevoPromedio;
      }
  }
  ```

Los setters pueden incluir validación. En el ejemplo, no permitimos promedios mayores a 100.

**La palabra `this`:**
`this` se refiere al objeto actual. Usamos `this.nombre` para distinguir el atributo de la clase del parámetro del método."

**Proyecto Práctico Integrador**

```java
import java.util.Scanner;

class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;
    
    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }
    
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("✓ Depósito exitoso de $" + cantidad);
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("✗ Cantidad inválida");
        }
    }
    
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("✓ Retiro exitoso de $" + cantidad);
            System.out.println("Nuevo saldo: $" + saldo);
        } else if (cantidad > saldo) {
            System.out.println("✗ Saldo insuficiente");
        } else {
            System.out.println("✗ Cantidad inválida");
        }
    }
    
    public void consultarSaldo() {
        System.out.println("\n=== ESTADO DE CUENTA ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: $" + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
}

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
```

"Este proyecto combina todo lo aprendido:
- **Métodos** para organizar el código
- **Scanner** para entrada del usuario
- **Clases y objetos** para modelar una cuenta bancaria
- **Encapsulación** con atributos privados
- **Bucle while** para el menú interactivo
- **if-else** para las decisiones

Es un programa completo y funcional que podrías expandir con más características."

**Cierre**
Ahora ya sabes crear tus propias clases y objetos. En la próxima lección, crearemos un proyecto más grande que combine todo lo que hemos aprendido. ¡Nos vemos pronto!

---

## Lección 6: Proyecto Final - Sistema de Gestión de Estudiantes (15 minutos)

### Guion Narrativo

**Introducción**
Bienvenidos a la lección final. Esta vez vamos a crear un proyecto completo: un Sistema de Gestión de Estudiantes. Este proyecto usará todo lo que hemos aprendido: variables, estructuras de control, métodos, clases, objetos y entrada del usuario. ¡Vamos a crear algo realmente útil!

**Diseño del Sistema**

```java
import java.util.Scanner;

// Clase para representar un estudiante
class Estudiante {
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
```

"Vamos a analizar nuestra clase `Estudiante`:

**1. Atributos:**
- `nombre`, `edad`, `grado`: Información básica
- `calificaciones[]`: Un array para guardar hasta 5 calificaciones
- `numCalificaciones`: Contador de cuántas calificaciones tiene

**2. Constructor:**
Inicializa el estudiante con información básica y crea el array vacío.

**3. Métodos principales:**
- `agregarCalificacion()`: Agrega una calificación con validación
- `calcularPromedio()`: Usa un bucle for para sumar y dividir
- `obtenerLetraCalificacion()`: Convierte el promedio en letra
- `mostrarInformacionCompleta()`: Presenta toda la información formateada

**Arrays básicos:**
Un array es como una lista de elementos del mismo tipo:
```java
double[] calificaciones = new double[5];  // 5 espacios
calificaciones[0] = 85.5;  // Primera posición
calificaciones[1] = 92.0;  // Segunda posición
```

**Versión Extendida con Múltiples Estudiantes**

```java
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
```

"Esta ejemplo maneja **múltiples estudiantes** usando arrays:

**Nuevas características:**
1. **Array de objetos**: `Estudiante[] estudiantes` guarda hasta 10 estudiantes
2. **Búsqueda**: El método `buscarEstudiante()` busca por nombre
4. **Comparación de strings**: `equalsIgnoreCase()` compara texto sin importar mayúsculas

## Lección 7: Mejores Prácticas y Consejos
"¡Hola! Esta es nuestra última lección juntos, vamos a repasar algunas mejores practicas y consejos  a la hora de codificar, y te daré algunas recomendaciones finales para continuar tu viaje en programación."
```java
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
```

"**Mejores prácticas que debes seguir:**

1. **Nombres claros y descriptivos**: Los nombres deben explicar qué hace o guarda la variable
2. **Constantes en mayúsculas**: Valores que no cambian, como `MAX_ESTUDIANTES`
3. **Comentarios útiles**: Explica el 'por qué', no el 'qué'
4. **Valida siempre los datos**: No asumas que el usuario ingresará datos correctos
5. **Maneja errores**: Usa try-catch para evitar que tu programa se cierre inesperadamente
6. **DRY (Don't Repeat Yourself)**: Si copias y pegas código, probablemente necesitas un método
7. **Indentación consistente**: Hace tu código legible

**Errores comunes de principiantes:**
- Olvidar el punto y coma (;)
- Confundir = (asignación) con == (comparación)
- No cerrar llaves { }
- Olvidar nextLine() después de nextInt()
- No validar datos de entrada
- Nombres de variables inconsistentes"

**Próximos Pasos y Recursos**

"**¡Felicitaciones! Has completado el curso de Java para principiantes.**

**Lo que has aprendido:**
✓ Fundamentos de programación
✓ Variables y tipos de datos
✓ Estructuras de control (if-else, for, while)
✓ Métodos y funciones
✓ Programación Orientada a Objetos
✓ Clases y objetos
✓ Encapsulación
✓ Arrays básicos
✓ Entrada y salida de datos

**¿Qué sigue ahora?**

**1. Practica constantemente:**
   - Modifica los proyectos del curso
   - Crea tus propios programas
   - Resuelve problemas de programación

**2. Temas intermedios para explorar:**
   - ArrayList (listas dinámicas)
   - Herencia y polimorfismo
   - Interfaces
   - Manejo de archivos
   - Excepciones avanzadas

**3. Recursos recomendados:**
   - Oracle Java Documentation: docs.oracle.com/javase
   - Codecademy Java Course
   - HackerRank para practicar
   - LeetCode para desafíos

**4. Proyectos para practicar:**
   - Sistema de biblioteca
   - Juego de tres en raya (Tic-Tac-Toe)
   - Calculadora científica
   - Lista de tareas (To-Do List)
   - Conversor de unidades

**Consejos finales:**
- La programación se aprende programando, no solo viendo videos
- Es normal cometer errores; son parte del aprendizaje
- Google es tu amigo; aprende a buscar soluciones
- Empieza con proyectos pequeños y ve aumentando la complejidad
- Comparte tu código y pide retroalimentación


**¡Muchas gracias por completar este curso!** Espero que este curso te siva como primer paso para empezar en tu viaje en el mundo de la programación y el software en general!


**Inspiración Final**

"**Antes de despedirnos, quiero compartir esto contigo:**

Cada programador exitoso comenzó exactamente donde estás tú ahora. Steve Jobs, Bill Gates, Mark Zuckerberg, todos empezaron sin saber nada de programación.

**Lo que te hace diferente:**
- Tienes acceso a recursos que ellos no tenían
- Tienes una comunidad global dispuesta a ayudar
- Tienes las herramientas para crear cualquier cosa que imagines

**Mensaje final:**
La programación no es solo escribir código. Es resolver problemas, ser creativo, y construir cosas que pueden cambiar el mundo. Puede parecer difícil a veces, pero cada error es una oportunidad para aprender.

No te compares con otros. Compárate con quien eras ayer. Si hoy sabes más que ayer, vas en el camino correcto.


**¡Gracias por acompañarme en este curso!** Fue un placer ser parte de tu inicio en programación. Ahora ve, practica, crea, y sobre todo diviertete programando!

