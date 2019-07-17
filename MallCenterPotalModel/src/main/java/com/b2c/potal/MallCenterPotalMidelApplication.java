package com.b2c.potal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class MallCenterPotalMidelApplication {

    private final static Logger logger = LoggerFactory.getLogger(MallCenterPotalMidelApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MallCenterPotalMidelApplication.class, args);
        logger.info("MallCenterPotalMidelApplication is success!");
    }
}
