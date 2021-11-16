package basics;

public class SalaryCalculator {
    public static void main (String[] args){
        //var that define career
        String career;
        System.out.println("Program is starting...");
        career = "Software Developer";
        System.out.println("My career is " + career);
        //calculate annual salary
        int hoursperweek = 40;
        int weeksperyear = 50;
        double rate = 42.50;
        double salary = hoursperweek*weeksperyear*rate;
        System.out.println("My annual salary is: "+ salary);
    }
}
