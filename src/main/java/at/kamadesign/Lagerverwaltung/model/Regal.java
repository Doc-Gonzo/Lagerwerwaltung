package at.kamadesign.Lagerverwaltung.model;

import java.util.ArrayList;

public class Regal {
    private int regal_id;
    private int regal_reihen;
    private int regal_spalten;
    private ArrayList<Regalfach> regal_faecher;

    public Regal(int regal_id, int regal_reihen, int regal_spalten) {
        this.regal_id = regal_id;
        this.regal_reihen = regal_reihen;
        this.regal_spalten = regal_spalten;
        regal_faecher = new ArrayList<Regalfach>();

        int faecher_anzahl = regal_reihen * regal_spalten;
        int reihe_aktuell = 1;
        int spalte_aktuell = 0;

        for (int i = 0; i < regal_reihen; i++) {
            while (spalte_aktuell < regal_spalten ) {
                spalte_aktuell++;
                regal_faecher.add(new Regalfach(reihe_aktuell, spalte_aktuell));
            }
            reihe_aktuell ++;
            spalte_aktuell = 0;
        }
    }
    public int getRegal_id() {
        return regal_id;
    }

    public void setRegal_id(int regal_id) {
        this.regal_id = regal_id;
    }

    public int getRegal_reihen() {
        return regal_reihen;
    }

    public void setRegal_reihen(int regal_reihen) {
        this.regal_reihen = regal_reihen;
    }

    public int getRegal_spalten() {
        return regal_spalten;
    }

    public void setRegal_spalten(int regal_spalten) {
        this.regal_spalten = regal_spalten;
    }

    public ArrayList<Regalfach> getRegal_faecher() {
        return regal_faecher;
    }

    public void setRegal_faecher(ArrayList<Regalfach> regal_faecher) {
        this.regal_faecher = regal_faecher;
    }
}
