import javax.swing.*;

public class aboutUsPage extends JFrame {


    public aboutUsPage() {
        returnAboutUsPage();
    }

    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        mainPageButton = new javax.swing.JButton();
        orderPageButton = new javax.swing.JButton();
        aboutUsPageButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        aboutBackground = new javax.swing.JLabel();

        aboutUsPagePanel.setLayout(null);

        mainPageButton.setBackground(new java.awt.Color(144, 0, 0));
        mainPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); 
        mainPageButton.setForeground(new java.awt.Color(255, 255, 255));
        mainPageButton.setText("Main Page");
        aboutUsPagePanel.add(mainPageButton);
        mainPageButton.setBounds(40, 30, 120, 32);

        orderPageButton.setBackground(new java.awt.Color(144, 0, 0));
        orderPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); 
        orderPageButton.setForeground(new java.awt.Color(255, 255, 255));
        orderPageButton.setText("Order Page");

        aboutUsPagePanel.add(orderPageButton);
        orderPageButton.setBounds(190, 30, 160, 32);

        aboutUsPageButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutUsPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); 
        aboutUsPageButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutUsPageButton.setText("About Us");

        aboutUsPagePanel.add(aboutUsPageButton);
        aboutUsPageButton.setBounds(380, 30, 140, 32);

        accountButton.setBackground(new java.awt.Color(144, 0, 0));
        accountButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); 
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        aboutUsPagePanel.add(accountButton);
        accountButton.setBounds(550, 30, 108, 32);

        aboutBackground.setIcon(new javax.swing.ImageIcon("momPop_Background3.png")); 

        aboutUsPagePanel.add(aboutBackground);
        aboutBackground.setBounds(0, 0, 700, 600);
    }

    public JPanel returnAboutUsPage() {
        initComponents();
        return aboutUsPagePanel;
    }
    
    JPanel aboutUsPagePanel = new JPanel();
    private javax.swing.JButton mainPageButton;
    private javax.swing.JButton orderPageButton;
    private javax.swing.JButton aboutUsPageButton;
    private javax.swing.JButton accountButton;
    private javax.swing.JLabel aboutBackground;

}
