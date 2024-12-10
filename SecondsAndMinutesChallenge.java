
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        System.out.println(getDurationString(2000));    
            
    }
    
     static int oneMinuteToSeconds = 60;
    static int oneHourToMinutes = 60;
    static int oneHourToSeconds = 3600;
    
    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Error: The convertion can't be processed,  Invalid Seconds value";
        }
        
        int minutes = seconds/oneMinuteToSeconds;
        
        int newSeconds = seconds%oneMinuteToSeconds;
        return getDurationString(minutes,newSeconds);
        
        
    }
    
    public static String getDurationString(int minutes,int seconds){
        if(minutes<0 || (seconds<0 || seconds>59)){
            return "Error: The convertion can't be processed,  Invalid Minutes/Seconds value";
        }
        
        int hours = minutes/oneHourToMinutes;
        int newMinutes = minutes%oneHourToMinutes;
        
        return "'" + hours + "h " +newMinutes+ "m " +seconds+"s'";
    }
}
