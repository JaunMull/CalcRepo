package com.revature.mytests;

import com.revature.logic.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {
   static  Calculator c;//=new Calculator();
@BeforeAll
public static void setUp(){
    c=new Calculator();
}
    @Test
    @Order(4)
    public void add(){

        int addResult = c.add(2,2);

        Assertions.assertEquals(4,addResult);
    }

    @Test
    @Order(2)
    @Disabled
    public void sub(){
       // Calculator c=new Calculator();
        int subResult = c.sub(2,2);

        Assertions.assertEquals(0,subResult);
    }

    @Test
    @Order(1)
    public void mult(){
      //  Calculator c=new Calculator();
        int multResult = c.mult(2,2);

        Assertions.assertEquals(4,multResult);
    }

    @Test
    @Order(3)
    public void div(){
        int divResult = c.div(2,2);

        Assertions.assertEquals(1,divResult);
    }

    public void testsDivision(){
    System.out.println("Testing Division");

    Assertions.assertThrows(ArithmeticException.class,() -> {c.div(3,0);});
    }
}

