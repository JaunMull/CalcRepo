package com.revature.mytests;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstTest {

    @Test
    @Order(2)
    public void firstTest(){
        System.out.println("This is first Test");
    }

    @Test
    @Order(1)
    //@Disabled
    public void secondTest(){
        System.out.println("This is second Test . . . ");
    }

    @BeforeEach
    public void methodBeforeEach(){
        System.out.println("Before Each . . .");
    }

    @BeforeAll
    public static void methodBeforeAll(){
        System.out.println("Before ALl . . .");
    }

    @AfterAll
    public static void methodAfterAll(){
        System.out.println("After All  . . .");
    }

    @AfterEach
    public void methodAfterEach(){
        System.out.println("After Each  . . .");
    }
}
