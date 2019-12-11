package at.kamadesign.Lagerverwaltung.model;

import java.util.ArrayList;

public class Lieferung {
    private int liefer_nummer;
    private ArrayList<Product> produktliste;

    public Lieferung(int liefer_nummer, ArrayList<Product> produktliste) {
        this.liefer_nummer = liefer_nummer;
        this.produktliste = produktliste;
    }

    public int getLiefer_nummer() {
        return liefer_nummer;
    }

    public void setLiefer_nummer(int liefer_nummer) {
        this.liefer_nummer = liefer_nummer;
    }

    public ArrayList<Product> getProduktliste() {
        return produktliste;
    }

    public void setProduktliste(ArrayList<Product> produktliste) {
        this.produktliste = produktliste;
    }


}
