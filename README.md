# ⚽ FIFA Player Comparison System

A full-stack web application to compare football players using **real FIFA World Cup statistics** stored in a MySQL database.  
This project was developed as part of an **internship assignment** and demonstrates real-world backend–frontend integration.

---

## 📌 Project Overview

The application allows users to:
- Select two football players
- Compare their performance statistics side by side
- View real data fetched from a MySQL database

The backend is built using **Spring Boot**, while the frontend is built using **React (Vite)** with **Tailwind CSS and ShadCN UI**.

---

## 🚀 Features

- Compare two players
- Statistics compared:
  - Games played
  - Minutes played
  - Goals
  - Assists
  - Goals per 90
  - Assists per 90
  - Yellow cards
  - Red cards
  - Advanced metrics (xG, xG per 90, npxG, xG Assist)
- Uses **real FIFA data** (no dummy data)
- Clean and modern UI
- RESTful APIs
- Clear backend–frontend separation

---

## 🛠 Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL 8
- Maven

### Frontend
- React (Vite)
- Tailwind CSS
- ShadCN UI
- JavaScript (ES6)

---

## 📁 Project Structure

iqnext_assignment_2026/
│
├── backend/
│ ├── src/main/java/com/iqnext/backend
│ │ ├── controller
│ │ ├── model
│ │ ├── repository
│ │ └── service
│ ├── src/main/resources
│ └── pom.xml
│
├── frontend/
│ ├── src/
│ ├── index.html
│ └── package.json
│
└── README.md

---

# 🗄 DATABASE SETUP (MySQL)

## Step 1: Install MySQL
Ensure **MySQL 8+** is installed and running on your system.

---

## Step 2: Create Database

Open MySQL Workbench and run:

```sql
CREATE DATABASE fifa;
```

## Step 3: Import Database Schema & Data

Open MySQL Workbench

Connect to your local MySQL server

Go to Server → Data Import

Select Import from Self-Contained File

Choose the provided FIFA.sql file

Select target schema: fifa

Click Start Import

This will create the following tables:

player_stats

player_playing_time

player_defence

## ⚙️ BACKEND SETUP (Spring Boot)
## Step 4: Navigate to Backend Directory
cd backend

## Step 5: Configure Database Credentials

Edit the file:

backend/src/main/resources/application.properties


Example configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/fifa?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

server.port=8080

## Step 6: Run Backend Server
mvn spring-boot:run


Backend will start at:

http://localhost:8080

## Step 7: Test Backend API (Optional)

Open browser:

http://localhost:8080/api/statistics/players


You should see JSON data containing player details.

## 🎨 FRONTEND SETUP (React)
Step 8: Navigate to Frontend Directory
cd frontend

## Step 9: Install Dependencies
npm install

## Step 10: Start Frontend Server
npm run dev


Frontend will start at:

http://localhost:5173

## 🧪 HOW TO USE THE APPLICATION

Ensure MySQL is running

Start the backend server

Start the frontend server

Open the frontend URL in browser

Select Player 1

Select Player 2

Click Compare

View side-by-side comparison of real FIFA statistics

## 🧠 Key Implementation Highlights

Real company-provided database schema

No mock or dummy data

JPA entity mapping for multiple tables

REST APIs built using Spring Boot

Frontend dynamically fetches data from backend

Clean UI using Tailwind and ShadCN

## 📌 Future Enhancements

Defence statistics comparison

Playing-time analytics

Charts and visual comparisons

Player filtering by team or position

## 👨‍💻 Author

Adoksh M Bharadwaj
B.Tech Computer Science
Internship Assignment Project

## ✅ Notes

Backend must be started before frontend

MySQL must be running before backend

All data shown is real FIFA World Cup data


