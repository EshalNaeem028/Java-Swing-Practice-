package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Practice extends JFrame implements MouseListener{

    JLabel label;

    Practice(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.GRAY);
        label.setOpaque(true);
        this.addMouseListener(this);
        this.add(label);


        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
       // System.out.println("You clicked the mouse !");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse!");
        label.setBackground(Color.BLUE);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse!");
        label.setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the component!");
        label.setBackground(Color.black);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the component!");
        label.setBackground(Color.GRAY);

    }
}
public class MouseListenerDemo {
    public static void main(String[] args){
        new Practice();

    }
}
