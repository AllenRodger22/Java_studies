package basics;

public class Factorial {
    public static void main(String[]args){
        System.out.println(Factorial(0));
    }
    static int Factorial(int n){
        if(n == 0){
            return 1;
        }else if( n == 1){
            return 1;}else{
            return n* Factorial(n-1);
        }
    }
}
