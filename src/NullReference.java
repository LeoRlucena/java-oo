public class NullReference {

    public static void main(String[] args) {

        Account a = null;

        if (a != null) {
            a.printBalance();
        } else {
            System.out.println("Nulo");
        }
    }
}
