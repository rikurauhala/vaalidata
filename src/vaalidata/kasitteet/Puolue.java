package vaalidata.kasitteet;

public enum Puolue {
    ELAINOIKEUSPUOLUE ("Eläinoikeuspuolue"),
    FEMINISTINENPUOLUE ("Feministinen puolue"),
    ITSENAISYYSPUOLUE ("Itsenäisyyspuolue"),
    KANSALAISPUOLUE ("Kansalaispuolue"),
    KESKUSTA ("Keskusta"),
    KOKOOMUS ("Kokoomus"),
    KOMMUNISTINENTYOVAENPUOLUE ("Kommunistinen työväenpuolue"),
    KRISTILLISDEMOKRAATIT ("Kristillisdemokraatit"),
    LIBERAALIPUOLUE ("Liberaalipuoluea"),
    LIIKENYT ("Liike Nyt"),
    PERUSSUOMALAISET ("Perussuomalaiset"),
    PIRAATTIPUOLUE ("Piraattipuolue"),
    RKP ("RKP"),
    SDP ("SDP"),
    SEITSEMANTAHDENLIIKE ("Seitsemän tähden liike"),
    SININENTULEVAISUUS ("Sininen tulevaisuus"),
    SITOUTUMATON ("Sitoutumaton"),
    SUOMENKANSAENSIN ("Suomen Kansa Ensin"),
    SUOMENKOMMUNISTINENPUOLUE ("Suomen Kommunistinen Puolue"),
    VASEMMISTOLIITTO ("Vasemmistoliitto"),
    VIHREAT ("Vihreät");
    
    private final String puolue;
    
    private Puolue(String puolue) {
        this.puolue = puolue;
    }
    
    public String getPuolue() {
        return this.puolue;
    }
}
