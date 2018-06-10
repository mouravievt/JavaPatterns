package com.misha.singleton;

import java.util.Date;

public class MishaSingleton {
    private static MishaSingleton instance = null;
    private Date created = null;
    private int num;

    private MishaSingleton(Date created, int num){
        this.created = created;
        this.num = num;
    }

    public static MishaSingleton getInstance(Date date, int ii){
       //lazy initialization - only initialized when you need it to be.
        if (null == instance){
           instance = new MishaSingleton(date, ii);
        }
        return instance;
    }
}
