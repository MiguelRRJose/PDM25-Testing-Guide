package com.pdmproyecto.testingexercise2

class UserGreeting(private val userService: UserService) {
    fun greet(): String {
        val name = userService.getUserName()
        return "Welcome $name"
    }
}
