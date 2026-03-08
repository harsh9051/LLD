package RealWorldProblems.Logger;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LogMessage {

    public LogMessage(){};

    public void log(LogLevel logLevel, String message){
        System.out.println(String.valueOf(logLevel) + " " + message + " " + String.valueOf(LocalDateTime.now()));
    }
}
