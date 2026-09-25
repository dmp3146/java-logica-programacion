# Colecciones en Java

El framework de colecciones de Java (`java.util`) ofrece estructuras ya construidas para guardar
grupos de objetos, mucho más flexibles que los arreglos de tamaño fijo usados en la parte de
vectores y matrices de la guía original.

## Listas (List)

`ArrayList` y `LinkedList` implementan la interfaz `List`: permiten elementos repetidos y mantienen
el orden de inserción. `ArrayList` es más rápido para acceder por índice; `LinkedList` es más
eficiente para insertar/eliminar en los extremos.

```java
List<String> nombres = new ArrayList<>();
nombres.add("Ana");
nombres.add("Luis");
for (String n : nombres) {
    System.out.println(n);
}
```

## Conjuntos (Set)

`HashSet`, `LinkedHashSet` y `TreeSet` implementan `Set`: no permiten elementos repetidos.
`TreeSet` además los mantiene ordenados y `LinkedHashSet` conserva el orden de inserción.

## Mapas (Map)

`HashMap`, `LinkedHashMap` y `TreeMap` implementan `Map`: guardan pares clave-valor, donde cada
clave es única.

```java
Map<String, Integer> precios = new HashMap<>();
precios.put("Pan", 2000);
precios.put("Leche", 4500);
for (Map.Entry<String, Integer> e : precios.entrySet()) {
    System.out.println(e.getKey() + ": " + e.getValue());
}
```

## Ordenar colecciones

`Collections.sort()` ordena una `List` usando el orden natural (`Comparable`) de sus elementos o
un `Comparator` externo que se le pase como segundo parámetro, sin tener que modificar la clase
original de los objetos.

## Ejercicios

En esta etapa resolverás 35 ejercicios que recorren listas, conjuntos, mapas, ordenamiento con
Comparable/Comparator, colecciones inmutables y algunos problemas típicos de procesamiento de
datos usando estas estructuras.

## Índice de ejercicios

1. **ArrayList de enteros**
2. **ArrayList de objetos**
3. **Recorrido con for-each e iterator**
4. **Eliminar elementos de un ArrayList mientras se recorre**
5. **Buscar y modificar en un ArrayList de objetos**
6. **LinkedList como lista**
7. **LinkedList como pila/cola simple**
8. **Comparar ArrayList y LinkedList**
9. **HashSet para eliminar duplicados**
10. **TreeSet ordenado**
11. **LinkedHashSet y orden de inserción**
12. **Operaciones de conjuntos con Set**
13. **HashMap básico (clave-valor)**
14. **Contador de frecuencia de palabras**
15. **TreeMap ordenado por clave**
16. **LinkedHashMap y orden de inserción**
17. **Recorrer un Map con Map.Entry**
18. **Map con listas como valor**
19. **computeIfAbsent para inicializar listas**
20. **Agrupar objetos por una propiedad**
21. **Ordenar una lista con Comparator**
22. **Ordenar por varios criterios**
23. **Comparable vs Comparator**
24. **Búsqueda binaria en una lista ordenada**
25. **Colecciones inmutables**
26. **Lista de solo lectura a partir de una mutable**
27. **Convertir arreglo a lista y viceversa**
28. **HashSet con objetos personalizados**
29. **Merge de conteos con Map.merge**
30. **Índice invertido simple**
31. **Deque como pila y como cola**
32. **Eliminar elementos repetidos conservando el orden**
33. **Top-N elementos de una colección**
34. **Diccionario bilingüe con Map**
35. **Sistema de votación con colecciones**
