public class IntervalloException extends NumberFormatException {
    public IntervalloException(String message) {
        super(message);
    }
    public IntervalloException() {
        super("Il numero inserito non è compreso tra 0 e 30!");
    }
}
