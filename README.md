# Fundamentos de Java para Principiantes 
## Resumen del Curso 
Este curso corto introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo 
programación orientada a objetos. **¡No requiere descargas!** Solo abre tu navegador web. 

**Duración total**: ~110 minutos

**Público Objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación

**Prerrequisitos**: Ninguno

**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox,Safari, Edge) 

**📂 Repositorio de Código Fuente**: [https://github.com/2025-2-Project-PsychoTest/java-fundamentals-course-PsychoMetric](https://github.com/2025-2-Project-PsychoTest/java-fundamentals-course-PsychoMetric) 

## Secuencia de la Lección 

### Lección 1: ¿Qué es Java y la Programación? (5 minutos) 
- **Descripción**: Aprende qué es la programación y por qué Java es un excelente lenguaje para empezar. 
- **Enlace**: [Ver la lección](https://youtu.be/hzoY2fPWolc) 
- **Conclusiones clave**: 
    - Java es un lenguaje de programación usado en millones de dispositivos - desde teléfonos Android hasta aplicaciones empresariales

    - La programación es dar instrucciones precisas a una computadora - como seguir una receta paso a paso

    - Java funciona en cualquier lugar - "Write Once, Run Anywhere" (Escribe una vez, ejecuta en cualquier lugar)

    - System.out.println() es el comando para mostrar texto en pantalla

    - Todo código Java vive dentro de clases - la estructura básica es public class y public static void main

    - No necesitas instalar nada - puedes programar directamente desde tu navegador con editores online
- **Empieza a programar**: [Abrir OnlineGDB - Hola mundo](https://onlinegdb.com/4wXIqWOWg-) 

### Lección 2: Variables y tipos de datos (17 minutos) 
- **Descripción**: Aprende a almacenar datos en Java usando variables. 
- **Enlace**: [Ver la lección](https://youtu.be/P4W9zhnOjuU) 
- **Conclusiones clave**: 

    - Las variables son cajas que guardan información - tienen nombre, tipo y valor 
    - Tipos de datos principales en Java:

        **int** → números enteros (edad, puntos, nivel)

        **double** → números decimales (altura, promedio, precio)

        **String** → texto (nombres, mensajes)

        **boolean** → verdadero o falso (estaActivo, tieneVidas)

        **char** → un solo carácter (inicial, grado)

    - Siempre debes declarar el tipo antes de usar una variable: int edad = 15;
    - Puedes hacer operaciones con variables: suma (+), resta (-), multiplicación (*), división (/)
    - Usa camelCase para nombres: nombreDelEstudiante, puntajeMaximo
    - Las variables pueden cambiar su valor: puntos = puntos + 10;

- **Práctica**: [Clic para ir al ejemplo](https://onlinegdb.com/-yF15Rj2ES) 

### Lección 3: Estructuras de control: Decisiones y bucles (24 minutos) 
- **Descripción**: Toma decisiones con if-else y repite tareas con bucles. 
- **Enlace**: [Ver la lección](https://youtu.be/k9nW3ojo6a0) 
- **Conclusiones clave**: 
    - if-else permite tomar decisiones - el programa elige qué hacer según condiciones

    - Operadores de comparación: == (igual), != (diferente), >, <, >=, <=

    - Operadores lógicos: && (Y), || (O), ! (NO)

    - El bucle for es perfecto cuando sabes cuántas veces repetir - tiene inicio, condición e incremento

    - El bucle while repite mientras una condición sea verdadera - úsalo cuando no sabes cuántas iteraciones necesitas

    - i++ es lo mismo que i = i + 1 - incrementa el valor en 1

    - Puedes anidar estructuras - if dentro de while, for dentro de if, etc.

    - Cuidado con los bucles infinitos - siempre asegúrate de que la condición eventualmente sea falsa

- **Práctica**: Ejemplos desarrollados

    - [if-else](https://onlinegdb.com/MSY_Kw1Irz) 

    - [bucle for](https://onlinegdb.com/TCkCvC2wIU) 

    - [bucle while](https://onlinegdb.com/MNIXbwUcE)

### Lección 4: Métodos, Entrada/Salida  (20 minutos) 
- **Descripción**: Crea código reutilizable con métodos, obtén la entrada del usuario. 
- **Enlace**: [Ver la lección](https://youtu.be/ZJIrlTE-7NU) 
- **Conclusiones clave**: 

    - Los métodos son bloques de código reutilizables - escribe una vez, usa muchas veces

    - Estructura de un método: tipo de retorno, nombre, parámetros y cuerpo

    - void significa que el método no devuelve nada - solo realiza acciones

    - return devuelve un valor al código que llamó al método

    - Scanner permite obtener entrada del usuario:

        - nextLine() para texto
        - nextInt() para enteros
        - nextDouble() para decimales
- **Práctica**: Ejemplos realizados

    - [Ejemplo 1](https://onlinegdb.com/8681yMez-)
    - [Ejemplo 2](https://onlinegdb.com/dNtFryC9GS)


### Lección 5: Fundamentos de POO y programas sencillos (22 minutos) 
- **Descripción**: Construye clases con atributos/métodos y crea un programa POO básico. 
- **Enlace**: [Ver la lección](https://youtu.be/LR62d60cs5k) 
- **Conclusiones clave**: 
    - Una clase es un molde o plantilla - define características y comportamientos
    - Un objeto es una instancia de una clase, algo concreto creado a partir del molde
    - Componentes de una clase:

        - Atributos (características): variables que guardan información
        - Constructor: método especial que crea el objeto
        - Métodos (acciones): lo que el objeto puede hacer

    - **Encapsulación**: usar private para proteger datos y getters/setters para acceder a ellos
    - **this** se refiere al objeto actual - distingue atributos de parámetros

- **Práctica**: Ejemplo realizado:
    - [Ejemplo 1 de aplicación POO](https://onlinegdb.com/vPPsxdMSv8) 
    - [Ejemplo 2 de aplicación POO](https://onlinegdb.com/VogkXdsCM) 

 ### Lección 6: Aplicando lo aprendido - Sistema de Gestión de Estudiantes (15 minutos) 

 - **Descripción**: Realiza un programa básico con todo lo aprendido hasta este punto del curso.
 - **Enlace**: [Ver la lección](https://youtu.be/daCRbDRO9TI) 

 - **Conclusiones clave**: 
    - Los arrays guardan múltiples valores del mismo tipo - int[] numeros = new int[5];
    - Los índices de arrays empiezan en 0 - un array de tamaño 5 tiene índices 0-4
    - Puedes crear arrays de objetos - Estudiante[] estudiantes = new Estudiante[10];
    - Los bucles for son perfectos para recorrer arrays
    - Switch es ideal para menús - alternativa limpia a múltiples if-else
    - Organiza tu código en métodos - hace el programa más legible y mantenible
    - Valida siempre la entrada del usuario - nunca asumas que ingresarán datos correctos
    - Combina todo lo aprendido - variables, estructuras de control, métodos, clases y objetos
    - Un proyecto real usa múltiples conceptos juntos - así funciona la programación profesional
 - **Proyecto final**: [Proyecto completo](https://onlinegdb.com/LAH46xsCjg) 

### Lección 7: Consejos y buenas practicas a seguir (11 minutos) 

- **Descripción**: Mejores prácticas, errores comunes y dónde aprender más.
- **Enlace**: [Ver la lección](https://youtu.be/i8-4zE8Sqhk) 
- **Consejos clave**: 

    - Errores Más Comunes:

        - Olvidar el punto y coma ";" al final de las instrucciones
        - Confundir = (asignación) con == (comparación)
        - No respetar mayúsculas/minúsculas - Java es case-sensitive
        - No limpiar el buffer del Scanner - usa nextLine() después de nextInt()

    - Mejores Prácticas:

        - Usa nombres descriptivos para variables y métodos
        - Indenta correctamente tu código para legibilidad
        - Comenta lo importante - explica el "por qué", no el "qué"
        - Valida los datos antes de usarlos
        - DRY: Don't Repeat Yourself - usa métodos para código repetido

    - Técnicas de Depuración:

        - Usa System.out.println() para rastrear valores
        - Lee los mensajes de error con atención
        - Prueba con casos simples primero


- **Proyecto creado**: [Proyecto de consejos](https://onlinegdb.com/UbF66l_JB4) 

## Recursos adicionales 

- **Código fuente completo**: [Repositorio de GitHub](https://github.com/2025-2-Project-PsychoTest/java-fundamentals-course-PsychoMetric) 

- **Playlist en YouTube** : [Ver la playlist del curso Completa](https://www.youtube.com/playlist?list=PLnwsq74kEtUti74vCeuiPh9HX83yTlzPS)

- **Todas las actividades prácticas**: 

| Número de lección | Actividad | Empezar a programar | 
|----------|----------|-------------| 
| 1 | Hola mundo | [OnlineGDB](https://onlinegdb.com/4wXIqWOWg-) | 
| 2 | Variables | [OnlineGDB](https://onlinegdb.com/-yF15Rj2ES ) | 
| 3 | Bucles | OnlineGDB: <br>[if-else](https://onlinegdb.com/MSY_Kw1Irz)<br>[bucle for](https://onlinegdb.com/TCkCvC2wIU)<br>[bucle while](https://onlinegdb.com/MNIXbwUcE)| 
| 4 | Métodos, Entrada y Salida  | OnlineGDB:<br>[Ejemplo 1](https://onlinegdb.com/8681yMez-)<br>[Ejemplo 2](https://onlinegdb.com/dNtFryC9GS) | 
| 5 | Programa OOP | OnlineGDB:<br>[Ejemplo 1](https://onlinegdb.com/VogkXdsCM)<br>[Ejemplo 2](https://www.onlinegdb.com/vPPsxdMSv8) | 
| 6 | Programa gestión de estudiantes | [OnlineGDB](https://onlinegdb.com/LAH46xsCjg) | 
| 7 | Buenas practicas | [OnlineGDB](https://onlinegdb.com/UbF66l_JB4) | 


**¡Gracias por completar el curso!** 

## Elaboración 
Universidad Peruana de Ciencias Aplicadas <br>
Carrera de Ingeniería de Software <br>
Período 202520 <br>
1ASI0729 Desarrollo de Aplicaciones Open Source <br>
NRC 7377 <br>
**Nombre del equipo**: PsychoMetric <br>
**Integrantes del equipo**: Victor Manuel Rojas Reategui <br>
**Fecha de entrega**: 16/11/2025 <br>
