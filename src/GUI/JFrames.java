package GUI;
import javax.swing.*;
import java.awt.*;

public class JFrames {
    JFrame frame ;

    public JFrames(){
        frame=new JFrame();
        frame.setSize(420,420);
        frame.setTitle("JFrames Practice");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon image=new ImageIcon("Cat.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.GRAY);
    }

    public static void main(String[] args){
        new JFrames();

    }
}
