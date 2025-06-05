package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testGreeting() {
        // The test will pass only when getGreeting() returns "Hello, world!"
        assertEquals("Hello, world!", App.getGreeting());
        System.out.println("Success! Join our Discord: https://flazesmp.benzoogataga.com/discord-recruitment");
    }
}
