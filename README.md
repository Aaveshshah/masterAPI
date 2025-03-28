# Masters List API

## Overview
The **Masters List API** is a RESTful service built using **Spring Boot** and **PostgreSQL** to manage and retrieve master data efficiently. The API provides structured endpoints for fetching predefined data sets stored in a relational database.

## Features
- CRUD operations for master data.
- RESTful API endpoints returning JSON responses.
- PostgreSQL database integration.
- Error handling and validation.
- Scalable and maintainable architecture.

## Tech Stack
- **Backend**: Java, Spring Boot (Spring MVC, Spring Data JPA)
- **Database**: PostgreSQL
- **Tools**: Eclipse, Postman, GitHub
- **Dependencies**: Spring Boot Starter Web, Spring Boot Starter Data JPA, PostgreSQL Driver

## API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| GET | `/api/masters` | Retrieve all master data records |
| GET | `/api/masters/{id}` | Fetch a specific master record by ID |
| POST | `/api/masters` | Add new master data |
| PUT | `/api/masters/{id}` | Update an existing master data record |
| DELETE | `/api/masters/{id}` | Remove a master data entry |

## Database Schema
The PostgreSQL database consists of the following table:

```sql
CREATE TABLE masters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) UNIQUE NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

## Setup Instructions
### Prerequisites
- Java 17 or later
- PostgreSQL installed and running
- Eclipse or any preferred IDE

### Steps to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/masters-list-api.git
   cd masters-list-api
   ```
2. Configure the `application.properties` file:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
4. Test API endpoints using Postman or curl.

## Future Enhancements
- Implement authentication and role-based access control.
- Add pagination and filtering options.
- Integrate Swagger for API documentation.

## License
This project is licensed under the MIT License.

---
Made with ❤️ by Aavesh Shah 🚀
