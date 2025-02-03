public class NumeroEscluso extends RuntimeException {
    public NumeroEscluso(String message) {
        super(message);
    }
    public NumeroEscluso() {
        super("Il numero inserito è escluso!");
    }
}
