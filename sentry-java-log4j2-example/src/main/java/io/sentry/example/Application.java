package io.sentry.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application
{
    private static final Logger logger = LogManager.getLogger("example.Application");

    public static void main(String[] args)
    {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");

        try {
            int example = 1 / 0;
        } catch (Exception e) {
            logger.error("Caught exception!", e);
        }
    }
}
