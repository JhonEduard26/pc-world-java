package domain;

public class Mouse extends InputDevice{

    private final int idMouse;
    private static int counterMouse;

    public Mouse(String inputType, String brand) {
        super(inputType, brand);
        this.idMouse = ++Mouse.counterMouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("idMouse=").append(idMouse);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}

