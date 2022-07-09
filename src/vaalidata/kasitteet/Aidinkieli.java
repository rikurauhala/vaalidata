package vaalidata.kasitteet;

public enum Aidinkieli {
    SUOMI ("Suomi"),
    RUOTSI ("Ruotsi"),
    MUU ("Muu");
    
    private String aidinkieli;
    
    private Aidinkieli(String aidinkieli) {
        this.aidinkieli = aidinkieli;
    }
    
    public String getAidinkieli() {
        return this.aidinkieli;
    }
}
