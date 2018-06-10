package com.misha;

import org.apache.log4j.Logger;

public class MainApp {
    private static final Logger log = Logger.getLogger(MainApp.class);

    public static void main(String[] args){
        log.info("MainApp Started.");

        log.debug("MainApp is Debugging");
        log.info("MainApp Finished.");
    }
}
