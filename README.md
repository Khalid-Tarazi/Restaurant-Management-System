# 🍽️ Restaurant Management System (RMS)

## 📌 Overview 
My task is to design and develop a **Smart Restaurant Management System** that follows **SOLID principles**, applies **clean coding techniques**, and incorporates **design patterns**.  

The system efficiently manages:
- 🪑 Table assignments  
- 🧾 Order processing  
- 👤 Customer interactions  
- 🔄 Real-time updates  
- 🌐 Seamless integration with external systems  

---

## 🎯 Tasks Covered

### 📝 Task 1: Design Phase
#### 1.1 UML Diagram + SOLID Principles
- A **UML diagram** has been created to illustrate key components of the SRMS.  
- **SOLID principles** applied:
  - **S**ingle Responsibility → Each class (e.g., `OrderProcessor`) handles only one responsibility.  
  - **O**pen/Closed → System is extensible for adding new features like online delivery without modifying core classes.  
  - **L**iskov Substitution → Interfaces ensure derived classes can replace base classes without errors.  
  - **I**nterface Segregation → Smaller, role-specific interfaces for `ITableManager`, `IOrderService`, etc.  
  - **D**ependency Inversion → High-level modules depend on abstractions, not low-level implementations.  

#### 1.2 Design Patterns
Enhanced UML design includes:
- **Singleton Pattern** 
- **Observer Pattern**  

#### 1.3 Testing Strategy
- **Testing Objectives**: To ensure reliability, scalability, and responsiveness of SRMS.  
- **Testing Strategy**: Unit, Integration Testing.
- **Hardware & Environment**:  
  - Server: Windows 10, 8GB RAM, SQL DB  
  - Tools: JUnit

---

### 💻 Task 2: Build Phase
#### 2.1 Development
- The SRMS was built following the **UML design**.  
- Key modules include:
  - `TableManager` → Handles table reservations & assignments.  
  - `OrderProcessor` → Manages order creation, updates, and payments.  
  - `CustomerInteraction` → Interfaces for customer feedback and order tracking.  

Code is structured under `src/` with **clean coding** practices and unit tests in `tests/`.

---

## 📂 Repository Structure
- `docs/` → UML diagrams, design docs, and testing strategy  
- `src/` → Source code (SRMS implementation)  
- `tests/` → Unit and integration test scripts
- `diagrams/` → UML diagrams with design patterns  

---

## 🛠️ Tech Stack
- **Language**: Java
- **Design**: UML, SOLID principles 
- **Database**: SQL-based system 
- **Testing**: JUnit

