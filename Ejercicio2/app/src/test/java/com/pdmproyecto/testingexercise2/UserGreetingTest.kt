package com.pdmproyecto.testingexercise2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.*

class UserGreetingTest {

    @Test
    fun testGreeting_withMockedUserService_returnsWelcomeMessage() {
        // Arrange
        val mockService = mock(UserService::class.java)
        `when`(mockService.getUserName()).thenReturn("Miguel")

        val greeting = UserGreeting(mockService)

        // Act
        val result = greeting.greet()

        // Assert
        assertEquals("Welcome Miguel", result)
    }
}
