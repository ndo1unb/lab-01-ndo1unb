# Microservices Lab Questions

Please provide your answers to the following questions based on your experience and learning in the lab session.

## Understanding Microservices

1. What are the key differences between monolithic and microservices architectures? How do these differences impact application development and management? 

Monolithic architecture has all functionality in one big codebase, so problems with just one feature can potentially bring the entire application down. A microservices architecture uses a separately-run service for each feature the application has to satisfy, so a problem with one feature is contained within its service and will not affect the entire application.

2. In your own words, explain the concept of a microservice and how it communicates within a microservices architecture.

As seen from the calculator example, a microservice is meant to fulfill one feature of the application. Within a microservices architecture, microservices communicate through a network.

## Spring Boot Implementation

1. Describe the steps you took to set up and run the *`AddService`* and *`SubtractService`* using Spring Boot. Were there any challenges you faced? 

(I could not get my code to compile and run. I am answering this based on what I have seen from my peers in the lab)

Step 1: Run *`AddService`*. It should show up in a browser when "localhost:8080" is accessed.

Step 2: Run *`SubtractService`*. It should show up in a browser when "localhost:8081" is accessed.

2. How did you configure different ports for *`AddService`* and *`SubtractService`* in Spring Boot? Why is this necessary?

By editing "application.properties" for each service. When a service uses a port, that port is occupied by that service and cannot be used by another, so running different services on different ports is necessary.

## Working with Microservices

1. Explain how you would scale the *`AddService`* independently of the *`SubtractService`*. What are the advantages of this ability in a microservices architecture? 

Changes to *`AddService`* do not affect *`SubtractService`* . This means different features (services) are independent from one another (loose coupling) and one feature failing does not affect the functional ones.

2. If one of the services (e.g., *`SubtractService`*) fails or becomes unavailable, what impact does this have on the other service (e.g., *`AddService`*)? How does this compare to a monolithic architecture?

##Reflection

1. Reflect on your experience of working with microservices in this lab. What did you find most challenging or interesting? 

The most challenging is figuring out Gradle. I could not get it to work (with Spring Boot).

2. Based on your experience, what are the potential benefits and drawbacks of using a microservices architecture for a real-world project?

Benefits: Easily scaleable, one problem in a service does not disrupt the entire application

Drawbacks: Complex (getting everything running as well as maintenance)
