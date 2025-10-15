package Exceptionpackage;
public class Gpay  {  

    public static void main(String[] args) {
        Payment p = new Payment();

        p.addAmount(500);
        p.verifyPassword("wrongpass");
        p.verifyMobile(true);
        p.withdraw(200);
        p.makePayment(300, "TXN20251015");
        p.showBalance();
    }
}

class NegativeAmountException extends Exception {
    private int code;

    public NegativeAmountException(String message) {
        super(message);
    }

    public NegativeAmountException(String message,Throwable cause, int code) {
        super(message,cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
class MobileVerificationException extends Exception {
    public MobileVerificationException(String message) {
        super(message);
    }
}
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}
class OneTimeWithdrawException extends Exception {
    public OneTimeWithdrawException(String message) {
        super(message);
    }
}
