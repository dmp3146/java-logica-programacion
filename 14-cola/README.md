# Cola (Queue)

Una cola es una estructura de datos FIFO (*First In, First Out*): el primer elemento que entra es
el primero que sale, como una fila de personas esperando ser atendidas.

## Operaciones principales

- **encolar / offer**: agregar un elemento al final de la cola.
- **desencolar / poll**: quitar y retornar el elemento que está al frente de la cola.
- **verFrente / peek**: consultar el elemento del frente sin quitarlo.
- **estaVacia**: verificar si la cola no tiene elementos.

## Con la interfaz Queue de Java

```java
Queue<String> cola = new LinkedList<>();
cola.offer("Cliente 1");
cola.offer("Cliente 2");
System.out.println(cola.peek()); // Cliente 1
System.out.println(cola.poll()); // Cliente 1
```

## Cola circular

Cuando se implementa una cola con un arreglo de tamaño fijo, conviene que sea **circular**: al
llegar al final del arreglo, los índices de frente y final vuelven a "dar la vuelta" al inicio para
reutilizar los espacios que ya quedaron libres, en vez de desperdiciar memoria.

## Usos típicos de una cola

Sistemas de turnos y filas de atención, colas de impresión, planificación de procesos (round-robin),
recorrido en anchura (BFS) de árboles y grafos, y simulación de cualquier proceso donde el orden de
llegada debe respetarse.

## Ejercicios

En esta etapa resolverás 12 ejercicios que van desde la implementación básica de una cola hasta
aplicaciones como simulación de filas, colas circulares, colas con dos pilas y planificación
round-robin.

## Índice de ejercicios

1. **Cola con la interfaz Queue de Java**
2. **Implementación propia de una cola con arreglo**
3. **Cola circular**
4. **Cola genérica propia**
5. **Simulación de fila de un banco**
6. **Cola de impresión**
7. **Cola usando dos pilas**
8. **Problema de Josephus**
9. **Planificador round-robin simple**
10. **Turnos con prioridad manual**
11. **Cola con lista enlazada manual**
12. **Tiempo promedio de espera en una fila**
