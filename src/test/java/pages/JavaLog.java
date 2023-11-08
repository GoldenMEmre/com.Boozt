package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class JavaLog {

<<<<<<< HEAD
    public static Logger logger = Logger.getLogger(JavaLog.class);
=======
    public Logger logger = LogManager.getLogger(JavaLog.class);
>>>>>>> main
    public JavaLog(){
        DOMConfigurator.configure("xmlFiles.log4j.xml");
    }
    public void info(String message){
        logger.info(message);
    }
    public void warn(String message){
        logger.warn(message);
    }
    public void error(String message){
        logger.error(message);
    }
}

