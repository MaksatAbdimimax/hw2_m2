public class Main {
    public static void main(String[] args) {
        BankAccount clientAmount = new BankAccount();
        clientAmount.deposit(15000.0);
        while (true){
            try {
                clientAmount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage() + e.getRemainingAmount());
                try {clientAmount.withDraw((int) e.getRemainingAmount());
                } catch (LimitException limitException) {
                }
                break;
        }
    }
}}