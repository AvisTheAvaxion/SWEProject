import javax.swing.*;

public class sidesPage extends JFrame {


    public sidesPage() {
        returnSidesPage();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        menuButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        breadsticksAmount = new javax.swing.JTextField();
        breadsticksBitesAmount = new javax.swing.JTextField();
        cookieAmount = new javax.swing.JTextField();
        sidesBackground = new javax.swing.JLabel();

        sidesPagePanel.setLayout(null);

        menuButton.setBackground(new java.awt.Color(144, 0, 0));
        menuButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("Menu");
        sidesPagePanel.add(menuButton);
        menuButton.setBounds(40, 40, 108, 32);

        orderButton.setBackground(new java.awt.Color(144, 0, 0));
        orderButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order Page");

        sidesPagePanel.add(orderButton);
        orderButton.setBounds(190, 40, 160, 32);

        aboutButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("About Us");

        sidesPagePanel.add(aboutButton);
        aboutButton.setBounds(380, 40, 140, 32);

        accountButton.setBackground(new java.awt.Color(144, 0, 0));
        accountButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); 
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        sidesPagePanel.add(accountButton);
        accountButton.setBounds(550, 40, 108, 32);

        continueButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        continueButton.setForeground(new java.awt.Color(144, 0, 0));
        continueButton.setText("Continue");
        continueButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        sidesPagePanel.add(continueButton);
        continueButton.setBounds(140, 510, 180, 60);

        backButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        backButton.setForeground(new java.awt.Color(144, 0, 0));
        backButton.setText("Go Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        sidesPagePanel.add(backButton);
        backButton.setBounds(380, 510, 170, 60);

        breadsticksAmount.setText("#");

        sidesPagePanel.add(breadsticksAmount);
        breadsticksAmount.setBounds(100, 280, 90, 30);

        breadsticksBitesAmount.setText("#");

        sidesPagePanel.add(breadsticksBitesAmount);
        breadsticksBitesAmount.setBounds(270, 440, 80, 35);

        cookieAmount.setText("#");
        sidesPagePanel.add(cookieAmount);
        cookieAmount.setBounds(440, 280, 90, 35);

        sidesBackground.setIcon(new javax.swing.ImageIcon("momPop_Background7.png"));
        sidesPagePanel.add(sidesBackground);
        sidesBackground.setBounds(0, 0, 710, 600);
    }

    public JPanel returnSidesPage() {
        initComponents();
        return sidesPagePanel;
    }
    JPanel sidesPagePanel = new JPanel();
    private javax.swing.JButton menuButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton accountButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel sidesBackground;
    private javax.swing.JTextField breadsticksAmount;
    private javax.swing.JTextField breadsticksBitesAmount;
    private javax.swing.JTextField cookieAmount;

}
