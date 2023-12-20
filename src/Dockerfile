# Use an official OpenJDK runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY . . 

# Expose the port on which the Spring Boot app will run
EXPOSE 8080

# Start the Spring Boot application
CMD ["java", "-jar", "build\libs\Lab-0.0.1-SNAPSHOT.jar"]
