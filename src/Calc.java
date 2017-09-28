

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Calc extends JFrame 
{
    private final JTextField weight = new JTextField();
    private final JTextField height = new JTextField();
    private final JTextField BMI = new JTextField();

    public Calc()
    {
        JFrame frame = new JFrame("Jakub's Simple BMI Calculator");
        

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frame.add(panel);

        JLabel lweight = new JLabel("Enter weight in kg please:");
        weight.setColumns(6);
        panel.add(lweight);
        panel.add(weight);
        
        

        JLabel lheight = new JLabel("Enter height in meters plase:");
        height.setColumns(6);
        panel.add(lheight);
        panel.add(height);
        

        JLabel lBMI = new JLabel("BMI");
        BMI.setColumns(6);
        BMI.setEditable(false);
        panel.add(lBMI);
        panel.add(BMI);

        JButton Calculate = new JButton("Calculate");
        JButtonHandler handler = new JButtonHandler();

        Calculate.addActionListener(handler);
        panel.add(Calculate);
        
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) 
    {
        Calc jakal = new Calc();
    }

    private class JButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            double Height = Double.parseDouble(height.getText());
            double Weight = Double.parseDouble(weight.getText());
            
            NumberFormat formatter = new DecimalFormat("0.00");
            ;

            double B_M_I = Weight/(Height*Height);
            BMI.setText(formatter.format(B_M_I));
            
        }
    }
}