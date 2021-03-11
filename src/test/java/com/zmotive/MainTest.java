package com.zmotive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest{
    @Test
    public void HelloWorldTest() {
        Main m = new Main();
        var s = Main.helloworld();
        Assertions.assertEquals("Hello World", s );
    }
}