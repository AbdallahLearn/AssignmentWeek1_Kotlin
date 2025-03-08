package com.example.week1_assignment

fun main() {

    println("Q1-----------------")
    //from User class
    val user = User("Abdullah", 25, "abdullah@example.com")
    println(user.getUserInfo())


    println("Q2-----------------")
    //from userData class
    val userData = UserData("Abdullah", 23, "Abdullah@gmail.com")
    println(userData)

    println("Q3-----------------")
    //List, Set and Map

    // List Example (Ordered, Allows Duplicates)
    val userList = listOf(
        UserData("Naif", 24 , "Naif@gmail.com"),
        UserData("Abdullah", 11 , "Abdullah@gmail.com"),
        UserData("Ahmed", 17, "Ahmed@gmail.com")
    )
    println("List of users:")
    userList.forEach{println(it)}

    // Set Example (Unique Elements, Unordered)
    val userSet = setOf(
        UserData("Fisal", 31, "Fisal@gmail.com"),
        UserData("Saad", 22, "Saad@gmail.com"),
        UserData("Farah", 45, "Farah@gmail.com"),
        UserData("Farah", 55, "Farah@gmail.com"), // Duplicate won't be added (will not be printed)
    )
    println("\nSet of user: ")
    userSet.forEach{println(it)}

    //Map Example (Key-Value Pairs)
    val userMap = mapOf(
        "user1" to UserData("Mohammed", 33, "Mohammed@gmail.com"),
        "user2" to UserData("Salah" , 12, "Salah@gmail.com"),
        "user3" to UserData("Saqer", 10, "Saqer@gmail.com")
    )
    println("\nMap of Users:")
    userMap.forEach{(key, value) -> println("$key -> $value")}

    println("Q4-----------------")

    val adults = userList.filter { it.age >18 }
    println("Users above 18: ")
    adults.forEach { println(it) }

    println("OOP Section-----------------")
    println("Q5-----------------")
    val greeting:GreetingProvider  = FriendlyGreeting() //interface then name of the class  better way
    println(greeting.provideGreeting())


    println("Q6-----------------")
    val userPerson = User("Saad", 60,"Saad@gmail.com")
    println(userPerson.getUserInfo())
    userPerson.showEmail()

}