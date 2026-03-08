package RealWorldProblems.Logger;

public class Logger {

    private static LogMessage logMessage;
    private static volatile Logger instance;

    public static Logger getInstance(){
        if(instance == null){
            synchronized (Logger.class){
                if(instance == null){
                    instance = new Logger();
                    setLogMessage();
                    return instance;
                }
            }
        }
        return instance;
    }

    public static void setLogMessage(){
        logMessage = new LogMessage();
    }


    public void debug(String message){
        logMessage.log(LogLevel.DEBUG, message);
    }

    public void info(String message){
        logMessage.log(LogLevel.INFO, message);
    }



}
