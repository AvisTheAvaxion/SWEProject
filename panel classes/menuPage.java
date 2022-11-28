import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuPage extends JFrame {



    public menuPage() {
        returnMenuPage();

    }
    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        mainPageButton = new javax.swing.JButton();
        orderPageButton = new javax.swing.JButton();
        aboutUsButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        menuBackground = new javax.swing.JLabel();


        menuPagePanel.setLayout(null);

        mainPageButton.setBackground(new java.awt.Color(144, 0, 0));
        mainPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        mainPageButton.setForeground(new java.awt.Color(255, 255, 255));
        mainPageButton.setText("Main Page");




        menuPagePanel.add(mainPageButton);
        mainPageButton.setBounds(30, 30, 120, 32);

        orderPageButton.setBackground(new java.awt.Color(144, 0, 0));
        orderPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        orderPageButton.setForeground(new java.awt.Color(255, 255, 255));
        orderPageButton.setText("Order Page");

        menuPagePanel.add(orderPageButton);
        orderPageButton.setBounds(180, 30, 160, 32);

        aboutUsButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutUsButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        aboutUsButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutUsButton.setText("About Us");

        menuPagePanel.add(aboutUsButton);
        aboutUsButton.setBounds(360, 30, 140, 32);

        accountButton.setBackground(new java.awt.Color(144, 0, 0));
        accountButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        menuPagePanel.add(accountButton);
        accountButton.setBounds(530, 30, 108, 32);

        menuBackground.setIcon(new javax.swing.ImageIcon("momPop_Background2.png"));

        menuPagePanel.add(menuBackground);
        menuBackground.setBounds(0, 0, 700, 590);


    }



    public JPanel returnMenuPage() {
        initComponents();
        return menuPagePanel;
    }

    public JButton returnMainButton() {
        return mainPageButton;
    }


    JPanel menuPagePanel = new JPanel();
    private javax.swing.JButton mainPageButton;
    private javax.swing.JButton orderPageButton;
    private javax.swing.JButton aboutUsButton;
    private javax.swing.JButton accountButton;
    private javax.swing.JLabel menuBackground;

}
