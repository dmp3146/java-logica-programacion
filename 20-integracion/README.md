# Ejercicios de Integración

Esta etapa no introduce estructuras nuevas: su objetivo es combinar, en un mismo ejercicio, varias
de las herramientas aprendidas a lo largo del curso (POO, colecciones, pilas, colas, árboles,
grafos, recursión y manejo de excepciones), tal como ocurre en un sistema real.

## Por qué integrar

En un proyecto de software casi nunca se usa una sola estructura de datos de forma aislada: un
sistema de biblioteca necesita clases (POO) para modelar libros y usuarios, colecciones para
almacenarlos, una cola para las listas de espera y excepciones para validar operaciones inválidas,
todo trabajando junto.

## Cómo abordar estos ejercicios

1. Identifique primero las **entidades** del problema (con POO): ¿qué objetos existen?
2. Decida qué **colección** es más adecuada para cada relación: ¿lista, mapa, conjunto?
3. Identifique si el problema necesita una **estructura especializada**: pila (para deshacer o
   anidar), cola (para turnos u órdenes de llegada), árbol (para jerarquías u orden), grafo (para
   conexiones o rutas).
4. Defina qué situaciones son **errores esperables** del negocio (no del código) y modélelas con
   excepciones propias, en vez de dejar que el programa falle sin control.

## Ejercicios

En esta etapa resolverás 25 ejercicios que combinan dos o más de las estructuras y técnicas vistas
en las etapas anteriores, como preparación directa para los proyectos finales de la carpeta
`21-apps-finales`.

## Índice de ejercicios

1. **Inventario con ArrayList y HashMap**
2. **Agenda de contactos con POO y colecciones**
3. **Sistema de biblioteca con cola de espera**
4. **Historial de navegación con pila y deshacer/rehacer**
5. **Evaluador de expresiones combinando pila y recursión**
6. **Analizador de texto con Map y ordenamiento**
7. **Sistema de empleados con POO, colecciones y excepciones**
8. **Carrito de compras con lista y mapa de precios**
9. **Caché LRU simple con lista enlazada y mapa**
10. **Deduplicación de contactos con Set y equals/hashCode**
11. **Buscador de rutas con grafo y pila (DFS)**
12. **Sistema bancario con excepciones y colecciones**
13. **Mini motor de búsqueda con índice invertido**
14. **Árbol de categorías de un catálogo**
15. **Planificador de eventos con heap por fecha**
16. **Sistema de recomendaciones simple con grafo**
17. **Tokenizador con pila para validar código simple**
18. **Calculadora de rutas con grafo ponderado**
19. **Sistema de turnos combinando cola y prioridad**
20. **Registro de tareas con pila de deshacer y persistencia simple en archivo**
21. **Comparador de estructuras: ArrayList vs LinkedList vs árbol para búsquedas**
22. **Editor de mini-hoja de cálculo con matriz**
23. **Simulador de red social con grafo y colecciones**
24. **Sistema de reservas con validaciones y colecciones**
25. **Proyecto integrador: pequeño sistema de gestión académica**
