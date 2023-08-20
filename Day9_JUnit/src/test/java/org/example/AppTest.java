package org.example;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class AppTest {

    App app;
    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    public void testEqualsOrNotEquals(){
        String message = "Add is working ";

        Assert.assertEquals(10,app.add(6,4));
        Assert.assertNotEquals(8,app.add(4,5));

    }

    @Test
    public void testNullorNotNull(){
        Assert.assertEquals(0,app.add(0,0));
        Assert.assertNotEquals("Not null",1,app.add(5,2));
    }



}