import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner BoyKiloSor = new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        int kilo = BoyKiloSor.nextInt();

        System.out.print("Boyunuzu giriniz (Örnek: 1,80) : ");
        double boy = BoyKiloSor.nextDouble();

        double vki = ((kilo) / (boy * boy));
        System.out.println(vki);

        if (vki < 18.5) {
            System.out.println("Zayıf");
        } else if (vki < 25) {
            System.out.println("Normal");
        } else if(vki < 30) {
            System.out.println("Fazla Kilolu");
        } else {
            System.out.println("Obez");
        }
/*
        switch (vki) {
            case vki<18.5:
                System.out.println("Zayıf");
                break;
            case vki<25:
                System.out.println("Normal");
                break;
            case vki<30:
                System.out.println("Fazla Kilolu");
                break;
            case vki>30:
                System.out.println("Obez");
                break;

        }
*/
    }
}