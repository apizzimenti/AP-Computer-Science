public class Driver
{
    public static void main(String args[])
    {
        Store inventory = new Store();
        
        StockItem a = new StockItem("Special K", 1001, 2.35, 12);
        inventory.add(a);
        
        StockItem b = new StockItem("Kleenex", 1002, 1.76, 8);
        inventory.add(b);
        
        StockItem c = new StockItem("Coke", 1003, 1.49, 15);
        inventory.add(c);
        
        StockItem d = new StockItem("Peanuts", 1004, 2.29, 6);
        inventory.add(d);
        
        StockItem e = new StockItem("Soap", 1005, 0.89, 25);
        inventory.add(e);
        
        inventory.list();
        e.setPrice(0.92);
        b.remove(6);
        c.add(24);
        inventory.removeAll(d.getID());
        inventory.replace(b, new StockItem("Total", 1006, 2.24, 48));
        inventory.list();
    }
}