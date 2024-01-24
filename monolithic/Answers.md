## Answer to Part 1 Q5 in Lab Manual
"Which of the following statements accurately reflect the pros and cons of monolithic architecture?"
A. Monolithic architecture simplifies the development and deployment process as the application is built and managed as a single unit.
C. In a monolithic application, a failure in one part of the system can potentially bring down the entire application, indicating a single point of failure.
E. Testing in monolithic architecture can be more straightforward, as the entire application is integrated and can be tested as a whole.
F. Updating or adding new features to a monolithic application can be risky and time-consuming, as changes affect the entire application.

# Monolithic Architecture Lab Questions

Please provide your answers to the following questions based on your experience and learning in the lab session.

## Understanding Monolithic Architecture

1. In your own words, explain the concept of a monolithic architecture.

An application has a monolithic architecture when everything is in one place. The application itself can have many different classes, modules, etc. that can potentially be separated, but as shown in the example program, they are all within one big codebase. This can potentially cause problems when, for example, just one feature of the application needs to be updated or refactored and it affects the entire application.

## Reflections on Monolithic Architecture
### Scalability and Maintainability:
1. Discuss the scalability and maintainability of the monolithic calculator application. How easy would it be to expand its functionality or maintain it over time?

While it might not be too much of a problem earlier on, maintenance and especially expanding functionality over time can definitely become an issue. This is because as more features get piled on our single codebase, it can become difficult to add new functionality without it affecting features that are already working. The same goes for maintenance: it is easy when your code has only a few functions and classes (like our calculator), but when our code is a program with thousands of lines, maintaining specific parts can become a headache.

### Suitability for Small Applications:
1. Do you think monolithic architecture is suitable for small-scale applications like the calculator? Why or why not?

I think for small-scale applications like our calculator, using monolithic architecture is suitable and not a problem. This is because small-scale applications often do not possess too many features, so when it comes to tasks such as refactoring and maintenance, we do not have to be as mindful about breaking other features on accident (we can just fix that as well or even rewrite the entire application if need be).

## Comparing Architectures
### Monolithic vs. Layered Approach:
1. How do you think your experience would differ if the same calculator application were structured using a layered architecture instead of a monolithic one?

For the end users who use the program, there should not be a noticeable difference. For those who write and maintain the application, using a layered architecture instead of a monolithic one adds a layer of abstraction that may seem to be unnecessary initially (with the program being so simple). However, as time goes on and more features get added, they would be glad they made the decision in the first place. The layers are separated by function so even developers who did not originally write the program are able to know the purpose of a feature/function/module in a layer.

### Potential for Refactoring:
1. If you were to refactor the monolithic calculator application into a different architectural style (e.g., microservices), what changes would you anticipate needing to make?

The first step for me is to try and break the monolithic codebase up into different parts (for example, by function, as we have seen in the layered example). By doing so, the codebase would no longer be a difficult-to-navigate monolith and would no longer suffer the weaknesses of a monolithic architecture.

## General Insights
### Key Takeaways:
1. What are your key takeaways about monolithic architecture from this exercise?

- Everything in one big codebase
- Refactoring and maintenance can be problematic
- Fine for small-scale applications like the calculator, but not so good if the application grows to be larger and more complex

2. How would you apply these learnings to future software development projects?
Before working on a future project, I would attempt to select a suitable software architecture, depending on things like the project's complexity, end goal, and if additional requirements tend to come up as the project is developed.