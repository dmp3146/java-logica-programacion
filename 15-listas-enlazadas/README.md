# Listas Enlazadas

Una lista enlazada es una estructura de datos formada por nodos, donde cada nodo guarda un dato y
una referencia al siguiente nodo (y, en el caso de listas dobles, también al anterior). A
diferencia de un arreglo, no necesita un tamaño fijo definido de antemano y crecer o insertar en
el medio no requiere desplazar todos los elementos.

## Nodo simple

```java
public class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
```

## Lista enlazada simple

```java
public class ListaEnlazada {
    private Nodo cabeza;

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    public void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
```

## Lista doblemente enlazada

Cada nodo tiene referencia tanto al `siguiente` como al `anterior`, lo que permite recorrer la
lista en ambos sentidos y eliminar un nodo conociendo solo su referencia (sin tener que buscar el
nodo anterior desde el inicio).

## Comparación con ArrayList

Insertar o eliminar en los extremos de una lista enlazada es más rápido que en un `ArrayList`
grande (no hay que desplazar elementos), pero acceder a una posición específica es más lento
porque hay que recorrer nodo por nodo desde el inicio.

## Ejercicios

En esta etapa resolverás 15 ejercicios: desde crear nodos y una lista simple manualmente, hasta
invertir la lista, detectar ciclos, fusionar listas ordenadas y construir una lista doblemente
enlazada.

## Índice de ejercicios

1. **Nodo simple y creación manual**
2. **Insertar al inicio de una lista enlazada**
3. **Insertar al final de una lista enlazada**
4. **Insertar en una posición específica**
5. **Buscar un elemento en la lista**
6. **Eliminar un nodo por valor**
7. **Contar elementos de la lista**
8. **Encontrar el elemento del medio**
9. **Invertir una lista enlazada**
10. **Detectar un ciclo en la lista (Floyd)**
11. **Eliminar duplicados de una lista no ordenada**
12. **Insertar en una lista ordenada sin dañar el orden**
13. **Fusionar dos listas enlazadas ordenadas**
14. **Convertir la lista enlazada a arreglo y viceversa**
15. **Lista doblemente enlazada**
