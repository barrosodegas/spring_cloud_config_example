# Server and Client Spring Cloud Configuration example
- Example of how to consume versioned properties in a Git repository and keep this data up to date in the client APIs without having to restart the services

## About
- This project aims to demonstrate how to create a server of properties written in ".properties" or ".yml" files and a client API that consumes this data without having to restart client applications.

## Environment
- Have Java 8 installed and setup as your default JVM
- Cloud Config Server port: 8888 and API Client Port: 8002

## Running the example
- Compile: Directory: spring_cloud_config_example/cloud_config_server/ --> Comand: mvn clean package -U -T 2 and Directory: spring_cloud_config_example/cloud_config_client/ --> Comand: mvn clean package -U -T 2
- Run: java -jar spring_cloud_config_example/cloud_config_client/target/cloud-config-client-0.0.1-SNAPSHOT.jar and java -jar spring_cloud_config_example/cloud_config_server/target/cloud-config-server-0.0.1-SNAPSHOT.jar
- Access port to the endpoint that get message: 8002
- To find message: GET --> http://localhost:8002/message
- To refresh message value after update property file on Git repository: curl --location --request POST 'http://localhost:8002/actuator/refresh'

