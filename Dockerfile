# Fase de construcción
FROM maven:3.9.6-eclipse-temurin-22-alpine AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src /app/src
RUN mvn package -DskipTests

# Fase de ejecución
FROM eclipse-temurin:22-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/SmartTolls-VehiclesService-*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]