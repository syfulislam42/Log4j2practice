package Alpha;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    private static Logger log = LogManager.getLogger(Demo.class.getName());

    public static void main(String[] args) {

        log.debug("I've clicked on button");
        log.info("Button is displayed");
        log.info("Button is not displayed");
        log.error("button is missing");


    }

}

