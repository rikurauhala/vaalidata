package vaalidata;

import vaalidata.toiminnot.Komennot;
import java.util.Scanner;

public class Vaalidata {
    public static void main(String[] args) {
        Scanner syote = new Scanner(System.in);
        Komennot komennot = new Komennot();

        System.out.println(
            "------------------------------------------------------------------------\n" +
            "Tervetuloa käyttämään VAALIDATA2019-ohjelmaa.\n\n" +
            "Komennot:\n" +
            "- 0: Lopettaa ohjelman suorituksen\n" +
            "- 1: Listaa vaaleihin osallistuvat puolueet\n" +
            "- 2: Listaa Suomen vaalipiirit \n" +
            "- 3: Laskee ja tulostaa ehdokkaat puolueittain\n" +
            "- 4: Laskee ja tulostaa ehdokkaat vaalipiireittäin\n" +
            "------------------------------------------------------------------------\n"
        );

        ohjelma: while (true) {
            System.out.print("Syötä komento: ");
            String komentosyote = syote.nextLine();

            switch (komentosyote) {
                case "0":
                    syote.close();
                    break ohjelma;

                case "1":
                    komennot.listaaPuolueet();
                    break;

                case "2":
                    komennot.listaaVaalipiirit();
                    break;

                case "3":
                    komennot.ehdokkaatPuolueittain();
                    break;

                case "4":
                    komennot.ehdokkaatVaalipiireittain();
                    break;
                  
                default:
                    System.out.println("\nVirheellinen komento. Yritä uudestaan.\n");
            }
        }
    }
}
