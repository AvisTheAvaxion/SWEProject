import javax.swing.*;
public class accountInfoPage extends JFrame {


    public accountInfoPage() {
        returnAccountInfoPage();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        mainPageButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cardNumLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        accountInfoBackground = new javax.swing.JLabel();

        accountInfoPagePanel.setLayout(null);

        mainPageButton.setBackground(new java.awt.Color(144, 0, 0));
        mainPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); 
        mainPageButton.setForeground(new java.awt.Color(255, 255, 255));
        mainPageButton.setText("Main Page");
        accountInfoPagePanel.add(mainPageButton);
        mainPageButton.setBounds(30, 30, 120, 32);

        menuButton.setBackground(new java.awt.Color(144, 0, 0));
        menuButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("Menu");
        accountInfoPagePanel.add(menuButton);
        menuButton.setBounds(200, 30, 108, 32);

        orderButton.setBackground(new java.awt.Color(144, 0, 0));
        orderButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); 
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order Page");

        accountInfoPagePanel.add(orderButton);
        orderButton.setBounds(340, 30, 160, 32);

        aboutButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("About Us");

        accountInfoPagePanel.add(aboutButton);
        aboutButton.setBounds(530, 30, 140, 32);

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); 
        firstNameLabel.setText("");
        accountInfoPagePanel.add(firstNameLabel);
        firstNameLabel.setBounds(280, 190, 380, 25);

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
        lastNameLabel.setText("");
        accountInfoPagePanel.add(lastNameLabel);
        lastNameLabel.setBounds(280, 240, 380, 25);

        emailLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
        emailLabel.setText("");
        accountInfoPagePanel.add(emailLabel);
        emailLabel.setBounds(280, 290, 400, 25);

        phoneLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); 
        phoneLabel.setText("");
        accountInfoPagePanel.add(phoneLabel);
        phoneLabel.setBounds(280, 350, 360, 25);

        addressLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
        addressLabel.setText("");
        accountInfoPagePanel.add(addressLabel);
        addressLabel.setBounds(280, 400, 400, 25);

        cardNumLabel.setFont(new java.awt.Font("Segoe UI", 2, 18)); 
        cardNumLabel.setText("");
        accountInfoPagePanel.add(cardNumLabel);
        cardNumLabel.setBounds(280, 470, 360, 25);

        logoutButton.setBackground(new java.awt.Color(242, 242, 242));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 3, 24));
        logoutButton.setForeground(new java.awt.Color(144, 0, 0));
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        accountInfoPagePanel.add(logoutButton);
        logoutButton.setBounds(533, 530, 130, 36);

        accountInfoBackground.setIcon(new javax.swing.ImageIcon("momPop_Background14.png")); 
        accountInfoPagePanel.add(accountInfoBackground);
        accountInfoBackground.setBounds(0, -30, 710, 670);
    }

    public JPanel returnAccountInfoPage() {
        initComponents();
        return accountInfoPagePanel;
    }
    JPanel accountInfoPagePanel = new JPanel();
    private javax.swing.JButton mainPageButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel cardNumLabel;
    private javax.swing.JLabel accountInfoBackground;

}
