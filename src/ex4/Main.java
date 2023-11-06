package ex4;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(5.0);
        rectangle1.setLength(8.0);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Aria: " + rectangle1.calculeazaAria());
        System.out.println("Perimetrul: " + rectangle1.calculeazaPerimetrul());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(3.0);
        rectangle2.setLength(4.0);

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Length: " + rectangle2.getLength());
        System.out.println("Aria: " + rectangle2.calculeazaAria());
        System.out.println("Perimetrul: " + rectangle2.calculeazaPerimetrul());
    }
}