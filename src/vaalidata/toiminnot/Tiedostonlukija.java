package vaalidata.toiminnot;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import vaalidata.kasitteet.Ehdokas;
import vaalidata.kasitteet.Aidinkieli;
import vaalidata.kasitteet.Koulutus;
import vaalidata.kasitteet.PPuolue;
import vaalidata.kasitteet.Puolue;
import vaalidata.kasitteet.Sukupuoli;
import vaalidata.kasitteet.Vaalipiiri;

public class Tiedostonlukija {
    private ArrayList<Ehdokas> ehdokkaat;
    private ArrayList<PPuolue> puolueet;
    
    public Tiedostonlukija() {
        this.ehdokkaat = new ArrayList<>();
        this.puolueet = new ArrayList<>();
    }

    public ArrayList<Ehdokas> lueTiedosto() {
        try (Scanner tiedostonLukija = new Scanner(new File("ehdokkaat.csv"))) {
            int id = 0;
            while (tiedostonLukija.hasNextLine()) {
                Ehdokas ehdokas = new Ehdokas();

                String rivi = tiedostonLukija.nextLine();
                String[] palat = rivi.split(",");
                String vaalipiiri = palat[0];
                String puolue = palat[1];
                String ika = palat[2];
                String sukupuoli = palat[3];
                String aidinkieli = palat[4];
                String koulutus = palat[5];

                ehdokas.setId(id);
                ehdokas.setVaalipiiri(tarkistaVaalipiiri(vaalipiiri));
                ehdokas.setPuolue(tarkistaPuolue(puolue));
                ehdokas.setIka(tarkistaIka(ika));
                ehdokas.setSukupuoli(tarkistaSukupuoli(sukupuoli));
                ehdokas.setAidinkieli(tarkistaAidinkieli(aidinkieli));
                ehdokas.setKoulutus(tarkistaKoulutus(koulutus));
                
                this.ehdokkaat.add(ehdokas);
                id++;
            }
        } catch (Exception poikkeus) {
            System.out.println("Tiedoston lukeminen epäonnistui.");
        }

        return this.ehdokkaat;
    }
    
    public static Vaalipiiri tarkistaVaalipiiri(String vaalipiiri) {
        switch (vaalipiiri) {
            case "Ahvenanmaan maakunnan vaalipiiri":
                return Vaalipiiri.AHVENANMAA;

            case "Hämeen vaalipiiri":
                return Vaalipiiri.HAME;

            case "Helsingin vaalipiiri":
                return Vaalipiiri.HELSINKI;
                
            case "Kaakkois-Suomen vaalipiiri":
                return Vaalipiiri.KAAKKOISSUOMI;

            case "Keski-Suomen vaalipiiri":
                return Vaalipiiri.KESKISUOMI;

            case "Lapin vaalipiiri":
                return Vaalipiiri.LAPPI;

            case "Oulun vaalipiiri":
                return Vaalipiiri.OULU;

            case "Pirkanmaan vaalipiiri":
                return Vaalipiiri.PIRKANMAA;
      
            case "Satakunnan vaalipiiri":
                return Vaalipiiri.SATAKUNTA;

            case "Savo-Karjalan vaalipiiri":
                return Vaalipiiri.SAVOKARJALA;

            case "Uudenmaan vaalipiiri":
                return Vaalipiiri.UUSIMAA;

            case "Vaasan vaalipiiri":
                return Vaalipiiri.VAASA;
        
            case "Varsinais-Suomen vaalipiiri":
                return Vaalipiiri.VARSINAISSUOMI;

            default:
                return null;
        }
    }
    
    public static Puolue tarkistaPuolue(String puolue) {
        switch (puolue) {
            case "Eläinoikeuspuolue":
                return Puolue.ELAINOIKEUSPUOLUE;

            case "Feministinen puolue":
                return Puolue.FEMINISTINENPUOLUE;

            case "Itsenäisyyspuolue":
                return Puolue.ITSENAISYYSPUOLUE;

            case "Kansalaispuolue":
                return Puolue.KANSALAISPUOLUE;

            case "Keskusta":
                return Puolue.KESKUSTA;

            case "Kokoomus":
                return Puolue.KOKOOMUS;

            case "Kommunistinen Työväenpuolue":
                return Puolue.KOMMUNISTINENTYOVAENPUOLUE;

            case "Kristillisdemokraatit":
                return Puolue.KRISTILLISDEMOKRAATIT;

            case "Liberaalipuolue":
                return Puolue.LIBERAALIPUOLUE;

            case "Liike Nyt":
                return Puolue.LIIKENYT;

            case "Perussuomalaiset":
                return Puolue.PERUSSUOMALAISET;

            case "Piraattipuolue":
                return Puolue.PIRAATTIPUOLUE;

            case "RKP":
                return Puolue.RKP;

            case "SDP":
                return Puolue.SDP;

            case "Seitsemän tähden liike":
                return Puolue.SEITSEMANTAHDENLIIKE;

            case "Sininen tulevaisuus":
                return Puolue.SININENTULEVAISUUS;

            case "Sitoutumaton":
                return Puolue.SITOUTUMATON;

            case "Suomen Kansa Ensin":
                return Puolue.SUOMENKANSAENSIN;
        
            case "Suomen Kommunistinen Puolue":
                return Puolue.SUOMENKOMMUNISTINENPUOLUE;

            case "Vasemmistoliitto":
                return Puolue.VASEMMISTOLIITTO;

            case "Vihreät":
                return Puolue.VIHREAT;
        
            default:        
                return null;
        }
    }
    
    public static int tarkistaIka(String ika) {
        try {
            return Integer.parseInt(ika);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static Sukupuoli tarkistaSukupuoli(String sukupuoli) {
        switch (sukupuoli) {
            case "Mies":
                return Sukupuoli.MIES;
                
            case "Nainen":
                return Sukupuoli.NAINEN;
                
            default:
                return Sukupuoli.MUU;
        }
    }

    public static Aidinkieli tarkistaAidinkieli(String aidinkieli) {
        switch (aidinkieli) {
            case "Suomi":
                return Aidinkieli.SUOMI;

            case "Ruotsi":
                return Aidinkieli.RUOTSI;
                
            default:
                return Aidinkieli.MUU;
        }
    }

    public static Koulutus tarkistaKoulutus(String koulutus) {
        if (koulutus.equals("peruskoulu")) {
            return Koulutus.PERUSKOULU;
        }

        if (koulutus.equals("ammattitutkinto")) {
            return Koulutus.AMMATTITUTKINTO;
        }

        if (koulutus.equals("ylioppilas")) {
            return Koulutus.YLIOPPILAS;
        }

        if (koulutus.equals("korkeakoulututkinto")) {
            return Koulutus.KORKEAKOULUTUTKINTO;
        }
        return Koulutus.MUU;
    }
}
