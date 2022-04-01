package com.revature.mytests;

import com.jaunzel.junit5.GreetingService;
import com.jaunzel.junit5.GreetingServiceIMPL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class GreetingIMPLTest {

    @Mock
    private GreetingService service;

    @InjectMocks
    private GreetingServiceIMPL greeting;
    //GreetingService greeting=new GreetingServiceImpl();

    @Test
    public void greetShouldRetunAValidOutput() {
        System.out.println("greetShouldRetunAValidOutput");
        when(service.greet("Junit")).thenReturn("Hello Junit");
        String result = greeting.greet("Junit");
        Assertions.assertNotNull(result);
        Assertions.assertEquals("Hello Junit", result);
    }

    @Test
    public void greetShouldThrowAnException_For_NameIsNull() {
        System.out.println("greetShouldThrowAnException_For_NameIsNull");
        doThrow(IllegalArgumentException.class).when(service).greet(null);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greeting.greet(null);
        });
    }

    @Test
    public void greetShouldThrowAnException_For_NameIsBlank() {
        System.out.println("greetShouldThrowAnException_For_NameIsBlank");
        doThrow(IllegalArgumentException.class).when(service).greet("");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            greeting.greet("");
        });
    }

}