# React + Spring Boot Blog Platform

## Overview
A **full-stack blog platform** built using **React.js** (frontend), **Spring Boot** (backend), and **PostgreSQL** (database). This platform allows an **admin** to create, edit, and delete blog posts, while other users can only view published posts.

## Features
- **Authentication & Authorization**: Role-based access using **Spring Security & JWT**.
- **Post Management**: Admin can create, edit, delete, and manage posts.
- **Rich Text Editing**: Supports formatting and content styling.
- **Categorization & Tagging**: Organize posts with categories and multiple tags.
- **RESTful API**: Backend exposes structured endpoints with **Spring Boot & JPA**.
- **Secure Sessions**: JWT-based authentication with access and refresh tokens.
- **Database Management**: PostgreSQL with **ACID-compliant** transactions.
- **Containerized Deployment**: **Docker** support for easy environment setup.
- **Frontend Optimizations**: **React Hooks, Context API, and React Router DOM** for efficient state management and routing.

## Tech Stack
### **Frontend:**
- **React.js** (UI development)
- **Axios** (API requests)
- **React Router DOM** (Navigation)
- **Context API** (State management)

### **Backend:**
- **Spring Boot** (REST API)
- **Spring Security + JWT** (Authentication & authorization)
- **Spring Data JPA** (Database handling)
- **PostgreSQL** (Relational database)

### **Deployment & DevOps:**
- **Docker** (Containerization)
- **GitHub Actions** (CI/CD)
- **Render/Netlify** (Hosting)


## API Endpoints
### **Authentication**
- `POST /api/v1/auth/login` → Logs in user & returns JWT.

### **Posts**
- `GET /api/v1/posts` → Fetch all published posts.
- `POST /api/v1/posts` → Create a new post (Admin only).
- `PUT /api/v1/posts/{id}` → Update a post (Admin only).
- `DELETE /api/v1/posts/{id}` → Delete a post (Admin only).

## Contributing
Feel free to fork the repository, submit issues, or contribute improvements.

## License
This project is licensed under the **MIT License**.

