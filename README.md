# Task Manager Backend

## Overview

Task Manager Backend is a Spring Boot REST API application that provides user authentication, role-based authorization, and task management functionalities.

The application uses JWT authentication, Spring Security, MySQL, and JPA/Hibernate to build a secure and scalable backend system.

---

## Features

### Authentication & Authorization

* User Registration
* User Login
* BCrypt Password Hashing
* JWT Authentication
* Role-Based Access Control (ROLE_USER, ROLE_ADMIN)

### Task Management

* Create Task
* Get All Tasks
* Get Task By ID
* Update Task
* Delete Task

### Additional Features

* Input Validation
* Global Exception Handling
* Swagger API Documentation
* MySQL Database Integration

---

## Tech Stack

* Java 25
* Spring Boot
* Spring Security
* JWT (JSON Web Token)
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Swagger OpenAPI

---

## Project Structure

src/main/java/com/aditya/taskmanager

* controller
* service
* repository
* entity
* dto
* security
* config
* exception

---

## API Endpoints

### Authentication

POST /api/v1/auth/register

POST /api/v1/auth/login

### Tasks

GET /api/v1/tasks

GET /api/v1/tasks/{id}

POST /api/v1/tasks

PUT /api/v1/tasks/{id}

DELETE /api/v1/tasks/{id}

### Protected Test APIs

GET /api/v1/test

GET /api/v1/admin

---

## Swagger Documentation

After starting the application:

http://localhost:8080/swagger-ui/index.html

---

## Database

Database: MySQL

Update your database credentials in:

src/main/resources/application.properties

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager

spring.datasource.username=root

spring.datasource.password=your_password

---

## Running the Application

### Clone Repository

git clone https://github.com/adityapannu669-collab/taskmanager-backend.git

### Navigate to Project

cd taskmanager-backend

### Run Application

mvn spring-boot:run

Application will start on:

http://localhost:8080

---

## Security

* JWT-based Authentication
* BCrypt Password Encryption
* Protected REST Endpoints
* Role-Based Authorization

---

## Author

Aditya Pannu

B.Tech CSE Student
