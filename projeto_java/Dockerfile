# Estágio de construção
FROM gradle:7.3.3-jdk11 AS build
WORKDIR /home/gradle/src
COPY . .
RUN gradle build --no-daemon

# Estágio de execução
FROM openjdk:11-jre-slim
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/*.jar ./app.jar
CMD ["java", "-jar", "app.jar"]
