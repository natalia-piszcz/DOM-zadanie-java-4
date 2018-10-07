public class Televisor {

    boolean televisorIsTurnOn = false;

    void turnOn() {
        System.out.println("Włącz telewizor");
        boolean televisorIsTurnOn = true;
    }

    void turnOff() {
        System.out.println("Wyłącz telewizor");
        boolean televisorIsTurnOn = false;
    }

    void showStatus() {
        if (televisorIsTurnOn = true) {
            System.out.println("Telewizor jest włączony");
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }

}
