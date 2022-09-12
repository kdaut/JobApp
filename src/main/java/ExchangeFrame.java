import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.VK_BACK_SPACE;

public class ExchangeFrame extends JFrame {

    private JPanel mPanel;
    private JTextField tfKnEu;
    private JLabel labelConvertedKnEu;
    private JLabel label12;
    private JLabel label123;
    private JButton buttonKnEu;
    private JButton buttonEuKn;
    private JTextField textFieldEuKn;
    private JLabel labelEuKn;

    private double amount;
    private double result;
    private final double rate = 7.453;


    //This frame is created using Swing UI Designer while MainFrame was manually typed
    public ExchangeFrame() {

        //Added keyListener so textField accepts only numbers
        tfKnEu.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9'){
                    tfKnEu.setEditable(true);
                } else {

                    JOptionPane.showMessageDialog(null, "Enter number please", "title", JOptionPane.PLAIN_MESSAGE);
                    tfKnEu.setText("");
                }

            }
        });

        //Added keyListener so textField accepts only numbers
        textFieldEuKn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {


                if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
                    textFieldEuKn.setEditable(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Enter number please", "title", JOptionPane.PLAIN_MESSAGE);
                    textFieldEuKn.setText("");
                }

            }
        });


        buttonEuKn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldEuKn.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please insert amount", "Error", JOptionPane.PLAIN_MESSAGE);
                } else{
                    ConvertEuKn();
                    labelEuKn.setText(String.valueOf(ConvertEuKn()));
                }


            }
        });

        buttonKnEu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfKnEu.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please insert amount", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    ConvertKnEu();
                    labelConvertedKnEu.setText(String.valueOf(ConvertKnEu()));
                }


            }
        });


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBackground(Color.blue);
        this.setResizable(false);
        this.setSize(550, 180);
        this.setTitle("ExchangeFrame");
        this.setLayout(new GridBagLayout());
        this.setVisible(true);
        this.setContentPane(mPanel);
        this.setLocationRelativeTo(null);


    }

    //Function that converts Kuna to Euro
    private Double ConvertKnEu() {
        amount = Double.parseDouble(tfKnEu.getText());
        result = amount / rate;
        return result;
    }

    //Function that converts Euro to Kuna
    private Double ConvertEuKn() {
        amount = Double.parseDouble(textFieldEuKn.getText());
        result = amount * rate;
        return result;
    }

}
