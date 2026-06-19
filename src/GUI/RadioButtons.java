package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;


    Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotDogButton = new JRadioButton("Hot Dog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);

         pizzaButton.addActionListener(this);
         hamburgerButton.addActionListener(this);
         hotDogButton.addActionListener(this);


        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza");

        }
  else  if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered hamburger");
        }
 else   if (e.getSource() == hotDogButton) {
            System.out.println("You ordered hot dog");
        }
    }
}

public class RadioButtons {
    public static void main(String[] args) {
        new Frame();
    }

}
