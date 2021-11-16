package basics;

public class BankAccount {
    public static void  main(String[]args){
        BankAcc[] Accounts = new BankAcc[2];
        Accounts[0] = new BankAcc("Allen",100.00,"PoliteCat22");
        Accounts[1] = new BankAcc("Sávio Filho",150.00,"OEspinho27");
        Accounts[1].checkBalance();
        Accounts[0].checkBalance();
        Accounts[1].pix(15.0,"PoliteCat22",Accounts);
        Accounts[0].checkBalance();
        Accounts[1].checkBalance();
    }
}
class BankAcc {

    //Acc properties
    private String accName;
    private double balance;
    private String pixAddress;
    private boolean enableToTransactions = false;


    //setters and getters
    public String getName() {
        return accName;
    }

    public void setName(String name) {
        accName = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double value) {
        balance = balance + value;
    }

    public String getPixAddress() {
        return pixAddress;
    }

    public void setPixAddress(String pix) {
        pixAddress = pix;
        if (enableToTransactions == false) {
            enableToTransactions = true;
        }
    }

    public boolean CanUsePix() {
        return enableToTransactions;
    }


    //constructor methods

    BankAcc(String Name) {
        setName(Name);
        System.out.println("Acc created for :" + getName());

    }

    BankAcc(String Name, double initialDeposit, String pixAddress) {
        setName(Name);
        System.out.println("Acc created for :" + getName());
        deposit(initialDeposit);
        setPixAddress(pixAddress);
        System.out.println("Your pix is:" + getPixAddress() + " this is your rout for receive money!");
    }

    //methods

    void pix(double amount, String rout, BankAcc[] acc) {
        boolean pixDone = false;
        boolean withdraw = false;
        if (withdraw(amount)) {
            withdraw = true;
            for (BankAcc i : acc) {
                if (i.getPixAddress() == rout) {
                    pixDone = true;
                    i.deposit(amount);

                }
            }
            if (pixDone == false && withdraw ==true)
            {deposit(amount);}

            }
        }

    void deposit(double amount) {
        setBalance(amount);
        System.out.println("Your balance now is: "+getName() + getBalance());
    }

    boolean withdraw(double amount) {
        try {
            if (amount <= getBalance()) {
                setBalance(-amount);
                System.out.println("Your balance now is: " +getName()+ getBalance());
                return true;
            } else {
                throw new InsufficientFunds(getBalance());
            }
        } catch (InsufficientFunds e) {
            return false;
        }
    }
        void checkBalance () {
            System.out.println("Your balance now is: " +getName()+" "+ getBalance());
        }
    }
