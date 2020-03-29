package Newlesson13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckRotatedTest {
    private StringCheckRotated func;


    @BeforeEach
    void before() {
        this.func = new StringCheckRotated();
    }

    @Test
    void check1() {
        assertTrue(func.check("Hello World", "Hello World"));
    }

    @Test
    void check2() {
        assertTrue(func.check("Hello World", "WorldHello "));
    }

    @Test
    void check3() {
        assertTrue(func.check("Hello World", "lo WorldHel"));
    }

    @Test
    void check4() {
        assertTrue(func.check("Hello World", "orldHello W"));
    }

    @Test
    void check5() {
        assertTrue(func.check("Hello World", "rldHello Wo"));
    }

}