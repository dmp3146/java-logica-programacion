# Ruta de aprendizaje de Spring Boot

Ruta práctica de diez ejercicios para aprender a construir APIs con Java 17, Spring Boot y Maven, desde una API en memoria hasta una plataforma de reservas integradora.

## Punto de partida

Esta etapa amplía las rutas de lógica y estructuras de datos del repositorio. Se recomienda haber practicado clases, métodos, colecciones, excepciones, POO, pruebas básicas y Git antes de empezar. No es necesario conocer Spring Boot.

Cada ejercicio tiene su propio README en la raíz de su carpeta. Los documentos especifican el problema y orientan el diseño, pero **no incluyen las aplicaciones implementadas**. Resuelve cada paso, prueba el comportamiento y justifica las decisiones en vez de copiar una solución completa.

## Compatibilidad y herramientas

- **Java:** 17, que también es la versión indicada por el `pom.xml` raíz del repositorio.
- **Spring Boot:** usa la línea estable **4.1.x** compatible con Java 17; la referencia consultada indica que Spring Boot 4.1.1 requiere como mínimo Java 17. Comprueba la versión de mantenimiento disponible en Spring Initializr al crear cada proyecto y conserva la misma línea durante el ejercicio.
- **Construcción:** Maven y Maven Wrapper (`mvnw.cmd` en Windows) para evitar depender de una instalación global de Maven.
- **Entorno:** Windows y VS Code; JDK 17 instalado y seleccionado como JDK del proyecto.
- **Pruebas de API:** `curl.exe` en PowerShell o archivos `.http` de REST Client. No se requiere Thunder Client.

Consulta la [documentación oficial de requisitos de Spring Boot](https://docs.spring.io/spring-boot/system-requirements.html) antes de comenzar, porque versiones y requisitos pueden cambiar. El proyecto Maven raíz existente es una colección de ejercicios y no se debe convertir en una aplicación Spring Boot; cada ejercicio que necesite una aplicación tendrá su propio `pom.xml`.

### Crear y ejecutar un ejercicio

1. Abre [Spring Initializr](https://start.spring.io/) o usa su extensión en VS Code. Selecciona Maven, Java, la línea de Spring Boot indicada arriba, Java 17 y las dependencias listadas en el README del ejercicio.
2. Genera el proyecto dentro de la carpeta indicada, conservando el README del ejercicio.
3. En PowerShell, desde la carpeta del proyecto:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

4. Ejecuta las pruebas:

   ```powershell
   .\mvnw.cmd test
   ```

5. Usa los ejemplos de `curl.exe` o crea un archivo `.http` con las solicitudes propuestas.

El Wrapper se genera con el proyecto de Spring Initializr. Si el comando no está disponible, verifica que estés en el directorio que contiene `mvnw.cmd` y que Java 17 esté en `JAVA_HOME`.

## Ruta

| Ejercicio | Nivel | Enfoque |
|---|---|---|
| [001 — Mi primera API](001-mi-primera-api/README.md) | Principiante | Endpoints REST y almacenamiento en memoria |
| [002 — Productos y validaciones](002-api-productos-validaciones/README.md) | Principiante–intermedio | DTO, validación y errores HTTP |
| [003 — Gestor de gastos](003-gestor-gastos/README.md) | Intermedio inicial | JPA y persistencia relacional |
| [004 — Inventario con SOLID](004-inventario-solid/README.md) | Intermedio | Dominio, transacciones y SOLID |
| [005 — Agenda hexagonal](005-agenda-hexagonal/README.md) | Intermedio–avanzado | Puertos, adaptadores y dominio aislado |
| [006 — Usuarios y seguridad](006-usuarios-seguridad/README.md) | Intermedio–avanzado | Autenticación y autorización |
| [007 — Pedidos y pagos simulados](007-pedidos-pagos/README.md) | Avanzado inicial | Reglas, idempotencia y monolito modular |
| [008 — Calidad, pruebas y CI](008-calidad-pruebas-ci/README.md) | Avanzado inicial | Pruebas, documentación y automatización |
| [009 — Notificaciones y eventos](009-notificaciones-eventos/README.md) | Avanzado | Eventos internos y asincronía |
| [010 — Plataforma de reservas](010-plataforma-reservas/README.md) | Integrador avanzado | Diseño integral y concurrencia |

## Cómo estudiar cada ejercicio

Avanza en este orden: comprender el problema; separar requisitos y reglas; diseñar lo mínimo necesario; crear la estructura inicial; implementar en incrementos; probar casos correctos y límite; refactorizar solo cuando haya una razón; documentar y revisar. Mantén una lista de dudas y decisiones. Los tiempos de cada ejercicio son estimaciones, no fechas límite.

## Regla de aprendizaje

El objetivo no es completar diez carpetas rápidamente. Antes de avanzar, intenta explicar qué recibe cada endpoint, quién ejecuta cada regla, dónde se guardan los datos y cómo sabes que el comportamiento es correcto. Evita interfaces, servicios, bases de datos, mensajería o infraestructura que el ejercicio todavía no necesita.
