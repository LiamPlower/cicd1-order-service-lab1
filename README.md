# CICD-1 Lab 1

## Order Service

Browser / Swagger
      |
      +--> Catalog Service :8081 --> temporary Product List
      |
      +--> Order Service   :8082 --> temporary Order List

## Order Service API

GET  /orders
      --> Returns all purchase orders

POST /orders
      --> Creates a new purchase order
      --> Automatically assigns an order ID

## Purchase Order

Each purchase order contains:

- id
- productId
- quantity

Example:

{
  "id": 1,
  "productId": 1001,
  "quantity": 2
}

## Storage

Orders are currently stored in a temporary in-memory ArrayList.

No database is used.

Orders are lost when the Order Service is restarted.

## Configuration

Application name: OrderService
Port: 8082

## Project Structure

src/main/java/com/example/orderservice/

+-- controller/
|   +-- PurchaseOrderController.java
|
+-- model/
|   +-- PurchaseOrder.java
|
+-- service/
    +-- PurchaseOrderService.java

src/main/resources/
+-- application.properties

## GitHub

Separate GitHub repository for the Order Service.

Changes are submitted using separate pull requests.
