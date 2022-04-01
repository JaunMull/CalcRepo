package com.revature.mytests;

import com.jaunzel.junit5.GreetingService;
import com.jaunzel.junit5.GreetingServiceIMPL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class GreetingTest {
    @Mock
    private GreetingService service;

    @InjectMocks
    private GreetingServiceIMPL greeting;


    @Test
    public void GreetTest(){
        GreetingService greeting= new GreetingServiceIMPL();
        String result= greeting.greet("Jaunzel");

        Assertions.assertEquals("Hello Jaunzel", result);

    }
}
