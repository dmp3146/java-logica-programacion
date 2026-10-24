# Ejercicio 003 — Gestor de gastos personales

**Nivel:** Intermedio inicial · **Tiempo estimado:** 10–14 horas

## Contexto y enunciado

Una persona quiere registrar ingresos y gastos por categoría, consultar movimientos y conocer el balance de un periodo. A diferencia de los primeros ejercicios, la información debe seguir disponible después de reiniciar la aplicación.

## Objetivos y conocimientos previos

Introducir Spring Data JPA, entidades, repositorios, relaciones, consultas y configuración por ambiente. Requiere clases, colecciones, excepciones, SQL básico y los ejercicios de API anteriores.

## Requisitos

### Funcionales

1. Crear categorías y movimientos de ingreso o gasto.
2. Consultar, editar y borrar movimientos.
3. Filtrar movimientos por rango de fecha y categoría.
4. Calcular balance de un rango como ingresos menos gastos.
5. Guardar los datos en una base relacional.

### No funcionales y reglas propuestas

- Valores monetarios positivos, almacenados como decimal exacto.
- Un movimiento tiene exactamente un tipo (ingreso o gasto), fecha, importe y categoría.
- Decidir explícitamente qué ocurre al borrar una categoría con movimientos; no dejar la decisión implícita.
- Usar H2 para desarrollo local sencillo; no introducir PostgreSQL hasta que el aprendizaje de despliegue o concurrencia lo justifique.

## Casos de uso, entradas y salidas

Ejemplo de movimiento: `{"type":"EXPENSE","amount":18.75,"date":"2026-10-20","description":"Almuerzo","categoryId":2}`. Respuesta propuesta: `201` y movimiento con ID. El balance debe indicar ingresos, gastos y neto para el intervalo consultado.

| Método y ruta | Uso | Errores |
|---|---|---|
| `POST /api/categories` | Crear categoría | `400` inválido |
| `POST /api/transactions` | Registrar movimiento | `400` inválido, `404` categoría |
| `GET /api/transactions?from=...&to=...` | Consultar periodo | `400` intervalo inválido |
| `GET /api/reports/balance?from=...&to=...` | Obtener balance | `400` fechas inválidas |
| `DELETE /api/transactions/{id}` | Borrar movimiento | `404` |

## Modelo y arquitectura

Modelo propuesto `Category` 1:N `Transaction`. Usa `BigDecimal`, fechas sin hora si el caso solo requiere día y enum para tipo. Distingue entidad JPA de DTO público. La capa de aplicación coordina consultas y cálculo; el repositorio se ocupa del acceso a datos.

```mermaid
erDiagram
  CATEGORY ||--o{ TRANSACTION : categorizes
  CATEGORY { long id string name }
  TRANSACTION { long id decimal amount date date type string description }
```

| Archivo/componente | Responsabilidad | Cuándo crearlo | Necesidad |
|---|---|---|---|
| `Category`, `Transaction` | Entidades persistentes y relación | Al definir esquema | Obligatorio |
| `CategoryRepository`, `TransactionRepository` | Operaciones JPA | Al persistir | Obligatorio |
| `TransactionRequest/Response` | Contrato de API | Antes de exponer la entidad | Recomendado |
| `TransactionService` | Validar reglas, coordinar repositorios y balance | Al introducir casos de uso | Obligatorio |
| `TransactionController` | Endpoints HTTP | Al exponer operaciones | Obligatorio |
| `application.yml` | Configuración común y perfil local | Al configurar datasource | Obligatorio |
| Perfil de producción | Parámetros externos, sin credenciales en Git | Al preparar despliegue | Posterior |

Paquetes sugeridos: `transaction`, `category`, `report` bajo `api`, `application`, `persistence` si esto mejora la navegación; mantén el alcance pequeño.

## Pasos y pistas

1. Define la regla del balance y la relación categoría-movimiento en palabras.
2. Crea persistencia de categorías y movimientos antes del reporte.
3. Prueba el reinicio y verifica que los datos siguen guardados.
4. **Pregunta:** ¿el total debe sumar ingresos y gastos con el mismo signo?
5. **Orientación:** separa fecha de inicio y fin, y valida que el intervalo sea posible.
6. **Pista concreta:** agrega ingresos y resta gastos; prueba un intervalo sin movimientos y un día de límite.

## Pruebas y solicitudes

Probar categoría inexistente, importe cero/negativo, fecha de inicio posterior al fin, límites exactos del rango, balance sin datos y persistencia tras reinicio. Usa perfil H2 local y no confirmes la base generada al control de versiones.

```powershell
curl.exe -i -X POST http://localhost:8080/api/categories -H "Content-Type: application/json" -d "{\"name\":\"Alimentación\"}"
curl.exe -i -X POST http://localhost:8080/api/transactions -H "Content-Type: application/json" -d "{\"type\":\"EXPENSE\",\"amount\":18.75,\"date\":\"2026-10-20\",\"description\":\"Almuerzo\",\"categoryId\":1}"
curl.exe -i "http://localhost:8080/api/reports/balance?from=2026-10-01&to=2026-10-31"
```

## Aceptación y terminado

- Las entidades se guardan y recuperan correctamente.
- El balance para un conjunto conocido de movimientos coincide con el cálculo esperado.
- Las consultas cubren el rango de fechas documentado.
- **Errores comunes:** usar `double` para dinero; acoplar controlador directamente a JPA; borrar en cascada sin decidirlo.
- **Extensiones:** reportes mensuales, paginación o migraciones de esquema cuando exista motivo.
- [ ] Puedo explicar entidad frente a DTO. [ ] Puedo explicar la relación JPA. [ ] Sé cómo cambiar la base por perfil.
- ¿Qué problema resuelve el repositorio? ¿Qué se debería probar con la base real y qué puede probarse sin ella?

**Terminado cuando:** compila, pruebas de reglas y persistencia pasan y README refleja el modelo realmente creado.
