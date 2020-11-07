package com.example.gof.behavioral_patterns.chain_of_resp;

import org.junit.jupiter.api.Test;

class AbstractLoggerTest {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    @Test
    void write() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
        System.out.println();
    }
}