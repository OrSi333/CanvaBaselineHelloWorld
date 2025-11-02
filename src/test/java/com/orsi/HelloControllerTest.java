package com.orsi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("HelloController Unit Tests")
class HelloControllerTest {

    @InjectMocks
    private HelloController helloController = new HelloController();

    @Test
    @DisplayName("Should return 'Hello World' when calling hello()")
    void testHello() {
        // When
        String result = helloController.hello();

        // Then
        assertNotNull(result);
        assertEquals("Hello World", result);
    }
}

