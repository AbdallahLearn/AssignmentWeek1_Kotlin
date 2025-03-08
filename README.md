# Week 1 Assignment: Building a Basic Android App with Kotlin & Jetpack Compose

## Project Overview

This project is designed to demonstrate the implementation of Kotlin fundamentals, Object-Oriented Programming (OOP) principles, and Jetpack Compose UI components in an Android application. The goal is to set up an Android Studio project, implement Kotlin features like classes, data classes, collections, and higher-order functions, as well as design a basic UI using Jetpack Compose. The app will include a "Watch List" button with toggle functionality.

## Setup Instructions

To get started with this project, follow these steps:

1. **Clone the Repository**
   - Open your terminal or Git Bash and run:
     ```
     git clone https://github.com/your-username/week1-android-assignment.git
     ```

2. **Install Android Studio**
   - If you don't have Android Studio installed, download and install it from [here](https://developer.android.com/studio).
   
3. **Open the Project**
   - Open Android Studio and select **Open an Existing Project**.
   - Navigate to the folder where you cloned the repository and select the project.

4. **Set Up the Android Emulator**
   - In Android Studio, open **AVD Manager** (Android Virtual Device).
   - Create a new emulator or select an existing one to test the app.

5. **Run the Application**
   - Ensure that your emulator or physical device is connected.
   - Press the **Run** button (green triangle) in Android Studio to build and run the app.

## Features Implemented

- **Kotlin Fundamentals**:
  - A `User` class with properties `name`, `age`, and `email`.
  - A `UserData` data class for storing user details.
  - Use of Kotlin collections such as List, Set, and Map to store user data.
  - Lambda functions and higher-order functions to filter users above 18 years old.

- **Object-Oriented Programming (OOP)**:
  - Interface `GreetingProvider` with a method `provideGreeting()`.
  - `FriendlyGreeting` class that implements the `GreetingProvider` interface.
  - Inheritance where the `Person` class is extended by the `User` class.

- **UI Design with Jetpack Compose**:
  - Clone of the given UI screen using Jetpack Compose.
  - "Watch List" button that toggles between states when clicked.
  - Basic UI layout with static or placeholder images/text.

## Technologies Used

- **Kotlin**: Used for writing the app's logic, implementing classes, data classes, collections, and higher-order functions.
- **Jetpack Compose**: Used for building the UI components and implementing the toggle functionality for the "Watch List" button.
- **Android Studio**: The IDE used for development, testing, and running the project.

## How to Contribute

1. Fork the repository to your own GitHub account.
2. Create a new branch for your changes:
3. Make your changes and commit them with a clear message:
4. Push your changes to your forked repository:
5. Submit a pull request from your fork to the original repository.

## Bonus Challenge (Extra 10 Marks)

- **Dark Mode Toggle**: Implemented using Jetpack Compose for a dynamic theme switch.
- **Bottom Navigation Bar**: Added to the app to allow easy navigation between different sections.

## Project Submission

The completed project is hosted on GitHub:
- Repository: [GitHub Repository Link](https://github.com/your-username/week1-android-assignment)

## License

This project is open-source and available under the [MIT License](LICENSE).
