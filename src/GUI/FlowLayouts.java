package GUI;


import javax.swing.*;
import java.awt.*;

public class FlowLayouts {
    JFrame frame;
    JPanel panel;

    public FlowLayouts(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        frame.setTitle("FrameLayout");

        panel=new JPanel();
        panel.setPreferredSize(new Dimension(300,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);


    }
    public static void main(String[] args){
        new FlowLayouts();
    }
}
