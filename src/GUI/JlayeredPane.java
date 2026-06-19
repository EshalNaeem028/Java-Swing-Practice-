package GUI;
import javax.swing.*;
import java.awt.*;

public class JlayeredPane {
    public static void main (String args[]){
        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);

        JLabel label2 =new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLACK);
        label2.setBounds(100,100,200,200);


        JLabel label3 =new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150,150,200,200);



        JLayeredPane jlayeredPane=new JLayeredPane();
        jlayeredPane.setBounds(0,0,500,500);

        jlayeredPane.add(label1,Integer.valueOf(0));
        jlayeredPane.add(label2,Integer.valueOf(1));
        jlayeredPane.add(label3,Integer.valueOf(2));


        JFrame frame =new JFrame("JLayered Pane ");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setSize(new Dimension(500,500));
        frame.add(jlayeredPane);
        frame.setLayout(null);
        frame.setVisible(true);





    }
}

