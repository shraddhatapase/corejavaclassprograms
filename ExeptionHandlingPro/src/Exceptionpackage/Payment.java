package Exceptionpackage;

public class Payment {

    private boolean hasWithdrawn = false;
    private boolean mobileVerified = false;
    private double balance = 1000;
    private String correctPassword = "gpay123";

    // 1. Add Amount Method
    public void addAmount(int amount) {
        try {
            if (amount < 0) {
                throw new NegativeAmountException(
                        "Amount cannot be negative",
                        new Throwable("Amount is negative"),
                        100
                );
            } else {
                balance += amount;
                System.out.println("Payment successful! Added Rs." + amount);
                System.out.println("New Balance: Rs." + balance);
            }
        } catch (NegativeAmountException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
            System.out.println("Error Code: " + ex.getCode());
            System.out.println("Cause: " + ex.getCause());
        }
    }

    // 2. Withdraw (Only one time allowed)
    public void withdraw(int amount) {
        try {
            if (hasWithdrawn) {
                throw new OneTimeWithdrawException("Withdrawal allowed only once per session.");
            }            
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance to withdraw Rs." + amount);
            }
            balance =balance - amount;
            hasWithdrawn = true;
            System.out.println("Withdrawal successful! Withdrawn Rs." + amount);
            System.out.println("Remaining Balance: Rs." + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 3. Password Verification
    public void verifyPassword(String enteredPassword) {
        try {
            if (!enteredPassword.equals(correctPassword)) {
                throw new PasswordMismatchException("Password mismatch! Please try again.");
            }
            System.out.println("Password verified successfully!");
        } catch (PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    // 4. Mobile Number Verification
    public void verifyMobile(boolean verified) {
        try {
            if (!verified) {
                throw new MobileVerificationException("Mobile number not verified!");
            }
            mobileVerified = true;
            System.out.println("Mobile number verified successfully!");
        } catch (MobileVerificationException e) {
            System.out.println(e.getMessage());
        }
    }

    // 5. Make Payment 
    public void makePayment(double amount, String transactionId) {
        try {
            if (!mobileVerified) {
                throw new MobileVerificationException("Cannot make payment — mobile not verified!");
            }
            if (amount <= 0) {
                throw new NegativeAmountException("Invalid payment amount.",
                        new Throwable("Amount must be positive"), 102);
            }
            if (transactionId == null || transactionId.isEmpty()) {
                throw new InvalidTransactionException("Transaction ID cannot be empty!");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Not enough balance to pay Rs." + amount);
            }
            balance =balance - amount;
            System.out.println("Payment of Rs." + amount + " successful!");
            System.out.println("Transaction ID: " + transactionId);
            System.out.println("Remaining Balance: Rs." + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // 6. Display balance
    public void showBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }
}
