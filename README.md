# Securities Reference Data 

A Spring Boot microservice for managing and serving financial reference data for securities, with live market quotes from Finnhub.

## Tech Stack
- **Java 17** / **Spring Boot 3**
- **Spring Data JPA** + H2
- **Spring Cache** + **Actuator** + **Prometheus** + **Grafana**
- **Docker** + **Docker Compose**
- **OpenShift / Kubernetes** (manifests in `/k8s`)
- **GitHub Actions** CI

## Running locally
```bash
docker-compose up --build
```

| Service | URL |
|---------|-----|
| Swagger UI | http://localhost:8080/swagger-ui/index.html |
| Prometheus | http://localhost:9090 |
| Grafana | http://localhost:3000 |

## TODO
- Push Docker image to registry and deploy to OpenShift via GitHub Actions
- Swap H2 for production database (PostgreSQL/Oracle)
- Expand test coverage