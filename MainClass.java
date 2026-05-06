import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
    private static final Logger logger = LoggerFactory.getLogger(MainClass.class);

    public static void main(String[] args) {
        logger.info("Program started");
        logger.debug("Debug message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
