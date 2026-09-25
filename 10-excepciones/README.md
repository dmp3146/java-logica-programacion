# Excepciones en Java

Esta etapa se agrega después de la parte principal de lógica y estructuras que aparece en la guía.

## ¿Qué es una excepción?

Una excepción es un evento que ocurre durante la ejecución y que puede interrumpir el flujo normal
del programa. En lugar de dejar que el programa falle sin control, podemos manejar determinados
errores.

## try / catch

La forma básica es:

```java
try {
    // Código que podría producir una excepción
} catch (Exception e) {
    // Qué hacer si ocurre
}
```

Ejemplo:

```java
try {
    int numero = Integer.parseInt("hola");
    System.out.println(numero);
} catch (NumberFormatException e) {
    System.out.println("El texto no representa un número entero.");
}
```

## finally

`finally` se utiliza para ejecutar código que debe ocurrir tanto si hubo excepción como si no:

```java
try {
    // operación
} catch (Exception e) {
    // manejo
} finally {
    // limpieza
}
```

## throw

Permite lanzar una excepción de forma explícita:

```java
if (edad < 0) {
    throw new IllegalArgumentException("La edad no puede ser negativa");
}
```

## throws

Indica que un método puede propagar una excepción:

```java
public void leerArchivo() throws IOException {
    // ...
}
```

## Importante

No conviene hacer:

```java
catch (Exception e) {
    // ignorar el error
}
```

sin entender qué ocurrió. Durante los ejercicios aprenderemos a capturar excepciones concretas,
validar entradas y decidir cuándo conviene lanzar una excepción propia.

## Ejercicios

1. Conversión segura de texto a entero.
2. División segura entre dos números.
3. Validación de edad.
4. Validación de notas.
5. Menú con entrada inválida.
6. Lectura segura de números decimales.
7. Índice fuera de rango.
8. Archivo inexistente.
9. Uso de `finally`.
10. Uso de `throw`.
11. Uso de `throws`.
12. Excepción personalizada.
13. Validación de datos de una persona.
14. Registro de errores.
15. Mini sistema que combine validaciones y excepciones.
