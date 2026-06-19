package GUI;

import javax.swing.*;

import java.awt.*;

public class JPanels {
    JFrame frame;
    JLabel label;



    public JPanels() {
        frame = new JFrame();
        label = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

        label.setText("HELUUSS");

        label.setBounds(100, 100, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 200, 200);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200, 0, 200, 200);
        bluePanel.setLayout(null);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(400, 0, 200, 200);
        greenPanel.setLayout(null);

        redPanel.add(label);
        frame.add(redPanel);
        frame.add(greenPanel);
        frame.add(bluePanel);

    }
    public static void main(String [] args){
        new JPanels();
    }



    }
