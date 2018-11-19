package Beta;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

    private static Logger log = LogManager.getLogger(Demo1.class.getName());

    public static void main(String[] args) {

        log.debug("I am debugging");
        log.fatal("This is fatal");
        log.info("Object is present");
        log.error("object is not present");
    }

}

