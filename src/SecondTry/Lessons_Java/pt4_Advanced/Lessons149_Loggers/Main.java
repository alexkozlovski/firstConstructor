package SecondTry.Lessons_Java.pt4_Advanced.Lessons149_Loggers;


import java.util.logging.*;

public class Main {
    //-Djava.util.logging.config.file=/ vm options in runconfig
    //-Djava.util.logging.config.file=E:\Java\javaintellijidea\firstConstructor\src\SecondTry\Lessons_Java\Lessons149_Loggers\log.properties

    //private static final Logger logger=Logger.getGlobal();
    private static final Logger logger=Logger.getLogger("SecondTry.Lessons_Java.pt4_Advanced.Lessons149_Loggers.MultipleInheritenceLesson");
    public static void main(String[] args) throws Exception{
//        LogManager.getLogManager().readConfiguration();
//        System.out.println(System.getProperty("java.util.logging.config.file"));
//         logger.info("messagaaa");
        logger.log(Level.FINER,"finer");
        logger.log(Level.INFO,"info");
        logger.log(Level.WARNING,"warnings ",new Throwable());

        //Handler FileHandlerMain=new FileHandler();
        Handler consoleHandler=new ConsoleHandler();
        consoleHandler.setFilter(new MyFilter());
        consoleHandler.setFormatter(new MyFormatter());
//        new StreamHandler();
//        new SocketHandler();
        logger.setUseParentHandlers(false); //-отключает консольный вывод логов
        logger.addHandler(consoleHandler);
        logger.info("keeee info");
        logger.info("keeee Alexander");

    }
    static class MyFilter implements Filter{
        @Override
        public boolean isLoggable(LogRecord record) {
           return record.getMessage().endsWith("Alexander");
        }
    }
    static class MyFormatter extends Formatter{
        @Override
        public String format(LogRecord record) {
            return  record.getLevel()+":. "+record.getMessage()+"   .......\n";
        }
    }
}