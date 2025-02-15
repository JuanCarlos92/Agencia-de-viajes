
# Agencia de Viajes - Microservicios con Spring Boot

Este proyecto consiste en una aplicación de agencia de viajes basada en microservicios utilizando **Spring Boot**. Los usuarios pueden realizar y gestionar reservas de vuelos y hoteles. La arquitectura se basa en varios microservicios que interactúan entre sí para proporcionar las funcionalidades necesarias.

## Microservicios

El sistema se compone de los siguientes microservicios:

- **Hoteles**: Devuelve la lista de hoteles disponibles.
- **Vuelos**: Devuelve la lista de vuelos disponibles y permite actualizar las plazas cuando se realiza una reserva.
- **Reservas**: Registra las reservas, asociando un vuelo y un hotel a un usuario.
- **Eureka Server**: Actúa como servidor de descubrimiento para los microservicios, permitiendo que se comuniquen entre sí sin necesidad de configuraciones estáticas.

## Características

- **Securización**: Implementación de Spring Security y Tokens JWT para asegurar los endpoints.
- **Persistencia de Datos**: Uso de MySQL como base de datos con JPA/Hibernate para la gestión de datos.
- **Comunicación entre Microservicios**: Los microservicios se comunican entre sí utilizando **RestTemplate** o **WebClient** para el intercambio de información.
- **Despliegue con Docker**: La aplicación está configurada para ser desplegada en producción utilizando **Docker**.

## Tecnologías Utilizadas

- **Spring Boot** para el desarrollo de los microservicios.
- **Spring Security** y **JWT** para la securización de los servicios.
- **MySQL** y **JPA/Hibernate** para la persistencia de datos.
- **Docker** para la contenedorización y despliegue.
- **Eureka Server** para el descubrimiento de servicios.
- **RestTemplate/WebClient** para la comunicación entre microservicios.

## Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes requisitos:

- **Java 11 o superior**.
- **MySQL** para la base de datos.
- **Docker** para el despliegue en contenedores.

## Instalación

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/JuanCarlos92/Agencia-de-viajes.git
   cd agencia-de-viajes
   ```

2. **Configura la base de datos MySQL**:
   
   Crea una base de datos en MySQL llamada agencia_viajes y configura las credenciales en el archivo `application.properties` de cada microservicio.

3. **Construye el proyecto**:
   
   ```bash
   ./mvnw clean install
   ```

4. **Despliega la aplicación con Docker**:

   Primero, construye las imágenes de Docker para cada microservicio.

   ```bash
   ./mvnw clean install
   ```

5. **Accede a los servicios**:
   
   - **Hoteles:** http://localhost:8081
   - **Vuelos:** http://localhost:8082
   - **Reservas:** http://localhost:8083
   - **Eureka Server:** http://localhost:8761
