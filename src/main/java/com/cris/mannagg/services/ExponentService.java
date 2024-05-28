package com.cris.mannagg.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExponentService {

    Logger logger = LoggerFactory.getLogger(ExponentService.class);

    @Value("${custom.variable1}")
    private int customVariable1;

    @Value("${custom.variable2}")
    private int customVariable2;

    public int calcoloEsponente() {
        logger.info("Inizio del calcolo dell'esponente");
        int result = (int) Math.pow(customVariable1, customVariable2);
        logger.info("Calcolo dell'esponente terminato, ecco il risultato: {}", result);
        return result;
    }

}
