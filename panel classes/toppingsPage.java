import javax.swing.*;

public class toppingsPage extends JFrame {


    public toppingsPage() {
        returnToppingsPage();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        menuButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        cheeseCheck = new javax.swing.JCheckBox();
        pepperoniCheck = new javax.swing.JCheckBox();
        sausageCheck = new javax.swing.JCheckBox();
        hamCheck = new javax.swing.JCheckBox();
        greenPepperCheck = new javax.swing.JCheckBox();
        onionCheck = new javax.swing.JCheckBox();
        mushroomCheck = new javax.swing.JCheckBox();
        tomatoCheck = new javax.swing.JCheckBox();
        pineappleCheck = new javax.swing.JCheckBox();
        toppingsBackground = new javax.swing.JLabel();

        toppingsPagePanel.setLayout(null);

        menuButton.setBackground(new java.awt.Color(144, 0, 0));
        menuButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("Menu");
        toppingsPagePanel.add(menuButton);
        menuButton.setBounds(40, 40, 108, 32);

        orderButton.setBackground(new java.awt.Color(144, 0, 0));
        orderButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order Page");

        toppingsPagePanel.add(orderButton);
        orderButton.setBounds(190, 40, 160, 32);

        aboutButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("About Us");

        toppingsPagePanel.add(aboutButton);
        aboutButton.setBounds(380, 40, 140, 32);

        accountButton.setBackground(new java.awt.Color(144, 0, 0));
        accountButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        toppingsPagePanel.add(accountButton);
        accountButton.setBounds(550, 40, 108, 32);

        continueButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        continueButton.setForeground(new java.awt.Color(144, 0, 0));
        continueButton.setText("Continue");
        continueButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        toppingsPagePanel.add(continueButton);
        continueButton.setBounds(160, 490, 180, 60);

        backButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(144, 0, 0));
        backButton.setText("Go Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        toppingsPagePanel.add(backButton);
        backButton.setBounds(370, 490, 170, 60);

        toppingsPagePanel.add(cheeseCheck);
        cheeseCheck.setBounds(100, 250, 29, 29);

        toppingsPagePanel.add(pepperoniCheck);
        pepperoniCheck.setBounds(250, 250, 29, 29);

        toppingsPagePanel.add(sausageCheck);
        sausageCheck.setBounds(410, 250, 29, 29);

        toppingsPagePanel.add(hamCheck);
        hamCheck.setBounds(570, 250, 29, 29);

        toppingsPagePanel.add(greenPepperCheck);
        greenPepperCheck.setBounds(80, 400, 29, 29);

        toppingsPagePanel.add(onionCheck);
        onionCheck.setBounds(220, 410, 29, 29);

        toppingsPagePanel.add(mushroomCheck);
        mushroomCheck.setBounds(340, 410, 29, 29);

        toppingsPagePanel.add(tomatoCheck);
        tomatoCheck.setBounds(470, 410, 29, 29);

        toppingsPagePanel.add(pineappleCheck);
        pineappleCheck.setBounds(600, 410, 29, 29);

        toppingsBackground.setIcon(new javax.swing.ImageIcon("momPop_Background6.png"));
        toppingsPagePanel.add(toppingsBackground);
        toppingsBackground.setBounds(0, -10, 780, 610);
    }
    public JPanel returnToppingsPage() {
        initComponents();
        return toppingsPagePanel;
    }
    JPanel toppingsPagePanel = new JPanel();
    private javax.swing.JButton menuButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton accountButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox cheeseCheck;
    private javax.swing.JCheckBox pepperoniCheck;
    private javax.swing.JCheckBox sausageCheck;
    private javax.swing.JCheckBox hamCheck;
    private javax.swing.JCheckBox greenPepperCheck;
    private javax.swing.JCheckBox onionCheck;
    private javax.swing.JCheckBox mushroomCheck;
    private javax.swing.JCheckBox tomatoCheck;
    private javax.swing.JCheckBox pineappleCheck;
    private javax.swing.JLabel toppingsBackground;

}
