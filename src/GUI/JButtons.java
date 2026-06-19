package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtons implements ActionListener {

    JFrame frame;
    JLabel label;
    JButton buttons;


    public JButtons() {
        frame = new JFrame();
        label = new JLabel();
        buttons = new JButton();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);


        buttons.setBounds(200, 100, 200, 60);
        buttons.addActionListener(this);
        buttons.setText("I am a button");



        buttons.setFocusable(false);

        buttons.setHorizontalTextPosition(JButton.CENTER);
        buttons.setFont(new Font("Comic Sans", Font.BOLD, 25));
        buttons.setForeground(Color.cyan);
        buttons.setBackground(Color.lightGray);
        buttons.setBorder(BorderFactory.createEtchedBorder());

        frame.add(buttons);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttons){
            System.out.print("POO");

        }



        }
    public static void main(String []args){
        new JButtons();

    }





}
