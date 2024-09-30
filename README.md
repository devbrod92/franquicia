 # Franchise Management API

Este proyecto es una API construida con Spring Boot para manejar una lista de franquicias, sucursales y productos. Permite agregar franquicias, sucursales, productos, modificar el stock, y ver qué producto tiene más stock por sucursal para una franquicia específica. Los datos se almacenan en una base de datos MySQL.

## Requisitos

Para ejecutar este proyecto, necesitarás:

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [MySQL](https://dev.mysql.com/downloads/mysql/)
- [Git](https://git-scm.com/)

## Instrucciones de instalación

### 1. Crear base de datos con MySQL

CREATE DATABASE franchise_db;

### 2. Clonar el repositorio

```bash
git clone https://github.com/tu-usuario/franchise-api.git
cd franchise-api
```

### 3. Cambiar propiedades del proyecto

spring.datasource.url=jdbc:mysql://localhost:3306/franchise_db
spring.datasource.username=tu_usuario_mysql
spring.datasource.password=tu_contraseña_mysql

### 4. Compilar proyecto luego de los cambios

```bash
mvn clean install
mvn spring-boot:run
```

### 5. Consumo de los endpoints

POST /api/franchises

```json
{
  "name": "Franquicia 1"
}
```

POST /api/franchises/{franchiseId}/branches
```json
{
  "name": "Sucursal 1"
}
```



