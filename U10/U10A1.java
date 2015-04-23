// Anthony Pizzimenti
//
/* driver class for the worker class and its subclasses */

import javax.swing.*;
import java.awt.*;

public class U10A1 extends JFrame {
    
    private JTextArea area = new JTextArea();
    private Container contain = getContentPane();
    private Font except = new Font("Monospaced", Font.BOLD, 12);
    
    public static void main(String[]args) {
        U10A1 x = new U10A1();
        x.setSize(300, 500);
        x.setVisible(true);
        x.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public U10A1() {
        contain.add(area);
        testHourly();
        testSalaried();
        testPiece();
    }
    

    public void testHourly() {
        hourlyWorker hour = new hourlyWorker("John Doe", 9.48, 43);
        String pay = String.format("%.2f", hour.wage());
        
        area.append("Test Hourly Worker Class\n");
        area.append("------------------------\n");
        area.append("Wage for " + hour.getName() + " = " + pay);
    }
    
    public void testSalaried() {
        salariedWorker salary = new salariedWorker("Karen Jones", 25.76, 52);
        String pay = String.format("%.2f", salary.wage());
        
        area.append("\n\nTest Salaried Worker Class\n");
        area.append("--------------------------\n");
        area.append("Wage for " + salary.getName() + " = " + pay);
    }
    
    public void testPiece() {
        pieceWorker piece = new pieceWorker("Wesley Smith", 5.65, 36);
        String pay = String.format("%.2f", piece.wage(1025));
        
        area.append("\n\nTest Piece Worker Class\n");
        area.append("-----------------------\n");
        area.append("Wage for " + piece.getName() + " = " + pay);
    }
}