# Pila (Stack)

Una pila es una estructura de datos LIFO (*Last In, First Out*): el último elemento que entra es
el primero que sale, como una pila de platos.

## Operaciones principales

- **apilar / push**: agregar un elemento en la parte superior de la pila.
- **desapilar / pop**: quitar y retornar el elemento de la parte superior.
- **verTope / peek**: consultar el elemento superior sin quitarlo.
- **estaVacia**: verificar si la pila no tiene elementos.

## Con la clase Stack de Java

```java
Stack<Integer> pila = new Stack<>();
pila.push(10);
pila.push(20);
System.out.println(pila.peek()); // 20
System.out.println(pila.pop());  // 20
System.out.println(pila.pop());  // 10
```

## Implementación propia con arreglo

```java
public class PilaEntero {
    private int[] datos;
    private int tope;

    public PilaEntero(int capacidad) {
        datos = new int[capacidad];
        tope = -1;
    }

    public void apilar(int valor) { datos[++tope] = valor; }
    public int desapilar() { return datos[tope--]; }
    public boolean estaVacia() { return tope == -1; }
}
```

## Usos típicos de una pila

Verificar paréntesis balanceados, deshacer acciones (Ctrl+Z), evaluar expresiones matemáticas,
convertir notación infija a postfija, el botón "atrás" del navegador y el control de llamadas
recursivas de cualquier programa (la pila de llamadas).

## Ejercicios

En esta etapa resolverás 12 ejercicios que van desde la implementación básica de una pila hasta
aplicaciones clásicas como balanceo de paréntesis, evaluación de expresiones postfijas y
simulación de deshacer/rehacer.

## Índice de ejercicios

1. **Pila con la clase Stack de Java**
2. **Implementación propia de una pila con arreglo**
3. **Implementación propia de una pila genérica**
4. **Verificar paréntesis balanceados**
5. **Invertir una cadena con una pila**
6. **Verificar si una palabra es palíndromo con pila**
7. **Evaluar una expresión postfija (notación polaca inversa)**
8. **Convertir una expresión infija a postfija**
9. **Simular el botón 'atrás' de un navegador**
10. **Pila con seguimiento del mínimo (Min Stack)**
11. **Verificar etiquetas HTML balanceadas**
12. **Simulación de deshacer (undo) en un editor de texto**
