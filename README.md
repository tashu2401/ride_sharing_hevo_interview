# Ride Sharing Application

## Overview

This project implements a Ride Sharing Application in Java using Object-Oriented Design principles.

The system allows users to:

* Register themselves in the platform
* Register vehicles
* Offer rides as drivers
* Select rides as passengers
* Choose rides using different ride selection strategies

The solution follows a modular design and uses the Strategy Design Pattern to support multiple ride selection mechanisms.

---

## Features

### User Onboarding

* Add users with basic details
* Maintain user information

### Vehicle Registration

* Add vehicles owned by users
* Associate vehicles with their respective owners

### Offer Ride

Drivers can offer rides with:

* Source
* Destination
* Start Time
* Ride Time
* Available Seats
* Vehicle Details

### Select Ride

Passengers can select rides using configurable strategies:

#### Shortest Ride Strategy

Selects the ride having the minimum ride duration.

#### Earliest Ride Strategy

Selects the ride that reaches the destination earliest.

---

## Design Pattern Used

### Strategy Pattern

The ride selection logic is encapsulated using the Strategy Pattern.

Implemented Strategies:

* ShortestRideStrategy
* EarliestRideStrategy

This design allows new ride selection algorithms to be added without modifying existing business logic.

---

## Project Structure

```text
src
│
├── model
│   ├── User.java
│   ├── Vehicle.java
│   └── Ride.java
│
├── service
│   └── RideSharingService.java
│
├── strategy
│   ├── RideSelectionStrategy.java
│   ├── ShortestRideStrategy.java
│   └── EarliestRideStrategy.java
│
└── Main.java
```

---

## Class Responsibilities

### User

Represents a user of the system and maintains vehicle ownership information.

### Vehicle

Represents a vehicle registered by a user.

### Ride

Represents a ride offered by a driver.

### RideSharingService

Contains all business operations:

* User registration
* Vehicle registration
* Ride offering
* Ride selection

### RideSelectionStrategy

Defines the contract for ride selection algorithms.

---

## Sample Execution

### Input Scenario

1. Register Users:

   * Rohan
   * Shashank
   * Nandini

2. Register Vehicle:

   * Swift (KA01AB1234)

3. Offer Ride:

   * Bangalore → Mysore
   * Start Time: 9
   * Ride Time: 3
   * Available Seats: 2

4. Passenger selects ride using ShortestRideStrategy

---

### Output

```text
Ride booked with driver : Rohan
```

---

## How to Run

Compile:

```bash
javac model/*.java strategy/*.java service/*.java Main.java
```

Run:

```bash
java Main
```

---

## Technologies Used

* Java
* Object-Oriented Programming
* Strategy Design Pattern

---

## Author

Anushka Sharma

B.Tech Computer Science and Engineering

NIT Silchar
<img width="945" height="341" alt="image" src="https://github.com/user-attachments/assets/444ce3a8-1fcc-430c-b4d9-14eb6370e77a" />
