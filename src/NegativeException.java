public class NegativeException extends NumberFormatException {
    public NegativeException(String message) {
        super(message);
    }
    public NegativeException() {
        super("Puoi inserire solo numeri positivi!");
    }
}
