package SecondTry.Lessons_Java.pt4_Advanced.Lessons149_Loggers;


import java.io.IOException;
import java.util.logging.*;

/**
 * Created by user on 18.09.2018.
 */
public class FileHandlerMain {
    private static final Logger logger=Logger.getLogger("SecondTry.Lessons_Java.pt4_Advanced.Lessons149_Loggers.MultipleInheritenceLesson");
    public static void main(String[] args) throws IOException {
        Handler fileHandler=new FileHandler("%h/myjavalog.log");
        fileHandler.setFilter(new MyFilter());
        fileHandler.setFormatter(new MyFormatter());
//        new StreamHandler();
//        new SocketHandler();
        logger.setUseParentHandlers(false); //-отключает консольный вывод логов
        logger.addHandler(fileHandler);
        logger.info("keeee info");
        logger.info("keeee Alexander");

    }
    static class MyFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return record.getMessage().endsWith("Alexander");
        }
    }
    static class MyFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            return  record.getLevel()+":. "+record.getMessage()+"   .......\n";
        }
    }
}