import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumeriPositivi numeriPositivi = new NumeriPositivi();
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Inserisci un numero positivo: ");

        try {
            Integer num = in.nextInt();
            if (num == 0) {
                break;
            }
            numeriPositivi.addNumero(num);
        } catch (NegativeException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println(numeriPositivi);
        }
        } while (true);
    }
}