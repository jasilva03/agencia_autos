# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Run the application (http://localhost:8086)
mvnw.cmd spring-boot:run

# Build (produces JAR in target/)
mvnw.cmd clean package

# Run all tests
mvnw.cmd test

# Run a single test class
mvnw.cmd test -Dtest=AgenciaAutosApplicationTests
```

## Architecture

Spring Boot 3.5.14 REST API (Java 17) for a car dealership management system. Uses H2 in-memory database via Spring Data JPA.

**Base package:** `com.example.agencia_autos`

**Layered structure (partially implemented):**

```
controller/   → REST endpoints (CarController: GET api/v1/cars — missing @GetMapping, returns stub)
model/
  response/   → Java records for responses (CarModelResponse: id, manufacturer, model, year)
  request/    → Request DTOs (not yet created)
service/      → Business logic (not yet implemented)
repository/   → JPA repositories (not yet implemented)
entity/       → JPA entities (not yet implemented)
```

**Key details:**
- Server runs on port **8087** (`server.port` in `application.properties`).
- H2 console enabled at `http://localhost:8087/h2-console` — JDBC URL `jdbc:h2:mem:testdb`, user `test`, password `test`.
- Use Java **records** for response DTOs (see `CarModelResponse`). Use Lombok (`@Data`, `@Builder`, `@NoArgsConstructor`) for entities and request DTOs.
- `CarController.getAllCars()` is missing a `@GetMapping` annotation — the endpoint is not yet reachable.
- Validation (`@Valid`, `@NotNull`, etc.) is available via `spring-boot-starter-validation`.

## Custom slash commands

- `/update-server-port` — sets `server.port` to 8087 in `application.properties`.
