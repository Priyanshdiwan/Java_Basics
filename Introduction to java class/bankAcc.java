public class bankAcc {
    int accNo, balance;
    String name;
    char accType;

    bankAcc(int acno, int blnce, String nme){
        accNo = acno;
        balance = blnce;
        name = nme;
    }

    public void displayBalance(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(int amount){
        System.out.println("Withdrawing: "+ amount);
        balance -= amount;
        System.out.println("New Balance: "+balance);
    }

    public void deposit(int amount){
        System.out.println("Deposit: "+ amount);
        balance += amount;
        System.out.println("New Balance: "+balance);
    }


}


