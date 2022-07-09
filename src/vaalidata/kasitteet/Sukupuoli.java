package vaalidata.kasitteet;

public enum Sukupuoli {
    MIES ("Mies"),
    NAINEN ("Nainen"),
    MUU ("Muu");
    
    private final String sukupuoli;
    
    private Sukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }
    
    public String getSukupuoli() {
        return this.sukupuoli;
    }
}
