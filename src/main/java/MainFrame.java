import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainFrame {


    public String algebra = "https://www.algebra.hr/visoko-uciliste/";

    JFrame frame = new JFrame();



    JButton buttonHome = new JButton();
    JButton buttonSources = new JButton();
    JButton buttonSkills = new JButton();
    JButton buttonExchage = new JButton();
    JPanel panel = new JPanel();

    JLabel label = new JLabel();

    JMenuBar menuBar = new JMenuBar();

    JMenu menuFile = new JMenu("File");
    JMenuItem menuExit = new JMenuItem("Exit");
    JMenuItem menuInfo = new JMenuItem("Info");

    //This frame is created manually while ExchangeFrame was using Swing UI Designer
    MainFrame() {




        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setBackground(Color.DARK_GRAY);
        frame.setTitle("WorkApp");
        frame.setLayout(null);
        frame.setSize(650, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);
        frame.add(buttonHome);
        frame.add(buttonExchage);
        frame.add(buttonSkills);
        frame.add(buttonSources);

        frame.setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuFile.add(menuInfo);
        menuInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "<html>Email: kdautovic3@gmail.com<br/> PhoneNum: +385992131499<br/> " +
                                "Address : Valkarin 21-Porec </html>","aaa",JOptionPane.PLAIN_MESSAGE);
            }
        });
        menuFile.add(menuExit);
        menuExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });







        label.setFont(new Font("Serif", Font.PLAIN, 18));
        label.setText("This is simple app in which i'm presenting some of my knowledge of Java");
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        panel.setBounds(50, 90, 550, 200);
        panel.setBackground(Color.gray);
        panel.add(label);



        //OnClick setting new values on label and "returns on home page of app"
        buttonHome.setBounds(50, 20, 100, 50);
        buttonHome.setText("Home");
        buttonHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.add(panel);
                label.setText("This is simple app in which i'm presenting some of my knowledge of Java");
                label.setFont(new Font("Serif", Font.PLAIN, 18));
                panel.setLayout(new GridBagLayout());
                panel.setBackground(Color.WHITE);
                panel.setBounds(50, 90, 550, 200);
                panel.setBackground(Color.gray);
                panel.add(label);


            }
        });
        buttonSources.setBounds(200, 20, 100, 50);
        buttonSources.setText("Sources");
        buttonSources.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.add(panel);

                label.setText("<html>I'm semi self-taught programmer<br/> " +
                        "(actually if you give me a chance i may become programmer)<br/> " +
                        "Sources of my knowledge are : <br/>" +
                        "-Visoko učilište Algreba - Zagreb<br/>" +
                        "-Udemy Online Academy<br/>" +
                        "-YouTube channels like BroCode & SimpliLearn</html>");

                label.setFont(new Font("Serif", Font.PLAIN, 18));
                panel.setLayout(new GridBagLayout());
                panel.setBackground(Color.WHITE);
                panel.setBounds(50, 90, 550, 200);
                panel.setBackground(Color.gray);
                panel.add(label);


            }

        });


        //OnClick setting new values on label
        buttonSkills.setBounds(350, 20, 100, 50);
        buttonSkills.setText("Skills");
        buttonSkills.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.add(panel);
                label.setText("<html>-Java<br/> " +
                        "-MySQL<br/>" +
                        "-Git(learning)<br/>" +
                        "-Spring Framework(learning)</html>");
                label.setFont(new Font("Serif", Font.PLAIN, 18));
                panel.setLayout(new GridBagLayout());
                panel.setBackground(Color.WHITE);
                panel.setBounds(50, 90, 550, 200);
                panel.setBackground(Color.gray);
                panel.add(label);


            }
        });

        //OnClick open Exchange Frame
        buttonExchage.setBounds(500, 20, 120, 50);
        buttonExchage.setText("ExchangeApp");
        buttonExchage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ExchangeFrame exFrame;
                exFrame = new ExchangeFrame();

            }
        });


    }

}
