public class MyTestException extends RuntimeException{
    private int errorCode;

    public MyTestException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public static void withdraw(double balance, double amount) {
        if (amount > balance) {
            throw new MyTestException("Insufficient balance", 2001);
        }
        System.out.println("Withdraw successful");
    }

    public static void main(String[] args) {
        try {
            withdraw(80, 100);
        } catch (MyTestException e) {
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("Massage: : " + e.getMessage());
        }
    }
}