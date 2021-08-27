package domain;

public class Keyboard extends InputDevice{

    private final int idKeyboard;
    private static int counterKeyboard;

    public Keyboard(String inputType, String brand) {
        super(inputType, brand);
        this.idKeyboard = ++counterKeyboard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("idKeyboard=").append(idKeyboard);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
