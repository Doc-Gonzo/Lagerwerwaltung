package at.kamadesign.Lagerverwaltung.model;

public class Product {
    private String  product_name;
    private int     product_id;
    private double  product_price;
    private String  product_description;
    private Lieferant lieferant;

    public Product(String product_name, int product_id, double product_price, String product_description, Lieferant lieferant) {
        this.product_name = product_name;
        this.product_id = product_id;
        this.product_price = product_price;
        this.product_description = product_description;
        this.lieferant = lieferant;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Lieferant getLieferant() {
        return lieferant;
    }

    public void setLieferant(Lieferant lieferant) {
        this.lieferant = lieferant;
    }
}
