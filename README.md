[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/YfvsP8Zh)

Project Overview

This project tasked us with creating a basic UML diagram for an online Courier System, and to provide a code snippet example of how we are implementing one of the SOLID principles.


Order Class

I decided to go with the Order class as my code snippet. This class is responsible for handling operations of an order.

Key Features of the Order Class:

-Attributes:

      orderId,
      
      orderDate,
      
      orderStatus,
      
      orderTotal
              
-Methods:

      -checkOrder(): Looks up and verifies the status of an order
      
      -cancelOrder(): Handles canceling an order
      
      -placeOrder(): Handles the placement of new orders.
            
![image](https://github.com/user-attachments/assets/28fa4600-db53-40cd-8036-9f78bfc66a4f)


Single Responsibility Principle

The Order class demonstrates the SRP in the following ways:

1. Single Responsibility: This class is solely responsible for managing the state of an order.

2. Methods : All the methods in the class are related to the core function of managing orders.

3. Only One Reason To Change : The SRP states that a class should have only one reason to change, and the order class adheres to this.


Future Enhancements

If we were tasked with making a complex system, you could argue that it would be better to seperate the Order class into distinct classes such as:

-OrderStatusChecker

-OrderCancelService

-OrderPlacementService

UML Diagram

The UML diagram has been included in the repo.


