# Invoice Processing System Backend

## Overview  
The **Invoice Processing System Backend** is built using **Spring Boot**, providing RESTful APIs for managing invoices efficiently. It supports basic **CRUD operations** for invoice management and ensures seamless database interaction.

## Features  
- Create, Read, Update, and Delete (CRUD) invoices  
- RESTful API endpoints for seamless integration  
- Database management with efficient query handling  
- Scalable and maintainable backend architecture  

## Installation  

### **Prerequisites**  
- Java 17+  
- Spring Boot  
- Maven  
- MySQL/PostgreSQL  

### **Steps to Run the Project**  
1. Clone the repository:  
   ```sh
   git clone https://github.com/kush-prog/Invoice-Processing-System-Backend.git

```md

### Navigate to the project directory:
```sh
cd Invoice-Processing-System-Backend
```

### Build the project using Maven:
```sh
mvn clean install
```

### Run the application:
```sh
mvn spring-boot:run
```

### Access the API:
```
http://localhost:8080/api/invoices
```

---

## API Endpoints

### Invoice CRUD Operations

| Method  | Endpoint             | Description               |
|---------|----------------------|---------------------------|
| **POST**   | `/api/invoices`      | Create a new invoice      |
| **GET**    | `/api/invoices`      | Retrieve all invoices     |
| **GET**    | `/api/invoices/{id}` | Retrieve invoice by ID    |
| **PUT**    | `/api/invoices/{id}` | Update an existing invoice |
| **DELETE** | `/api/invoices/{id}` | Delete an invoice by ID   |

---

## Technologies Used

- **Java**
- **Spring Boot**
- **Hibernate**
- **REST APIs**
- **MySQL/PostgreSQL**
```

This is the clean and structured **README.md** file with all the required details. 🚀 Let me know if you need any modifications!
