package GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Main extends JFrame implements ActionListener {
    JButton buttons;
    JCheckBox checkBox;



    Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());



        buttons = new JButton();

        buttons.setText("Submit");
        buttons.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");

        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas ", Font.PLAIN, 35));


        this.add(buttons);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttons) {
            System.out.println(checkBox.isSelected());
        }

    }
}
    public class CheckBoxesDemo {
        public static void main(String args[]){

            new Main();
        }



}
