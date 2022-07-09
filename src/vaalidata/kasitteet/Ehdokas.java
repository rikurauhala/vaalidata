package vaalidata.kasitteet;

public class Ehdokas {
    private int id;
    private Vaalipiiri vaalipiiri;
    private Puolue puolue;
    private int ika;
    private Sukupuoli sukupuoli;
    private Aidinkieli aidinkieli;
    private Koulutus koulutus;
   
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setVaalipiiri(Vaalipiiri vaalipiiri) {
        this.vaalipiiri = vaalipiiri;
    }
    
    public Vaalipiiri getVaalipiiri() {
        return this.vaalipiiri;
    }
    
    public String tulostaVaalipiiri() {
        return this.vaalipiiri.getVaalipiiri();
    }
    
    public void setPuolue(Puolue puolue) {
        this.puolue = puolue;
    }
    
    public Puolue getPuolue() {
        return this.puolue;
    }
    
    public String tulostaPuolue() {
        return this.puolue.getPuolue();
    }
    
    public void setIka(int ika) {
        this.ika = ika;
    }
    
    public int getIka() {
        return this.ika;
    }
    
    public void setSukupuoli(Sukupuoli sukupuoli) {
        this.sukupuoli = sukupuoli;
    }
    
    public Sukupuoli getSukupuoli() {
        return this.sukupuoli;
    }
    
    public String tulostaSukupuoli() {
        return this.sukupuoli.getSukupuoli();
    }
    
    public void setAidinkieli(Aidinkieli aidinkieli) {
        this.aidinkieli = aidinkieli;
    }
    
    public Aidinkieli getAidinkieli() {
        return this.aidinkieli;
    }
    
    public String tulostaAidinkieli() {
        return this.aidinkieli.getAidinkieli();        
    }
    
    public void setKoulutus(Koulutus koulutus) {
        this.koulutus = koulutus;
    }
    
    public Koulutus getKoulutus() {
        return this.koulutus;
    }
    
    public String tulostaKoulutus() {
        return this.koulutus.getKoulutus();
    }
    
    @Override
    public String toString() {
        return "Ehdokas: " + this.id +
               "\nVaalipiiri: " + tulostaVaalipiiri() + 
               "\nPuolue: " + tulostaPuolue() +
               "\nIkä: " + this.ika +
               "\nSukupuoli: " + tulostaSukupuoli() +
               "\nÄidinkieli: " + tulostaAidinkieli() + 
               "\nKoulutus: " + tulostaKoulutus();
    }
    
}
