# Basic Monolithic Architecture Example
This repository contains a refactored code for a simple monolithic application. It serves as a foundation for understanding the basics of a monolithic architectural style in software development.

## Overview
The refactored solution with *`ArithmeticService`* and *`CalculatorAppM`* remains a monolithic architecture. In a monolithic architecture, even though you can have different classes and modules, all components of the application are packaged together and deployed as a single unit. This characteristic is still true in the refactored solution.

### Characteristics of the Refactored Monolithic Architecture:

1. **Single Deployable Unit**: Both `ArithmeticService` and `CalculatorAppM` are part of the same application and are deployed together. 
2. **Unified Codebase**: All functionalities, including the arithmetic operations and the user interface (command-line interaction), are within the same codebase, even though they are in separate classes. 
3. **Shared Resources**: The application shares resources such as memory space and data. If it were to connect to a database or other external resources, all components would use the same connections. 
4. **Centralized Management**: The application is built, tested, and deployed as a single entity. All changes, regardless of whether they affect the `ArithmeticService` or the `CalculatorAppM`, are part of the same development, build, and deployment processes.

### Why It's Still Monolithic:
The refactoring into different classes does not change the architectural style; it merely organizes the code better within the monolithic architecture.

A true move away from monolithic architecture would involve splitting the application into separate services, typically running independently and communicating over a network (as seen in microservices architecture).

### Benefits of the Refactoring within the Monolithic Architecture:
- **Improved Maintainability**: Separating concerns (like arithmetic operations from user input handling) makes the code easier to understand and maintain. 
- **Enhanced Testability**: Isolating functionalities into different classes allows for more straightforward and effective unit testing. 
- **Potential for Future Extensions**: While still monolithic, this modular approach lays the groundwork for potentially breaking the application into microservices or other architectures in the future, should the need arise.

In summary, the refactored application continues to be a monolithic architecture but with improved internal structure, showcasing how even monolithic applications can and should be well-organized and modularized.

## Lab Prerequisites
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

    >  *Note: Unit testing has been added.*

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
