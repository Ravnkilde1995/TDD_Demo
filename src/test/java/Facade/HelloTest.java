package Facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    Hello hello = new Hello();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testHello(){
        System.out.println("Method to say hello");
        Hello hello = new Hello();
        String actual = hello.sayHello("helge");
        String expected = "Hello, helge";
        assertEquals(expected, actual);
        }

        @Test
    public void testGreedName(){
            System.out.println("method to say hello + name");
            String actual = hello.sayHello("Oliver");
            String expected = "Hello, Oliver";
            assertEquals(expected, actual);
        }
        @Test
        public void testGreedNoname(){
            System.out.println("setting up a condition when name = null");
            String actual = hello.sayHello(null);
            String expected = "Hello, my friend";
            assertEquals(expected, actual);
        }

        @Test
    public void testShouting(){
            System.out.println("setting up a condition when name is typed uppercase");
            String actual = hello.sayHello(null);
            String expected = "my Friends";
            assertEquals(expected, actual);
        }


}