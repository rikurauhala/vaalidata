package vaalidata.toiminnot;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;
import vaalidata.kasitteet.Ehdokas;
import vaalidata.kasitteet.Puolue;
import vaalidata.kasitteet.Vaalipiiri;

public class Komennot {
    private final ArrayList<Ehdokas> ehdokkaat;

    public Komennot() {
        this.ehdokkaat = new Tiedostonlukija().lueTiedosto();
    }
    
    public void ehdokkaatPuolueittain() {
        String[] puolueet = new String[]{"Eläinoikeuspuolue", "Feministinen puolue", "Itsenäisyyspuolue", "Kansalaispuolue",
                                     "Keskusta", "Kokoomus", "Kommunistinen työväenpuolue", "Kristillisdemokraatit", 
                                     "Liberaalipuolue", "Liike Nyt", "Perussuomalaiset", "Piraattipuolue", "RKP", "SDP",
                                     "Seitsemän tähden liike", "Sininen tulevaisuus", "Sitoutumaton", "Suomen Kansa Ensin", 
                                     "Suomen Kommunistinen Puolue", "Vasemmistoliitto", "Vihreät"};
        int[] ehdokkaita = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int yhteensa = 0;
        
        for (Ehdokas ehdokas : ehdokkaat) {
            switch (ehdokas.getPuolue()) {
                case ELAINOIKEUSPUOLUE:
                    ehdokkaita[0]++;
                    yhteensa++;
                    break;
                    
                case FEMINISTINENPUOLUE:
                    ehdokkaita[1]++;
                    yhteensa++;
                    break;
                    
                case ITSENAISYYSPUOLUE:
                    ehdokkaita[2]++;
                    yhteensa++;
                    break;
                    
                case KANSALAISPUOLUE:
                    ehdokkaita[3]++;
                    yhteensa++;
                    break;
                    
                case KESKUSTA:
                    ehdokkaita[4]++;
                    yhteensa++;
                    break;
                    
                case KOKOOMUS:
                    ehdokkaita[5]++;
                    yhteensa++;
                    break;
                    
                case KOMMUNISTINENTYOVAENPUOLUE:
                    ehdokkaita[6]++;
                    yhteensa++;
                    break;
                    
                case KRISTILLISDEMOKRAATIT:
                    ehdokkaita[7]++;
                    yhteensa++;
                    break;
                    
                case LIBERAALIPUOLUE:
                    ehdokkaita[8]++;
                    yhteensa++;
                    break;
                    
                case LIIKENYT:
                    ehdokkaita[9]++;
                    yhteensa++;
                    break;
                    
                case PERUSSUOMALAISET:
                    ehdokkaita[10]++;
                    yhteensa++;
                    break;
                    
                case PIRAATTIPUOLUE:
                    ehdokkaita[11]++;
                    yhteensa++;
                    break;
                    
                case RKP:
                    ehdokkaita[12]++;
                    yhteensa++;
                    break;
                    
                case SDP:
                    ehdokkaita[13]++;
                    yhteensa++;
                    break;
                    
                case SEITSEMANTAHDENLIIKE:
                    ehdokkaita[14]++;
                    yhteensa++;
                    break;
                    
                case SININENTULEVAISUUS:
                    ehdokkaita[15]++;
                    yhteensa++;
                    break;
                    
                case SITOUTUMATON:
                    ehdokkaita[16]++;
                    yhteensa++;
                    break;
                    
                case SUOMENKANSAENSIN:
                    ehdokkaita[17]++;
                    yhteensa++;
                    break;
                    
                case SUOMENKOMMUNISTINENPUOLUE:
                    ehdokkaita[18]++;
                    yhteensa++;
                    break;
                
                case VASEMMISTOLIITTO:
                    ehdokkaita[19]++;
                    yhteensa++;
                    break;
                    
                case VIHREAT:
                    ehdokkaita[20]++;
                    yhteensa++;
                    break;
            }
        }
        
        Map<String, Integer> tulokset = new HashMap<>();
        for (int i = 0; i < 21; i++) {
            tulokset.put(puolueet[i], ehdokkaita[i]);
        }
        
        Map<String, Integer> jarjestelty = tulokset
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                    toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));
        
        System.out.println("\nPUOLUE                             " + "EHDOKKAITA          " + "OSUUS");

        for (String puolue : jarjestelty.keySet()) {
            StringBuilder rakentaja = new StringBuilder();
            rakentaja.append(puolue);
            rakentaja.append(tulostaTyhjaaIso(puolue.length()));
            rakentaja.append(jarjestelty.get(puolue));
            rakentaja.append(tulostaTyhjaaPieni(String.valueOf(jarjestelty.get(puolue)).length()));
            Double osuus = 1.0 * jarjestelty.get(puolue) / yhteensa * 100;
            rakentaja.append(pyorista(osuus, 2));
            rakentaja.append("%");
            System.out.println(rakentaja);
        }
        
        StringBuilder rakentaja = new StringBuilder();
        rakentaja.append(tulostaTyhjaaIso(0));
        rakentaja.append(yhteensa);
        rakentaja.append(tulostaTyhjaaPieni(String.valueOf(yhteensa).length()));
        rakentaja.append("100%");
        rakentaja.append("\n");
        System.out.println(rakentaja);
       
    }
    
    public void ehdokkaatVaalipiireittain() {
        String[] vaalipiirit = new String[]{"Ahvenanmaan vaalipiiri", "Hämeen vaalipiiri", "Helsingin vaalipiiri", 
                                            "Kaakkois-Suomen vaalipiiri", "Keski-Suomen vaalipiiri", "Lapin vaalipiiri",
                                            "Oulun vaalipiiri", "Pirkanmaan vaalipiiri", "Satakunnan vaalipiiri",
                                            "Savo-Karjalan vaalipiiri", "Uudenmaan vaalipiiri", "Vaasan vaalipiiri",
                                            "Varsinais-Suomen vaalipiiri"};
        int[] ehdokkaita = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int yhteensa = 0;
        
        for (Ehdokas ehdokas : ehdokkaat) {
            switch (ehdokas.getVaalipiiri()) {
                case AHVENANMAA:
                    ehdokkaita[0]++;
                    yhteensa++;
                    break;
                    
                case HAME:
                    ehdokkaita[1]++;
                    yhteensa++;
                    break;
                    
                case HELSINKI:
                    ehdokkaita[2]++;
                    yhteensa++;
                    break;
                    
                case KAAKKOISSUOMI:
                    ehdokkaita[3]++;
                    yhteensa++;
                    break;
                    
                case KESKISUOMI:
                    ehdokkaita[4]++;
                    yhteensa++;
                    break;
                    
                case LAPPI:
                    ehdokkaita[5]++;
                    yhteensa++;
                    break;
                    
                case OULU:
                    ehdokkaita[6]++;
                    yhteensa++;
                    break;
                    
                case PIRKANMAA:
                    ehdokkaita[7]++;
                    yhteensa++;
                    break;
                    
                case SATAKUNTA:
                    ehdokkaita[8]++;
                    yhteensa++;
                    break;
                    
                case SAVOKARJALA:
                    ehdokkaita[9]++;
                    yhteensa++;
                    break;
                    
                case UUSIMAA:
                    ehdokkaita[10]++;
                    yhteensa++;
                    break;
                    
                case VAASA:
                    ehdokkaita[11]++;
                    yhteensa++;
                    break;
                    
                case VARSINAISSUOMI:
                    ehdokkaita[12]++;
                    yhteensa++;
                    break;
            }
        }
        
        Map<String, Integer> tulokset = new HashMap<>();
        for (int i = 0; i < 13; i++) {
            tulokset.put(vaalipiirit[i], ehdokkaita[i]);
        }
        
        Map<String, Integer> jarjestelty = tulokset
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                    toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                        LinkedHashMap::new));
        
        System.out.println("\nVAALIPIIRI                         " + "EHDOKKAITA          " + "OSUUS");

        for (String vaalipiiri : jarjestelty.keySet()) {
            StringBuilder rakentaja = new StringBuilder();
            rakentaja.append(vaalipiiri);
            rakentaja.append(tulostaTyhjaaIso(vaalipiiri.length()));
            rakentaja.append(jarjestelty.get(vaalipiiri));
            rakentaja.append(tulostaTyhjaaPieni(String.valueOf(jarjestelty.get(vaalipiiri)).length()));
            Double osuus = 1.0 * jarjestelty.get(vaalipiiri) / yhteensa * 100;
            rakentaja.append(pyorista(osuus, 2));
            rakentaja.append("%");
            System.out.println(rakentaja);
        }
        
        StringBuilder rakentaja = new StringBuilder();
        rakentaja.append(tulostaTyhjaaIso(0));
        rakentaja.append(yhteensa);
        rakentaja.append(tulostaTyhjaaPieni(String.valueOf(yhteensa).length()));
        rakentaja.append("100%");
        rakentaja.append("\n");
        System.out.println(rakentaja);
       
    }
        
    public static String tulostaTyhjaaIso(int pituus) {
        String tyhjat = "";
        int indeksi = pituus;
        
        while (indeksi < 35) {
            tyhjat = tyhjat + " ";
            indeksi++;
        }
        
        return tyhjat;
    }
    
    public static String tulostaTyhjaaPieni(int pituus) {
        String tyhjat = "";
        int indeksi = pituus;
        
        while (indeksi < 20) {
            tyhjat = tyhjat + " ";
            indeksi++;
        }
        
        return tyhjat;
    }
    
    public static double pyorista(double arvo, int desimaalit) {
        if (desimaalit < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(arvo);
        bd = bd.setScale(desimaalit, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public void listaaPuolueet() {
        System.out.println("\nPuolueet eduskuntavaaleissa 2019:");
        for (Puolue puolue : Puolue.values()) { 
            System.out.println("- " + puolue.getPuolue()); 
        }
        System.out.println("");
    }

    public void listaaVaalipiirit() {
        System.out.println("\nVaalipiirit Suomen eduskuntavaaleissa 2019:");
        for (Vaalipiiri vaalipiiri : Vaalipiiri.values()) { 
            System.out.println("- " + vaalipiiri.getVaalipiiri()); 
        }
        System.out.println("");
    }
    
}
