package com.pdmproyecto.testingexercise5

class Validator {
    fun isValidEmail(email: String): Boolean {
        return email.contains("@") && email.contains(".com")
    }
}
