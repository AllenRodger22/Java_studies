package basics;

public class InsufficientFunds extends Exception{
    public double funds;

    public InsufficientFunds(double funds){
        this.funds = funds;
        System.out.println("Error: not enough funds for this operation, fund left:"+ this.funds);
    }
}
