package vaalidata.kasitteet;

public enum Koulutus {
    PERUSKOULU ("Peruskoulu"),
    AMMATTITUTKINTO ("Ammattitutkinto"),
    YLIOPPILAS ("Ylioppilas"),
    KORKEAKOULUTUTKINTO ("Korkeakoulututkinto"),
    MUU ("Muu");
    
    private String koulutus;
    
    private Koulutus(String koulutus) {
        this.koulutus = koulutus;
    }
    
    public String getKoulutus() {
        return this.koulutus;
    }
}
