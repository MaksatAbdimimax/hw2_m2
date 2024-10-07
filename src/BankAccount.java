public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

     public void deposit(double sum){
         if (sum > 0) {
             amount += sum;

             System.out.println("You have deposited into the account: " +
                     sum + " Current balance: " + amount);
         } else {
             System.out.println("The deposit amount must be positive.");
         }
        }

   public void  withDraw(int sum) throws LimitException {
        if (sum <= 0) {

        return;
        }{
            if (sum > amount) {

                throw new LimitException("Insufficient funds in the account." +
                        " Available for withdrawal: ", amount);
            }
           amount-=sum;
           System.out.println("Withdraw: " + sum + " Current balance: " + amount);
        }

    }
}
