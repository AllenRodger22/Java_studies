package basics;

public class FunctionsPlayground {
    public static void main(String[] args){
        printDino();
        System.out.println(getDino()+" são legais ");
        System.out.println("A soma de 4 + 5 é: "+ sumAB(4, 5));

    }
    static void printDino(){
        System.out.println("Dinossauro");
    }
    static String getDino(){
        return "Dinossauro";
    }
    static int sumAB(int a, int b){
        return a+b;
    }
}
