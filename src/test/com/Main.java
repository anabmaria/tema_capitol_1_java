package test.com;

public class Main {

    public static void main(String[] args) {
        int numar = 3;
        double numarFractional = 4.5;
        String sir = "3";
        boolean valoare = true; //false

                System.out.println("Aceasta este o variabila int " + numar);
                System.out.println("Aceasta este o variabila double " + (int)numarFractional);
                System.out.println("Aceasta este o variabila sting " + sir);
                System.out.println("Aceasta este o variabila bool " + valoare);

                numar++; // numar = numar + 2
        System.out.println("Aceasta este o variabila int " + numar);
                int suma = numar + Integer.parseInt(sir);
        System.out.println("SUma are valoarea " + suma);

    }
}