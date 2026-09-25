# Programación Orientada a Objetos (POO)

Esta etapa se agrega después de la parte principal de lógica y estructuras que aparece en la guía
del ITM, para profundizar en Programación Orientada a Objetos usando Java de forma completa
(no solo el enfoque de "clase con método principal" que se vio en la guía original).

## Pilares de la POO

- **Abstracción**: modelar del mundo real solo lo relevante para el problema (atributos y comportamientos).
- **Encapsulación**: proteger los atributos de una clase (privados) y exponerlos mediante métodos
  públicos (getters/setters), controlando cómo se accede y modifica el estado de un objeto.
- **Herencia**: permite que una clase (subclase) reutilice atributos y métodos de otra (superclase),
  usando la palabra clave `extends` y `super` para invocar el constructor o métodos del padre.
- **Polimorfismo**: un mismo método puede comportarse distinto según el objeto real que lo ejecute,
  gracias a la sobreescritura (`@Override`) de métodos en las subclases.

## Clases, objetos y constructores

```java
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }
}
```

## Herencia y polimorfismo

```java
public class Animal {
    protected String nombre;
    public Animal(String nombre) { this.nombre = nombre; }
    public void hacerSonido() { System.out.println(nombre + " hace un sonido"); }
}

public class Perro extends Animal {
    public Perro(String nombre) { super(nombre); }
    @Override
    public void hacerSonido() { System.out.println(nombre + " dice Guau"); }
}
```

## Clases abstractas e interfaces

Una clase abstracta puede tener métodos con cuerpo y métodos abstractos (sin cuerpo) que las
subclases están obligadas a implementar. Una interfaz define un contrato de métodos que cualquier
clase que la implemente debe cumplir, y en Java una clase puede implementar varias interfaces a la vez.

## Composición vs herencia

La **composición** ("tiene un") es tan importante como la herencia ("es un"): por ejemplo, un `Auto`
"tiene un" `Motor`, en vez de "ser un" `Motor`. Se prefiere composición cuando la relación no es
realmente una jerarquía de tipos.

## Ejercicios

En esta etapa resolverás 30 ejercicios progresivos: desde clases y objetos simples, pasando por
encapsulación, herencia y polimorfismo, hasta interfaces, enums y un pequeño proyecto integrador
que combina todo lo anterior.

## Índice de ejercicios

1. **Clase y objeto básicos**
2. **Constructores**
3. **Sobrecarga de constructores**
4. **Encapsulación con getters y setters**
5. **Clase Rectángulo con cálculo de área**
6. **Clase Círculo con perímetro y área**
7. **Uso de this**
8. **Clase Producto con inventario simple**
9. **Composición: Auto y Motor**
10. **Composición: Persona y Dirección**
11. **Herencia básica: Animal y Perro**
12. **Herencia con super**
13. **Jerarquía de empleados**
14. **Polimorfismo con arreglo de objetos**
15. **Clase abstracta Figura**
16. **Interfaz Comparable simple**
17. **Interfaz propia Pagable**
18. **Múltiples interfaces**
19. **toString y equals**
20. **Enum de días de la semana**
21. **Enum con atributos**
22. **Clase estática Utilidades**
23. **Atributos y métodos estáticos vs de instancia**
24. **Agregación: Curso y Estudiantes**
25. **Relación asociación: Cliente y Pedido**
26. **Sobrecarga de métodos**
27. **Diagrama UML a código**
28. **Interfaz funcional simple**
29. **Composición con lista de objetos**
30. **Mini proyecto POO integrador**
