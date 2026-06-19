package GUI;
import javax.swing.*;
import java.awt.*;import java.awt.event.ActionEvent;

class MyFrame extends JFrame implements java.awt.event.ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button = new JButton("Pick a Color");
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setFont(new Font("MV BOLI", Font.PLAIN, 20));
        label.setOpaque(true);
        button.addActionListener(this);
        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JColorChooser colorChooser=new JColorChooser();
            Color color=JColorChooser.showDialog(null,"Pick",Color.black);
            label.setBackground(color);
        }

    }

}

public class ActionListener {
    public static void main(String args[]){
    new MyFrame();

}
}
