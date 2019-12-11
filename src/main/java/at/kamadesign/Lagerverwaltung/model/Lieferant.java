package at.kamadesign.Lagerverwaltung.model;

public class Lieferant {
    private int lieferant_id;
    private  String lieferant_name;
    private int lieferant_tel;

    public Lieferant(int lieferant_id, String lieferant_name, int lieferant_tel) {
        this.lieferant_id = lieferant_id;
        this.lieferant_name = lieferant_name;
        this.lieferant_tel = lieferant_tel;
    }

    public int getLieferant_id() {
        return lieferant_id;
    }

    public void setLieferant_id(int lieferant_id) {
        this.lieferant_id = lieferant_id;
    }

    public String getLieferant_name() {
        return lieferant_name;
    }

    public void setLieferant_name(String lieferant_name) {
        this.lieferant_name = lieferant_name;
    }

    public int getLieferant_tel() {
        return lieferant_tel;
    }

    public void setLieferant_tel(int lieferant_tel) {
        this.lieferant_tel = lieferant_tel;
    }
}
