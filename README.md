# Employee Management System

👨‍💼📊 This is a Java project that demonstrates the use of inheritance and polymorphism to manage employees and outsourced employees.

## Features

🛠️ Implementation of the `Employee` and `OutsourcedEmployee` entities.
  
🔗 Utilization of inheritance, with `OutsourcedEmployee` inheriting from `Employee`.
  
🌟 Showcase of polymorphism by overriding the payment method in the `OutsourcedEmployee` class.

## Entities

### Employee
- Represents a standard employee.
- Contains attributes such as name, hours worked, and hourly rate.
- Features a `calculatePayment()` method to compute payment based on hours worked and hourly rate.

### OutsourcedEmployee
- Inherits from `Employee`.
- Represents an outsourced employee.
- Includes an additional attribute for extra charges.
- Overrides the `calculatePayment()` method to factor in the additional charges during payment calculation.
