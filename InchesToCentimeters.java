
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{   
    
    static double oneInchInCm = 2.54;
    static int oneFeetToInch = 12;
    
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        
        ConverToCentimenters(68);
        
        ConverToCentimenters(5,8);
    }
    
    

    public static double ConverToCentimenters(int heightInches){
        System.out.println("The height values is "+ heightInches);
        
        double centimenters =  heightInches*oneInchInCm;

        System.out.println("The centimenters value of height is "+ centimenters);
        return centimenters;
    }
    
    public static double ConverToCentimenters(int heighFeets,int heightInches){

        int heightFeetsToInches = heighFeets * oneFeetToInch;
        
        int heightTotal = heightFeetsToInches + heightInches;
        
        return ConverToCentimenters(heightTotal);
    }
}
