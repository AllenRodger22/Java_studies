package basics;

public class Fibonnaci {
    public static void main(String[] args){
        //fib(0) = 0
        //fib(1) = 1
        //fib(2) = 1
        for(int i = 0; i<20; i++){
            System.out.println(Fibo(i));
        }

    }
    static int Fibo(int position){
        if(position == 0){
            return 0;
        }else if(position == 1){
            return 1;
        }else{
            return Fibo(position-1)+Fibo(position-2);
        }
    }
}
