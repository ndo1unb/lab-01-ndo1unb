[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/xXmPua8N)
# Basic Monolithic Architecture Example
This repository contains starter code for a simple monolithic application. It serves as a foundation for understanding the basics of a monolithic architectural style in software development.

## Overview
The monolithic application in this repository is a straightforward arithmetic calculator that performs basic operations such as addition, subtraction, multiplication, and division. The entire application, including the user interface, business logic, and data handling, is bundled into a single codebase and executable unit.

## Prerequisites
Before you start, make sure you have the following installed:

- JDK 1.8 or later
- An IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code
## Getting Started
1. Clone the Repository:
   - Use **`git clone [repository-url]`** to clone this repository to your local machine.
2. Open and Run the Project:
   - Open the project in your preferred IDE.
   - Locate the main class **`CalculatorApp.java`**.
   - Run the main class to start the application.

## Structure
- **`src`**: Contains the source code of the application.
   - **`main`**: Contains the main application and business logic.
   - **`test`**: Contains the unit tests for the application.

    >  *Note: no tests created for this starter code. Unit testing is challenging with the current structure because the `performOperation` method is private and the arithmetic operations are intertwined with user input and output handling, direct unit testing is challengig. To create a unit test for the ClassDemo class, we shoudl refactor the code to separate the arithmetic operations from the imput/output handling.*

## Running the Application
- The application is a command-line interface (CLI) program.
- Upon running, it will prompt you to enter numbers and select an operation.
- The result of the operation will be displayed in the console.

## Contributing
- Feel free to fork this repository and experiment with changes.
- If you have suggestions or improvements, please open a pull request.

## Next Steps
- Explore the code to understand how the monolithic architecture is structured.
- Try adding new features or modifying the existing code.
- Consider how this monolithic approach compares to other architectural styles.
