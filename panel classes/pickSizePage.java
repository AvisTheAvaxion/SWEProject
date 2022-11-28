import javax.swing.*;

public class pickSizePage extends JFrame {
    
    public pickSizePage() {
        returnPickSizePage();
    }

  
    @SuppressWarnings("unchecked")

    private void initComponents() {

        menuButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        smallCheck = new javax.swing.JCheckBox();
        mediumCheck = new javax.swing.JCheckBox();
        largeCheck = new javax.swing.JCheckBox();
        xLargeCheck = new javax.swing.JCheckBox();
        pizzaSizeBackground = new javax.swing.JLabel();

        pickSizePagePanel.setLayout(null);

        menuButton.setBackground(new java.awt.Color(144, 0, 0));
        menuButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("Menu");
        pickSizePagePanel.add(menuButton);
        menuButton.setBounds(40, 40, 108, 32);

        orderButton.setBackground(new java.awt.Color(144, 0, 0));
        orderButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order Page");

        pickSizePagePanel.add(orderButton);
        orderButton.setBounds(190, 40, 160, 32);

        aboutButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("About Us");

        pickSizePagePanel.add(aboutButton);
        aboutButton.setBounds(380, 40, 140, 32);

        accountButton.setBackground(new java.awt.Color(144, 0, 0));
        accountButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        pickSizePagePanel.add(accountButton);
        accountButton.setBounds(550, 40, 108, 32);

        continueButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        continueButton.setForeground(new java.awt.Color(144, 0, 0));
        continueButton.setText("Continue");
        continueButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        pickSizePagePanel.add(continueButton);
        continueButton.setBounds(150, 500, 180, 60);

        backButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        backButton.setForeground(new java.awt.Color(144, 0, 0));
        backButton.setText("Go Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        pickSizePagePanel.add(backButton);
        backButton.setBounds(350, 500, 170, 60);


        pickSizePagePanel.add(smallCheck);
        smallCheck.setBounds(90, 420, 40, 29);


        pickSizePagePanel.add(mediumCheck);
        mediumCheck.setBounds(210, 420, 40, 29);
        pickSizePagePanel.add(largeCheck);
        largeCheck.setBounds(370, 420, 40, 29);
        pickSizePagePanel.add(xLargeCheck);
        xLargeCheck.setBounds(550, 420, 40, 29);

        pizzaSizeBackground.setIcon(new javax.swing.ImageIcon("momPop_Background5.png"));

        pickSizePagePanel.add(pizzaSizeBackground);
        pizzaSizeBackground.setBounds(0, 0, 700, 610);
    }

    public JPanel returnPickSizePage() {
        initComponents();
        return pickSizePagePanel;
    }
    JPanel pickSizePagePanel = new JPanel();
    private javax.swing.JButton menuButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton accountButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox smallCheck;
    private javax.swing.JCheckBox mediumCheck;
    private javax.swing.JCheckBox largeCheck;
    private javax.swing.JCheckBox xLargeCheck;
    private javax.swing.JLabel pizzaSizeBackground;
   
}
