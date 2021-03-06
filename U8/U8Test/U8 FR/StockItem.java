public class StockItem {
    
    private String name;
    private int idnum;
    private double price;
    private int numOnShelf;
    
    public StockItem(String n, int id, double p, int num) {
        name = n;
        idnum = id;
        price = p;
        numOnShelf = num;
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return idnum;
    }
    public double getPrice() {
        return price;
    }
    
    public int getNum() {
        return numOnShelf;
    }
    
    public void setPrice(double p) {
        price = p;
    }
    public void remove(int n) {
        if (n > numOnShelf) {
            numOnShelf = 0;
        } else {
            numOnShelf -= n;
        }
    }
    
    public void add(int n) {
        numOnShelf += n;
    }
    
    public String toString() {
        if (name.length() >= 8)
            return(idnum + "\t" + name + "\t\t$" + price + "\t" + numOnShelf);
        else
            return(idnum + "\t" + name + "\t\t$" + price + "\t" + numOnShelf);
    }
}
