FROM maven:3.8.4-openjdk-17-slim AS maven-build

WORKDIR /build

COPY . .

RUN mvn clean package -DskipTests


FROM openjdk:17
WORKDIR /app
COPY --from=maven-build ./build/target/*.jar ./application.jar
EXPOSE 8080

ENTRYPOINT java -jar application.jar
