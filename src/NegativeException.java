public class NegativeException extends EccezioneNumerica {
    public NegativeException(String message) {
        super(message);
    }
    public NegativeException() {
        super("Puoi inserire solo numeri positivi!");
    }
}
