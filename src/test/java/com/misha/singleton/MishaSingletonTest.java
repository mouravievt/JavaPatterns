package com.misha.singleton;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

public class MishaSingletonTest {
    private int secretKey = -1;
    private Date present = null;

    @BeforeClass
    public void init(){
        secretKey = (int)(Math.random() * 1000);
        present = new Date();
    }

    @Test
    public void testForSingleton(){
        MishaSingleton first = MishaSingleton.getInstance(present, secretKey);
        MishaSingleton second = MishaSingleton.getInstance(new Date(), 758439);
        MishaSingleton third = MishaSingleton.getInstance(new Date(), 37982);

        Assert.assertEquals(first.getNum(), secretKey);
        Assert.assertEquals(second.getNum(), secretKey);
        Assert.assertEquals(third.getNum(), secretKey);

        Assert.assertEquals(first.getCreated(), present);
        Assert.assertEquals(second.getCreated(), present);
        Assert.assertEquals(third.getCreated(), present);
    }

}
