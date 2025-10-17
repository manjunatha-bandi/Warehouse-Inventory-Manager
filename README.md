# Warehouse-Inventory-Manager
Spring Boot backend with MySQL database powering a warehouse inventory system. Frontend via Postman for API testing—supports CRUD operations, stock alerts, category filters, and secure admin login. Modular, recruiter-ready, and deployment-friendly.
# Warehouse Inventory Manager

A Spring Boot-powered backend system for managing warehouse inventory with MySQL database integration and Postman-based API testing. Built for clarity, modularity, and recruiter-grade polish.

## Features
- **Inventory CRUD**: Add, update, delete, and fetch items
- **Category Filters**: Organize and query by category
- **Search & Alerts**: Find items by ID/name and flag low stock
- **Admin Authentication**: Secure access to inventory endpoints
- **Transaction Logging**: Track inbound/outbound movements

## API Endpoints
| Method | Endpoint           | Description           |
|--------|--------------------|-----------------------|
| GET    | `/items`           | Fetch all inventory   |
| POST   | `/items`           | Add new item          |
| PUT    | `/items/{id}`      | Update item by ID     |
| DELETE | `/items/{id}`      | Delete item by ID     |

## Tech Stack
- **Java + Spring Boot**
- **MySQL**
- **Postman (API Testing)**
- **Maven**


