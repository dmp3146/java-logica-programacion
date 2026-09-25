# Grafos

Un grafo es un conjunto de vértices (nodos) conectados por aristas (conexiones), que puede
representar redes de todo tipo: ciudades y carreteras, personas y amistades, páginas web y
enlaces, tareas y sus dependencias, entre muchos otros ejemplos.

## Representaciones

**Matriz de adyacencia**: una matriz de N x N donde la posición `[i][j]` indica si existe una
arista entre el vértice i y el vértice j (y opcionalmente su peso). Es simple pero gasta memoria
si el grafo tiene pocas conexiones.

**Lista de adyacencia**: para cada vértice se guarda solo la lista de sus vecinos, por ejemplo
usando `Map<Integer, List<Integer>>`. Es más eficiente en memoria para grafos con pocas conexiones.

## Recorridos

- **BFS (Breadth-First Search / anchura)**: usa una cola; visita primero todos los vecinos
  directos antes de avanzar al siguiente nivel. Sirve para encontrar el camino más corto en
  número de aristas en un grafo no ponderado.
- **DFS (Depth-First Search / profundidad)**: usa recursión o una pila explícita; avanza lo más
  posible por una rama antes de retroceder. Sirve para detectar ciclos, componentes conexas y
  orden topológico.

## Grafos dirigidos y ponderados

Un grafo puede ser **dirigido** (las aristas tienen un sentido, A → B no implica B → A) o
**ponderado** (cada arista tiene un costo o peso asociado, útil para calcular rutas más cortas
con algoritmos como Dijkstra).

## Ejercicios

En esta etapa resolverás 20 ejercicios que cubren las dos representaciones, BFS, DFS, detección de
ciclos, componentes conexas, orden topológico, grafos ponderados y versiones básicas de Dijkstra y
Prim.

## Índice de ejercicios

1. **Representar un grafo con matriz de adyacencia**
2. **Representar un grafo con lista de adyacencia**
3. **Agregar y eliminar aristas**
4. **Recorrido en anchura (BFS)**
5. **Recorrido en profundidad (DFS) recursivo**
6. **Recorrido en profundidad (DFS) iterativo**
7. **Detectar ciclos en un grafo no dirigido**
8. **Detectar ciclos en un grafo dirigido**
9. **Contar componentes conexas**
10. **Verificar si un grafo es conexo**
11. **Camino más corto en un grafo no ponderado (BFS)**
12. **Mostrar un camino entre dos vértices**
13. **Orden topológico de un grafo dirigido acíclico (DAG)**
14. **Verificar si un grafo es bipartito**
15. **Grado de cada vértice**
16. **Grafo ponderado con lista de adyacencia**
17. **Camino más corto con Dijkstra (básico)**
18. **Árbol de expansión mínima con Prim (básico)**
19. **Modelar una red social como grafo**
20. **Coloreo simple de un grafo con 2 colores**
