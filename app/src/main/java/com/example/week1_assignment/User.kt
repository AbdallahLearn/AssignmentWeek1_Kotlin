package com.example.week1_assignment

class User (  name: String,  age: Int, val email: String): Person(name,age){

    fun getUserInfo():String{
        return "Name: $name , Age: $age, Email: $email"
    }

    fun showEmail() {
        println("My email is $email")
    }


}