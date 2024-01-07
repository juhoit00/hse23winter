# My Awesome To-Do List Application

Welcome to My Awesome To-Do List Application! This application helps you manage your tasks efficiently with a simple and intuitive to-do list.

## Technologies Used

- **Backend:**
  - Spring Boot (Java)
  - MongoDB

- **Frontend:**
  - React

- **Observability:**
  - OpenTelemetry
  - Jaeger

## How to Run

1. Clone the repository:

   git clone https://github.com/juhoit00/hse23winter.git

2. Navigate to the backend directory and run it:

   ./gradlew bootRun

   The backend will be available at http://localhost:8080

4. Navigate to the frontend directory and run it:

   npm install    # to install necessary dependencies
   npm start

   The frontend will be available at http://localhost:3000

5. Observability (Optional)

   Ensure Jaeger is running locally.
   Access the Jaeger UI at http://localhost:16686 to view traces

## Contributing

Feel free to contribute to enhance the features or fix any issues. Follow these steps:

Fork the repository.
Create a new branch for your feature or bug fix: git checkout -b feature-name.
Commit your changes: git commit -m 'Add new feature'.
Push to the branch: git push origin feature-name.
Submit a pull request.
Happy coding!
