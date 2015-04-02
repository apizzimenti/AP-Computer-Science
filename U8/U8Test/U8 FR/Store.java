import java.util.ArrayList;

public class Store {
    private ArrayList<StockItem> myStockList = new ArrayList<StockItem>();
    
    public Store() {
    }
    
    public void add(StockItem s) {
        myStockList.add(s);
    }
    
    public double removeAll(int idnum) {
        int count = 0;
        double price = 0;
        
        for (int i = 0; i < myStockList.size(); i++) {
            StockItem move = myStockList.get(i);
            
            if (move.getID() == idnum) {
                price = move.getPrice();
                move.remove(move.getNum());
                break;
            } else {
                continue;
            }
        }
        return count*price;
    }
    
    public void replace(StockItem x, StockItem y) {
        
        for (int i = 0; i < myStockList.size(); i++) {
            StockItem newer = myStockList.get(i);
            if (newer.getID() == x.getID()) {
                myStockList.set(i-1, y);
            }
        }
    }
    
    public void list() {
        System.out.println("ID\tName\t\tPrice\tQuantity");
        System.out.println("--\t----\t\t-----\t--------");
        
        for (int i = 0; i < myStockList.size(); i++) {
            StockItem printer = myStockList.get(i);
            System.out.println(printer.toString());
        }
        System.out.print("\n");
    }
}