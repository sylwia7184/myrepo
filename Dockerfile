FROM maven:3.8.8-eclipse-temurin-21-alpine as build
WORKDIR /build
# copy source files and compile them (.dockerignore should handle what to copy)
COPY . .
RUN mvn package

FROM openjdk:21 AS final-stage  
#  Copy application artifacts from the build stage (e.g., JAR file)
COPY --from=build /build/target/database-display-1.0-SNAPSHOT.jar /usr/src/myapp/database-display-1.0-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/src/myapp/database-display-1.0-SNAPSHOT.jar"]