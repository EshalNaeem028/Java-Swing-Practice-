package GUI;
import java.awt.*;
import javax.swing.*;
class ProgressBarDemo {

    JFrame frame;
    JProgressBar progressBar;

    ProgressBarDemo() {
        frame=new JFrame();
        progressBar=new JProgressBar(0,50);

        progressBar.setValue(0);
        progressBar.setBounds(0, 0, 420, 50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli",Font.BOLD,25));

        progressBar.setForeground(Color.red);
        progressBar.setBackground(Color.black);

        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);

        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 50;

        while (counter >0) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Exception : " + e.toString());
            }
            counter -=1;
        }
        progressBar.setString("Done! :) ");
    }
}
public class ProgressBars {
        public static void main(String[] args){
            new ProgressBarDemo();


        }
}

