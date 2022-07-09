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
                "- 'puolueet': Listaa vaaleihin osallistuvat puolueet\n" +
                "- 'vaalipiirit': Listaa Suomen vaalipiirit \n" +
                "- 'ehdokkaat puolueittäin': Laskee ja tulostaa ehdokkaat puolueittain\n" +
                "- 'ehdokkaat vaalipiireittain': Laskee ja tulostaa ehdokkaat vaalipiireittäin\n" +
                "- 'lopeta': Lopettaa ohjelman suorituksen\n\n" +
                "------------------------------------------------------------------------\n"
                );

        ohjelma: while (true) {
            System.out.print("Syötä komento: ");
            String komentosyote = syote.nextLine();

            switch (komentosyote) {
                case "lopeta":
                    break ohjelma;
                    
                case "puolueet":
                    komennot.listaaPuolueet();
                    break;
                    
                case "vaalipiirit":
                    komennot.listaaVaalipiirit();
                    break;
                
                case "ehdokkaat puolueittain":
                    komennot.ehdokkaatPuolueittain();
                    break;

                case "ehdokkaat vaalipiireittain":
                    komennot.ehdokkaatVaalipiireittain();
                    break;
                  
                default:
                    System.out.println("\nVirheellinen komento. Yritä uudestaan.\n");
            }
        }
    }
}
