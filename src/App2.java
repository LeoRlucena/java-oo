public class App2 {

    public static void main(String[] args) {

        Account a = new Account();

        if (!a.deposit(- 100)) {
            System.out.println("Ops, invalid deposit!");
        }

        a.printBalance();

        a.deposit(200);

        if (!a.withdraw(-50)) {
            System.out.println("Ops, invalid withdraw");
        }

        a.printBalance();
    }
}
