# Ejercicio 001 — Mi primera API REST

**Nivel:** Principiante · **Tiempo estimado:** 4–6 horas

## Contexto y enunciado

Un cliente quiere una API sencilla para registrar y consultar tareas. Por ahora solo necesita mantenerlas mientras el servidor está encendido; todavía no solicita persistencia.

## Objetivos y conocimientos previos

Practicar Spring Boot, Maven, JSON, HTTP, controladores y operaciones CRUD. Antes: Java 17, clases, métodos, listas, objetos y conceptos básicos de HTTP. No hace falta base de datos ni DTO en esta primera versión.

## Requisitos

### Funcionales

1. Crear una tarea con título.
2. Consultar todas las tareas y una tarea por identificador.
3. Reemplazar los datos editables de una tarea existente.
4. Eliminar una tarea existente.
5. Usar identificadores únicos y devolver un error comprensible cuando la tarea no exista.

### No funcionales y reglas propuestas

- Los datos son temporales y se pierden al reiniciar.
- La API responde con JSON y usa códigos HTTP coherentes.
- El título no puede quedar vacío. Es una regla de práctica propuesta, no un requisito de cliente confirmado.

## Casos de uso, entradas y salidas

| Caso | Entrada | Proceso y salida | Errores |
|---|---|---|---|
| Listar | Ninguna | Lista JSON; vacía si no hay tareas | Ninguno esperado |
| Crear | `{"title":"Estudiar HTTP"}` | Crea y devuelve la tarea, normalmente `201 Created` | `400` si faltan datos válidos |
| Obtener | ID en ruta | Tarea JSON, `200 OK` | `404 Not Found` si no existe |
| Actualizar | ID y título | Tarea actualizada, `200 OK` | `400` o `404` |
| Eliminar | ID en ruta | `204 No Content` | `404` |

## Endpoints sugeridos

| Método y ruta | Ejemplo de respuesta |
|---|---|
| `GET /api/tasks` | `200` — `[{"id":1,"title":"Estudiar HTTP"}]` |
| `GET /api/tasks/1` | `200` — `{"id":1,"title":"Estudiar HTTP"}` |
| `POST /api/tasks` | Cuerpo `{"title":"Estudiar HTTP"}`; `201` con tarea creada |
| `PUT /api/tasks/1` | Cuerpo `{"title":"Practicar REST"}`; `200` con tarea actualizada |
| `DELETE /api/tasks/1` | `204`, sin cuerpo |

## Modelo y arquitectura

Modelo mínimo `Task(id, title)`. Usa un controlador para HTTP y un componente de almacenamiento en memoria pequeño. Mantén las responsabilidades separadas, pero no crees interfaz, capa de dominio ni repositorio de Spring Data: todavía no hay una necesidad que los justifique.

```mermaid
flowchart LR
  Client[Cliente HTTP] --> Controller[TaskController]
  Controller --> Store[Almacenamiento en memoria]
```

### Estructura propuesta

| Archivo o componente | Responsabilidad | Cuándo crearlo | Necesidad |
|---|---|---|---|
| `TaskApplication` | Arranque de Spring Boot | Al generar el proyecto | Obligatorio |
| `Task` | Representar la tarea | Al definir el primer dato del API | Obligatorio |
| `TaskController` | Rutas y HTTP | Al exponer el primer endpoint | Obligatorio |
| `TaskStore` | Guardar/buscar tareas en memoria | Al necesitar estado entre solicitudes | Obligatorio; puede ser una clase sencilla |
| `TaskService` | Coordinar reglas si el controlador crece | Cuando aparezcan operaciones o reglas que no pertenecen a HTTP | Posterior |
| Interfaz de repositorio | Abstraer más de un almacenamiento | Solo si hay una segunda implementación o límite útil de pruebas | No necesaria al inicio |

Paquetes sugeridos: `task`, `api` y `application` solo si la separación aclara el código; no crees paquetes vacíos por anticipado.

## Pasos y pistas

1. Dibuja las cinco rutas y decide qué respuesta HTTP corresponde a cada una.
2. Implementa el listado antes de crear, editar y borrar.
3. Prueba ID existente, ID inexistente y lista vacía.
4. **Pista 1:** ¿qué diferencia hay entre ruta, método HTTP y cuerpo?
5. **Pista 2:** conserva una colección en un componente administrado por Spring, no en una variable local al endpoint.
6. **Pista 3:** el controlador traduce HTTP; la búsqueda por ID debe permitir distinguir “encontrado” de “no encontrado”.

## Pruebas y solicitudes

Prueba crear → consultar → actualizar → consultar → borrar → consultar. Añade pruebas de la lista vacía, título vacío e ID inexistente. Puedes empezar con pruebas unitarias sencillas; una prueba HTTP completa puede esperar.

```powershell
curl.exe -i http://localhost:8080/api/tasks
curl.exe -i -X POST http://localhost:8080/api/tasks -H "Content-Type: application/json" -d "{\"title\":\"Estudiar HTTP\"}"
curl.exe -i http://localhost:8080/api/tasks/1
```

## Aceptación, errores y extensiones

- La aplicación arranca con Java 17 y Maven.
- Las cinco rutas cumplen sus respuestas acordadas y no pierden datos entre solicitudes del mismo proceso.
- Los errores de ID inexistente no se disfrazan como éxito.
- **Errores comunes:** devolver `200` para todo; crear almacenamiento dentro del método; asumir que los datos sobreviven al reinicio.
- **Extensiones:** agregar estado `completed`, fecha de creación o persistencia en un ejercicio posterior.

## Checklist, reflexión y terminado

- [ ] Puedo explicar cada método HTTP y su código de respuesta.
- [ ] Puedo mostrar por qué los datos se pierden al reiniciar.
- [ ] Puedo añadir una ruta sin poner toda la lógica en el controlador.
- ¿Qué tendría que cambiar para usar una base de datos? ¿Qué capa depende de HTTP?

**Terminado cuando:** el código compila, los casos CRUD y de error están probados y esta documentación refleja el comportamiento final. No añadas capas solo para que la estructura parezca profesional.
