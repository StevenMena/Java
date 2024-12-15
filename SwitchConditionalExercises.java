public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		System.out.println(traditionalSwitch('B'));
		System.out.println(traditionalSwitchWithEnum('F'));
		System.out.println(EnhacedSwitchPrintDayOfWeek(2));
	}
    
    //For the char attribute we should use only single quotes and in this traditional Switch condition
    // isn't necessary to use the keyword break because every time that we use return we are breaking the condition
    // and It doesn't do more evaluations.
    public static String traditionalSwitch(char code){
        if(code== 0) return "The code is empty";
        
        switch(code){
            case 'A': 
                return "Able";
            case 'B':
                return "Baker";
            default:
               return "The letter with a message saying no";
        }
    }
    
    
     static enum Nato {
        A("Able"),
        B("Baker"),
        C("Charlie"),
        D("Dog"),
        E("Easy"),
        F("Fox");
        
        public final String label;

        private Nato(String label) {
            this.label = label;
        }
        
        public static Nato fromChar(char code) {
            for (Nato nato : values()) {
                if (nato.name().charAt(0) == code) {
                    return nato;
                }
            }
            return null; // Return null if no matching enum constant is found
        }
    }
    
    //Use the enum class into the switch condition
    //For this example we create a specific method "fromChar" in the enum to get the enum from the character code
    //then we can use this enum object in the switch condition, on this way, we are able to use the enum 
    //as evaluations in each case into the switch
    public static String traditionalSwitchWithEnum(char code){
        if(code== '\u0000') return "The code is empty";
        
        Nato nato = Nato.fromChar(code);
        if(nato==null){
            return "The code is empty or invalid";
        }
        
        switch(nato){
            case A: 
                return nato.label;
            case B:
                return nato.label;
            case F:
                return nato.label;
            default:
               return "The letter with a message saying no";
        }
        
    }
    
    
    //This is an example of Enhanced Switch Conditional and uses it as an expression
    //It is smoother to use it and also increases the Readability
    //When we want to return something to one case or the case has more than one line we use curly braces and 
    //to return something we use the keyword yield.
    public static String EnhacedSwitchPrintDayOfWeek(int day){
        if(day<0 || day>6) return "Invalid Day";
        
        String dayOfWeek=switch(day){
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Invalid Day";
        };
        return dayOfWeek;
    }
}
