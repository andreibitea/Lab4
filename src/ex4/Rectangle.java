package ex4;

public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Lățimea trebuie să fie un număr pozitiv.");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Lungimea trebuie să fie un număr pozitiv.");
        }
    }

    public double calculeazaAria() {
        return width * length;
    }

    public double calculeazaPerimetrul() {
        return 2 * (width + length);
    }
}