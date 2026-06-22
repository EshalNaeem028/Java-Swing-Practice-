package GUI;
import javax.swing.*;
import java.awt.*;

class JTableDemo extends JFrame{
    JTable table;

    JTableDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTable");
        String [] columns ={
                "Name",
                "Age",
                "Registration Number"
        };
        String [][] rows={
                {"Ali", "20","123"},
                { "Sara", "19","444"},
                { "Ahmed", "21","565"}
        };
        table=new JTable(rows,columns);
        table.setRowHeight(50);

        JScrollPane scrollPane=new JScrollPane(table);
        this.setSize(500,500);
        this.add(scrollPane);
        this.setVisible(true);
        }



    }

public class JTables {
    public static void main(String args[]){
        new JTableDemo();

    }
}
