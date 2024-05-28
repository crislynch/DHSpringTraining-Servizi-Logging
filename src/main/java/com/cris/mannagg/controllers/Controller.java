package com.cris.mannagg.controllers;

import com.cris.mannagg.services.ExponentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private ExponentService exponentService;

    Logger logger = LoggerFactory.getLogger(Controller.class);


    @GetMapping("/")
    public String welcome() {
        String message = "Benvenuti nella mia applicazione Spring!";
        logger.info(message);
        return message;
    }

    @GetMapping("/exp")
    public int getExponent() {
        return exponentService.calcoloEsponente();
    }

    @GetMapping("/get-errors")
    public String getError() {
        String message = "Error!";
        Error error = new Error("This is a custom error made by Claudio");
        logger.error("Attention! An error occurred! : " + error);
        return message;
    }
}
