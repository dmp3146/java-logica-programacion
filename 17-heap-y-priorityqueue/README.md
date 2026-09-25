# Heap y PriorityQueue

Un **heap** (montículo) es un árbol binario casi completo que cumple la propiedad de heap: en un
**heap máximo**, cada nodo padre es mayor o igual que sus hijos; en un **heap mínimo**, cada nodo
padre es menor o igual que sus hijos. Gracias a esta propiedad, el máximo (o mínimo) siempre está
en la raíz y se puede consultar u obtener en tiempo constante.

## Representación con arreglo

Un heap se suele representar con un simple arreglo, donde para un nodo en la posición `i`:

- su hijo izquierdo está en `2*i + 1`
- su hijo derecho está en `2*i + 2`
- su padre está en `(i - 1) / 2`

## Operaciones básicas

- **insertar**: se agrega el nuevo valor al final del arreglo y se "flota" hacia arriba
  (*sift-up*) intercambiándolo con su padre mientras rompa la propiedad de heap.
- **extraerMaximo/extraerMinimo**: se guarda la raíz, se reemplaza por el último elemento del
  arreglo y se "hunde" hacia abajo (*sift-down*) hasta restaurar la propiedad de heap.
- **heapify**: convierte un arreglo desordenado completo en un heap válido de forma eficiente,
  sin insertar elemento por elemento.

## PriorityQueue de Java

Java ya trae `PriorityQueue<E>`, que por defecto se comporta como un heap mínimo (el elemento más
pequeño según su orden natural o un `Comparator` sale primero):

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(1);
pq.offer(3);
System.out.println(pq.poll()); // 1
```

## Usos típicos

Colas de prioridad reales (urgencias, tareas), Heap Sort, encontrar los k elementos más grandes o
más pequeños de un conjunto, calcular la mediana de un flujo de datos y mezclar listas ordenadas.

## Ejercicios

En esta etapa resolverás 15 ejercicios que van desde implementar un heap con arreglo hasta usar
`PriorityQueue` en problemas reales como colas de prioridad, top-k y mediana de un flujo.

## Índice de ejercicios

1. **Heap máximo con arreglo (inserción)**
2. **Extraer el máximo del heap**
3. **Heapify de un arreglo desordenado**
4. **Heap Sort**
5. **Heap mínimo con arreglo**
6. **PriorityQueue de Java (orden natural)**
7. **PriorityQueue con Comparator personalizado**
8. **Cola de tareas con prioridad**
9. **Los k elementos más grandes**
10. **Los k elementos más pequeños**
11. **K-ésimo elemento más grande en un flujo de datos**
12. **Verificar si un arreglo representa un heap válido**
13. **Mezclar k listas ordenadas usando un heap**
14. **Elementos más frecuentes usando heap**
15. **Mediana de un flujo de números con dos heaps**
