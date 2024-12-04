# Gaming App - API Documentation

This repository contains the API documentation for the Gaming App, where you can perform actions like user registration, login, tournament creation, and team management.

## Prerequisites

Ensure you have the following installed:
- **Java 17 or higher**
- **Maven** for building the application
- **Postman** for testing APIs
- **MySQL** or a compatible database
- **IDE (e.g., IntelliJ IDEA, Eclipse)**

## Repository Setup

Clone this repository to your local machine:

```bash
git clone https://github.com/junaidghazi/gaming-app.git
```

## Application Setup

1. **Database Configuration:**
    - Set up MySQL (or your database of choice).
    - Execute: `CREATE DATABASE gaming_app_db;`

2. **Configure `application.properties`:**
    - Update database connection settings in `src/main/resources/application.properties`.

## Build and Run the Application

- **Build the Project:**
    - Navigate to the project root directory and run:
      ```bash
      mvn clean install
      ```

- **Run the Application:**
    - Use the command:
      ```bash
      mvn spring-boot:run
      ```

## Postman Collection

Import the provided Postman collection to gain access to all API endpoints:
1. Open Postman.
2. Click "Import".
3. Import the API collection.

## API Endpoints

Refer to the "api collection" folder for all endpoints and JSON data.

## Troubleshooting

Ensure:
- **Application is Running:** Check if the app is running on `localhost:8080`.
- **Database Configuration:** Verify the settings in `application.properties`.
- **Postman Requests:** Confirm correct URL, HTTP method, and request body configurations.

For additional support, contact: "juned.bin.idreesh@gmail.com".