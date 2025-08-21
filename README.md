# 📘 Proyecto Udea 2025

Bienvenido al repositorio **Udea 2025**, un espacio académico diseñado para los estudiantes de **Ingeniería de Sistemas** de la Universidad de Antioquia.  
Aquí encontrarás ejemplos, guías y proyectos prácticos que apoyarán tu aprendizaje en **desarrollo de software, arquitectura empresarial, bases de datos y tecnologías web**.

---

## 🎯 Objetivos del proyecto

- Comprender y aplicar los principios fundamentales del desarrollo de software.
- Desarrollar aplicaciones **CRUD** con diferentes tecnologías.
- Usar herramientas modernas: **JavaEE, Spring Boot, React, PostgreSQL, Docker, GraphQL**.
- Practicar buenas prácticas de programación y trabajo colaborativo con **Git y GitHub**.
- Fortalecer las competencias de análisis, diseño y desarrollo de software en contextos reales.

---

## 🛠️ Tecnologías y herramientas

- **Lenguajes:** Java 11/17, JavaScript (React)
- **Frameworks Backend:** JavaEE (JSF, JPA), Spring Boot
- **Framework Frontend:** React JS
- **Base de datos:** PostgreSQL
- **Contenedores:** Docker
- **Gestor de dependencias:** Maven
- **Monitoreo:** Grafana, Prometheus, Spring Actuator
- **IDE recomendados:** IntelliJ IDEA, VS Code

---

## 📂 Contenido del repositorio

El repositorio está organizado en carpetas que corresponden a los diferentes temas y laboratorios del curso:

udea2025/
│── backend/ # Código backend (JavaEE y Spring Boot)
│── frontend/ # Aplicación en ReactJS
│── database/ # Scripts SQL de creación y carga de datos
│── labs/ # Guías de laboratorio paso a paso
│── docs/ # Documentación y material adicional
│── README.md # Este archivo


## ⚙️ Instalación y ejecución

### 1. Clonar el repositorio
```bash
git clone https://github.com/diegobotia/udea2025.git
cd udea2025

cd backend
mvn clean install
mvn spring-boot:run


Accede en: http://localhost:8080

### 2. Base de datos (MySQL)
CREATE DATABASE udea2025;

### 3. Frontend (React)
cd frontend
npm install
npm start


Accede en: http://localhost:3000

### 4. Con Docker (opcional)
docker-compose up --build

👩‍💻 Cómo contribuir

Haz un fork del repositorio.

Crea una rama con tu nombre o funcionalidad:

git checkout -b feature-mi-aporte


Realiza cambios y haz commit:

git commit -m "feat: agregado módulo X"


Haz push a tu rama:

git push origin feature-mi-aporte


Abre un Pull Request.

📚 Buenas prácticas para estudiantes

Usa mensajes de commit claros (feat:, fix:, docs:).

Documenta tu código con comentarios.

Verifica que el proyecto compile antes de subir cambios.

Respeta la estructura de carpetas.

Si te atascas, pregunta en clase o en el foro del curso.

🧑‍🏫 Créditos

Este repositorio hace parte del material académico de la
Universidad de Antioquia – Ingeniería de Sistemas
Fabrica Escuela de Software
Profesor: Diego Botía
Año: 2025
