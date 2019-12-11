package at.kamadesign.Lagerverwaltung.model;

public class Regalfach {
    private int fach_regal_reihe;
    private int fach_regal_spalte;
    private Product fach_product;
    private int fach_product_menge;

    public Regalfach(int fach_regal_reihe, int fach_regal_spalte) {
        this.fach_regal_reihe = fach_regal_reihe;
        this.fach_regal_spalte = fach_regal_spalte;
    }

    public int getFach_regal_reihe() {
        return fach_regal_reihe;
    }

    public void setFach_regal_reihe(int fach_regal_reihe) {
        this.fach_regal_reihe = fach_regal_reihe;
    }

    public int getFach_regal_spalte() {
        return fach_regal_spalte;
    }

    public void setFach_regal_spalte(int fach_regal_spalte) {
        this.fach_regal_spalte = fach_regal_spalte;
    }

    public Product getFach_product() {
        return fach_product;
    }

    public void setFach_product(Product fach_product) {
        this.fach_product = fach_product;
    }

    public int getFach_product_menge() {
        return fach_product_menge;
    }

    public void setFach_product_menge(int fach_product_menge) {
        this.fach_product_menge = fach_product_menge;
    }
}
