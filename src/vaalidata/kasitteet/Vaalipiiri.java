package vaalidata.kasitteet;

public enum Vaalipiiri {
    AHVENANMAA ("Ahvenanmaan vaalipiiri"),
    HAME ("Hämeen vaalipiiri"),
    HELSINKI ("Helsingin vaalipiiri"),
    KAAKKOISSUOMI ("Kaakkois-Suomen vaalipiiri"),
    KESKISUOMI ("Keski-Suomen vaalipiiri"),
    LAPPI ("Lapin vaalipiiri"),
    OULU ("Oulun vaalipiiri"),
    PIRKANMAA ("Pirkanmaan vaalipiiri"),
    SATAKUNTA ("Satakunnan vaalipiiri"),
    SAVOKARJALA ("Savo-Karjalan vaalipiiri"),
    UUSIMAA ("Uudenmaan vaalipiiri"),
    VAASA ("Vaasan vaalipiiri"),
    VARSINAISSUOMI ("Varsinais-Suomen vaalipiiri");
    
    private final String vaalipiiri;
    
    private Vaalipiiri(String vaalipiiri) {
        this.vaalipiiri = vaalipiiri;
    }
    
    public String getVaalipiiri() {
        return this.vaalipiiri;
    }
}
