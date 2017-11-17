package bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner Odczyt = new Scanner(System.in);
        int iChose;
        int iWpłata;
        int iChose2;
        int iWypłata;
        KontoBankowe Konto1 = new KontoBankowe("Bartłomiej", "Rodak");
        KontoBankowe Konto2 = new KontoBankowe(50,"Damian", "Rodak");
        System.out.println("W naszym Banku posiadamy 2 konta: \n " + Konto1.getImie() + " " + Konto1.getNazwisko() + " Prosze wybrać 1: \n " + Konto2.getImie() + " " + Konto2.getNazwisko() + " Prosze wybrać 2:");
        iChose = Odczyt.nextInt();

        if (iChose == 1) {
            System.out.println("Witaj " + Konto1.getImie());
            System.out.println("Wpłata wybierz 1: \n Wypłata wybierz 2:");
            iChose2 = Odczyt.nextInt();
            if (iChose2 == 1) {
                System.out.println("Ile chces wpłacić ?");
                iWpłata = Odczyt.nextInt();
                Konto1.wpłata(iWpłata);
                System.out.println("Masz na koncie: " + Konto1.getSaldo() + "zł");
            }
            if (iChose2 == 2) {
                System.out.println("Ile chces wypłacić ?");
                iWypłata = Odczyt.nextInt();
                Konto1.wypłata(iWypłata);
                System.out.println("Masz na koncie: " + Konto1.getSaldo() + "zł");
            }

        }
        if (iChose == 2) {
            System.out.println("Witaj " + Konto2.getImie());
            System.out.println("Wpłata wybierz 1: \n Wypłata wybierz 2:");
            iChose2 = Odczyt.nextInt();
            if (iChose2 == 1) {
                System.out.println("Ile chces wpłacić ?");
                iWpłata = Odczyt.nextInt();
                Konto2.wpłata(iWpłata);
                System.out.println("Masz na koncie: " + Konto2.getSaldo() + "zł");
            }
            if (iChose2 == 2) {
                System.out.println("Ile chces wypłacić ?");
                iWypłata = Odczyt.nextInt();
                Konto2.wypłata(iWypłata);
                System.out.println("Masz na koncie: " + Konto2.getSaldo() + "zł");
            }

        }

        System.out.println("Dziekujemy za skorzystanie z bankomatu");

    }

}
