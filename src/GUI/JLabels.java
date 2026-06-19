package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabels {
    JFrame frame;
    JLabel label;
    ImageIcon image;
    ImageIcon originalIcon;
    Border border;

    public JLabels(){
        frame=new JFrame();
        label=new JLabel();
        originalIcon=new ImageIcon("bearPic.png");
        Image img=originalIcon.getImage();
        Image scaledImage=img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        image=new ImageIcon(scaledImage);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);



        border=BorderFactory.createLineBorder(Color.red);


        label.setText("Trying to code....");
        label.setIcon(image);

        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0X000FF0));
        label.setFont(new Font("KING BASIL",Font.BOLD,23));
        label.setIconTextGap(20);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,500,500);


    }
    public static void main(String args[]){
        new JLabels();
    }
}
