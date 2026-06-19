package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ComboBoxPractice extends JFrame implements ActionListener{

    JComboBox comboBox;

    ComboBoxPractice(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(200,200);

        String[] animals={"dog","cat","bird"};
        comboBox=new JComboBox(animals);
        comboBox.addActionListener(this);


        comboBox.addItem("horse");
        comboBox.removeItem("cat");

        System.out.println(comboBox.getItemCount());
        this.add(comboBox);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }

    }
}
public class ComboBoxes {
    public static void main(String args[]){
        new ComboBoxPractice();
    }
}
