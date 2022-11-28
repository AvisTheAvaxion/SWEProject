import javax.swing.*;

public class drinksPage extends JFrame {


    public drinksPage() {
        returnDrinksPage();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        menuButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        pepsiAmount = new javax.swing.JTextField();
        orangeSodaAmount = new javax.swing.JTextField();
        sierraMistAmount = new javax.swing.JTextField();
        lemonadeAmount = new javax.swing.JTextField();
        rootBeerAmount = new javax.swing.JTextField();
        waterAmount = new javax.swing.JTextField();
        pepsiOptions = new javax.swing.JComboBox<>();
        orangeSodaOptions = new javax.swing.JComboBox<>();
        sierraMistOptions = new javax.swing.JComboBox<>();
        lemonadeOptions = new javax.swing.JComboBox<>();
        rootBeerOptions = new javax.swing.JComboBox<>();
        waterOptions = new javax.swing.JComboBox<>();
        drinksBackground = new javax.swing.JLabel();

        drinksPagePanel.setLayout(null);

        menuButton.setBackground(new java.awt.Color(144, 0, 0));
        menuButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("Menu");
        drinksPagePanel.add(menuButton);
        menuButton.setBounds(40, 40, 108, 32);

        orderButton.setBackground(new java.awt.Color(144, 0, 0));
        orderButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order Page");

        drinksPagePanel.add(orderButton);
        orderButton.setBounds(190, 40, 160, 32);

        aboutButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("About Us");

        drinksPagePanel.add(aboutButton);
        aboutButton.setBounds(380, 40, 140, 32);

        accountButton.setBackground(new java.awt.Color(144, 0, 0));
        accountButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");
        drinksPagePanel.add(accountButton);
        accountButton.setBounds(550, 40, 108, 32);

        continueButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        continueButton.setForeground(new java.awt.Color(144, 0, 0));
        continueButton.setText("Continue");
        continueButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        drinksPagePanel.add(continueButton);
        continueButton.setBounds(140, 530, 180, 60);

        backButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        backButton.setForeground(new java.awt.Color(144, 0, 0));
        backButton.setText("Go Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        drinksPagePanel.add(backButton);
        backButton.setBounds(370, 530, 170, 60);

        pepsiAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
        pepsiAmount.setText("#");
        drinksPagePanel.add(pepsiAmount);
        pepsiAmount.setBounds(150, 220, 96, 30);

        orangeSodaAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
        orangeSodaAmount.setText("#");
        drinksPagePanel.add(orangeSodaAmount);
        orangeSodaAmount.setBounds(420, 220, 100, 30);

        sierraMistAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
        sierraMistAmount.setText("#");

        drinksPagePanel.add(sierraMistAmount);
        sierraMistAmount.setBounds(150, 360, 100, 30);

        lemonadeAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lemonadeAmount.setText("#");

        drinksPagePanel.add(lemonadeAmount);
        lemonadeAmount.setBounds(420, 360, 100, 30);

        rootBeerAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
        rootBeerAmount.setText("#");

        drinksPagePanel.add(rootBeerAmount);
        rootBeerAmount.setBounds(140, 460, 100, 30);

        waterAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
        waterAmount.setText("#");
        drinksPagePanel.add(waterAmount);
        waterAmount.setBounds(410, 470, 100, 30);

        pepsiOptions.setBackground(new java.awt.Color(255, 255, 204));
        pepsiOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
        pepsiOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diet Small", "Diet Medium", "Diet Large", "Regular Small", "Regular Medium", "Regular Large" }));

        drinksPagePanel.add(pepsiOptions);
        pepsiOptions.setBounds(190, 170, 70, 40);

        orangeSodaOptions.setBackground(new java.awt.Color(255, 255, 204));
        orangeSodaOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
        orangeSodaOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Diet Small", "Diet Medium", "Diet Large", "Regular Small", "Regular Medium", "Regular Large" }));
        drinksPagePanel.add(orangeSodaOptions);
        orangeSodaOptions.setBounds(460, 170, 70, 40);

        sierraMistOptions.setBackground(new java.awt.Color(255, 255, 204));
        sierraMistOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
        sierraMistOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large"}));
        drinksPagePanel.add(sierraMistOptions);
        sierraMistOptions.setBounds(190, 300, 70, 40);

        lemonadeOptions.setBackground(new java.awt.Color(255, 255, 204));
        lemonadeOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
        lemonadeOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large" }));
        drinksPagePanel.add(lemonadeOptions);
        lemonadeOptions.setBounds(460, 310, 70, 40);

        rootBeerOptions.setBackground(new java.awt.Color(255, 255, 204));
        rootBeerOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
        rootBeerOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diet Small", "Diet Medium", "Diet Large", "Regular Small", "Regular Medium", "Regular Large" }));
        drinksPagePanel.add(rootBeerOptions);
        rootBeerOptions.setBounds(180, 420, 70, 30);

        waterOptions.setBackground(new java.awt.Color(255, 255, 204));
        waterOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
        waterOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large"}));
        drinksPagePanel.add(waterOptions);
        waterOptions.setBounds(450, 430, 70, 30);

        drinksBackground.setIcon(new javax.swing.ImageIcon("momPop_Background8.png"));

        drinksPagePanel.add(drinksBackground);
        drinksBackground.setBounds(0, 0, 700, 600);
    }

    public JPanel returnDrinksPage() {
        initComponents();
        return drinksPagePanel;
    }
    JPanel drinksPagePanel = new JPanel();
    private javax.swing.JButton menuButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton accountButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> pepsiOptions;
    private javax.swing.JComboBox<String> orangeSodaOptions;
    private javax.swing.JComboBox<String> sierraMistOptions;
    private javax.swing.JComboBox<String> lemonadeOptions;
    private javax.swing.JComboBox<String> rootBeerOptions;
    private javax.swing.JComboBox<String> waterOptions;
    private javax.swing.JLabel drinksBackground;
    private javax.swing.JTextField pepsiAmount;
    private javax.swing.JTextField orangeSodaAmount;
    private javax.swing.JTextField sierraMistAmount;
    private javax.swing.JTextField lemonadeAmount;
    private javax.swing.JTextField rootBeerAmount;
    private javax.swing.JTextField waterAmount;

}
