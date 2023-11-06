package ex3;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Nero", "Labrador");
        Dog dog2 = new Dog("Rex", "Rottweiler");

        // Afișare inițială
        System.out.println("Câine 1: " + dog1.getName() + " (" + dog1.getBreed() + ")");
        System.out.println("Câine 2: " + dog2.getName() + " (" + dog2.getBreed() + ")");

        // Modificarea proprietăților
        dog1.setName("Hiro");
        dog2.setBreed("Husky");

        // Afișare după modificare
        System.out.println("Câine 1 (dupa modificare): " + dog1.getName() + " (" + dog1.getBreed() + ")");
        System.out.println("Câine 2 (dupa modificare): " + dog2.getName() + " (" + dog2.getBreed() +")");
    }
}
