# Árboles Binarios y Árboles de Búsqueda (BST)

Un árbol binario es una estructura jerárquica donde cada nodo tiene como máximo dos hijos: uno
izquierdo y uno derecho. Un **árbol binario de búsqueda (BST)** además cumple una propiedad de
orden: para cada nodo, todos los valores del subárbol izquierdo son menores y todos los del
subárbol derecho son mayores.

## Nodo de árbol

```java
public class NodoArbol {
    int valor;
    NodoArbol izquierdo, derecho;

    public NodoArbol(int valor) {
        this.valor = valor;
    }
}
```

## Inserción en un BST

```java
public NodoArbol insertar(NodoArbol nodo, int valor) {
    if (nodo == null) return new NodoArbol(valor);
    if (valor < nodo.valor) nodo.izquierdo = insertar(nodo.izquierdo, valor);
    else nodo.derecho = insertar(nodo.derecho, valor);
    return nodo;
}
```

## Recorridos

- **Preorder** (raíz, izquierda, derecha): útil para copiar la estructura del árbol.
- **Inorder** (izquierda, raíz, derecha): en un BST entrega los valores en orden ascendente.
- **Postorder** (izquierda, derecha, raíz): útil para eliminar el árbol de abajo hacia arriba.
- **Por niveles (BFS)**: recorre el árbol nivel por nivel usando una cola auxiliar.

## Altura, balance y eliminación

La altura de un árbol es el número de niveles desde la raíz hasta la hoja más profunda. Un árbol
está **balanceado** cuando, para cada nodo, la diferencia de altura entre sus subárboles izquierdo
y derecho no supera 1. Eliminar un nodo de un BST requiere considerar tres casos: nodo hoja, nodo
con un solo hijo y nodo con dos hijos (en este último se suele reemplazar por el mínimo del
subárbol derecho o el máximo del izquierdo).

## Ejercicios

En esta etapa resolverás 20 ejercicios que cubren inserción, búsqueda, los tres recorridos
clásicos, recorrido por niveles, altura, balance, eliminación y problemas típicos sobre árboles.

## Índice de ejercicios

1. **Nodo de árbol binario**
2. **Insertar en un árbol binario de búsqueda (BST)**
3. **Buscar un valor en el BST**
4. **Recorrido inorder**
5. **Recorrido preorder**
6. **Recorrido postorder**
7. **Recorrido por niveles (BFS) con una cola**
8. **Contar nodos del árbol**
9. **Calcular la altura del árbol**
10. **Buscar el valor mínimo y máximo en un BST**
11. **Eliminar un nodo de un BST**
12. **Verificar si un árbol es un BST válido**
13. **Invertir (espejo) un árbol binario**
14. **Contar las hojas del árbol**
15. **Listar las hojas de izquierda a derecha**
16. **Encontrar el ancestro común más bajo (LCA)**
17. **Verificar si un árbol está balanceado**
18. **Calcular el diámetro del árbol**
19. **Construir un BST balanceado a partir de un arreglo ordenado**
20. **Contar nodos por nivel**
