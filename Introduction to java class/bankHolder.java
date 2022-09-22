public class bankHolder {
    public static void main(String[] args) {
        bankAcc cust1 = new bankAcc(12345, 100000, "Saxam");
        cust1.displayBalance();
        cust1.deposit(5000);
        cust1.withdraw(6000);
    }
}
