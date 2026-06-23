package GUI;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class SlidersDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SlidersDemo(){

        frame=new JFrame("Slider Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintTrack(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setFont(new Font("MV Boli",Font.PLAIN,25));

        slider.setOrientation(SwingConstants.VERTICAL);
        //     slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.addChangeListener(this);
        label.setText("C= " + slider.getValue());
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C= " + slider.getValue());



    }

}
public class Sliders {
    public static void main(String args[]){
        new SlidersDemo();
    }
}
