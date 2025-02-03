import java.util.ArrayList;

public class NumeriPositivi {
    private ArrayList<Integer> numeriPositivi = new ArrayList<Integer>();
    public void addNumero(int num) {
        if (num < 0) {
            throw new NegativeException();
        }
        numeriPositivi.add(num);
    }
    public void removeNumero(Integer num) {
        numeriPositivi.remove(num);
    }
    public String toString() {
        return numeriPositivi.toString();
    }
}
