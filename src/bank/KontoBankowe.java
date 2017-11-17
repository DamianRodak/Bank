package bank;

public class KontoBankowe {

    private String sImie;
    public int iSaldo;
    private String sNazwisko;
    private int iDebet;

    int getSaldo() {
        return iSaldo;
    }

    String getNazwisko() {
        return sNazwisko;
    }

    int getiDebet() {
        return iDebet;
    }

    String getImie() {
        return sImie;
    }

    KontoBankowe() {
        this.sImie = "";
        this.sNazwisko = "";
        this.iSaldo = 0;
        this.iDebet = 1000;
    }

    KontoBankowe(String imie, String nazwisko) {
        this.sImie = imie;
        this.sNazwisko = nazwisko;
        this.iSaldo = 0;
        this.iDebet = 1000;
    }

    int wpłata(int wpłata) {
        this.iSaldo += wpłata;
        return iSaldo;
    }

    int wypłata(int wypłata) {
        this.iSaldo -= wypłata;
        if (this.iSaldo >= -this.iDebet) {
            return iSaldo;
        } else {
            System.out.println("Przekroczyles limit debetu");
            iSaldo += wypłata;
            return iSaldo;
        }
    }
        KontoBankowe(int saldo,String imie, String nazwisko) {
        if (saldo == 50) {
            this.iSaldo += saldo;
        }
          this.sImie = imie;
            this.sNazwisko = nazwisko;
            this.iDebet = 1000;
    }
}
