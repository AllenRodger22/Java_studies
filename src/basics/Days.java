package basics;

public class Days {
    public static void main(String[]args){
        //execute blocks of code based on a value of a condition
        String dayOfWeek = "Saturday";
        switch ( dayOfWeek){
            case "Monday" : System.out.println("Today is Monday!");
                break;
            case "Tuesday" : System.out.println("Today is Tuesday!");
                break;
            case "Wednesday" : System.out.println("Today is Wednesday!");
                break;
            case "Thursday" : System.out.println("Today is Thursday!");
                break;
            case "Friday" : System.out.println("Today is Friday!");
                break;
            default: System.out.println("Today is weekend! great! :)");
        }
    }
}
