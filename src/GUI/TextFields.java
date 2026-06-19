package GUI;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;
import java .awt.*;
import java.awt.event.ActionListener;

class Runner extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;

    Runner(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //button
        button=new JButton("Submit");
        button.addActionListener(this);

        //textfields
        textField=new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(Color.blue);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.cyan);
        textField.setText("Username");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println( textField.getText());
        }

    }
}
public class TextFields {
    public static void main(String[] args){
        Runner r =new Runner();
    }
}
