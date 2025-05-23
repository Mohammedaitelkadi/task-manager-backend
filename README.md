# Task Manager Backend

A Spring Boot backend service for task management application.

## Features

- RESTful API endpoints for task management
- Task status and priority handling
- Data validation
- Error handling
- MySQL database integration
- Timestamp management

## Technologies

- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Hibernate Validator

## Getting Started

1. Clone the repository:
```bash
git clone https://github.com/YOUR_USERNAME/task-manager-backend.git
cd task-manager-backend
```

2. Configure MySQL:
   - Create a MySQL database
   - Update `application.properties` with your database configuration

3. Configure application.properties:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

4. Build the project:
```bash
mvn clean install
```

5. Run the application:
```bash
mvn spring-boot:run
```

The server will start on http://localhost:8080

## API Endpoints

### Tasks
- GET `/api/tasks` - Get all tasks
- POST `/api/tasks` - Create a new task
- GET `/api/tasks/{id}` - Get task by ID
- PUT `/api/tasks/{id}` - Update task
- DELETE `/api/tasks/{id}` - Delete task

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/siimoxs/taskManagerBackend/
│   │       ├── api/
│   │       │   ├── controller/
│   │       │   ├── model/
│   │       │   ├── repository/
│   │       │   └── service/
│   │       └── TaskManagerBackendApplication.java
│   └── resources/
│       └── application.properties
└── test/
```

## Database Schema

### Task Table
```sql
CREATE TABLE tasks (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(20) NOT NULL,
    priority VARCHAR(20) NOT NULL,
    due_date DATETIME,
    created_at DATETIME NOT NULL,
    updated_at DATETIME NOT NULL
);
```

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request 