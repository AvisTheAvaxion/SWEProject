import javax.swing.*;

public class pizzaBuilderPage extends JFrame {
    
    public pizzaBuilderPage() {
        returnPizzaBuilderPage();
    }

  
    @SuppressWarnings("unchecked")

    private void initComponents() {

        menuButton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        thinCheck = new javax.swing.JCheckBox();
        regularCheck = new javax.swing.JCheckBox();
        panCheck = new javax.swing.JCheckBox();
        builderBackground = new javax.swing.JLabel();

        pizzaBuilderPagePanel.setLayout(null);

        menuButton.setBackground(new java.awt.Color(0, 0, 0));
        menuButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setText("Menu");

        pizzaBuilderPagePanel.add(menuButton);
        menuButton.setBounds(220, 170, 90, 30);

        orderButton.setBackground(new java.awt.Color(0, 0, 0));
        orderButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        orderButton.setForeground(new java.awt.Color(255, 255, 255));
        orderButton.setText("Order");
        pizzaBuilderPagePanel.add(orderButton);
        orderButton.setBounds(330, 170, 90, 30);

        aboutButton.setBackground(new java.awt.Color(0, 0, 0));
        aboutButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("About Us");
        pizzaBuilderPagePanel.add(aboutButton);
        aboutButton.setBounds(440, 170, 108, 30);

        accountButton.setBackground(new java.awt.Color(0, 0, 0));
        accountButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Account");

        pizzaBuilderPagePanel.add(accountButton);
        accountButton.setBounds(570, 170, 108, 30);

        continueButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        continueButton.setForeground(new java.awt.Color(144, 0, 0));
        continueButton.setText("Continue");
        continueButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(144, 0, 0), 2, true));

        pizzaBuilderPagePanel.add(continueButton);
        continueButton.setBounds(140, 490, 170, 60);

        backButton.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        backButton.setForeground(new java.awt.Color(144, 0, 0));
        backButton.setText("Back to Main");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        pizzaBuilderPagePanel.add(backButton);
        backButton.setBounds(360, 490, 190, 60);

        thinCheck.setBackground(new java.awt.Color(144, 0, 0));
        thinCheck.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 28));
        thinCheck.setForeground(new java.awt.Color(255, 255, 255));
        thinCheck.setText("Thin");

        pizzaBuilderPagePanel.add(thinCheck);
        thinCheck.setBounds(90, 360, 130, 80);

        regularCheck.setBackground(new java.awt.Color(144, 0, 0));
        regularCheck.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 28));
        regularCheck.setForeground(new java.awt.Color(255, 255, 255));
        regularCheck.setText("Regular");
        regularCheck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        pizzaBuilderPagePanel.add(regularCheck);
        regularCheck.setBounds(260, 360, 190, 80);

        panCheck.setBackground(new java.awt.Color(144, 0, 0));
        panCheck.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 28));
        panCheck.setForeground(new java.awt.Color(255, 255, 255));
        panCheck.setText("Pan");

        pizzaBuilderPagePanel.add(panCheck);
        panCheck.setBounds(490, 360, 120, 80);

        builderBackground.setIcon(new javax.swing.ImageIcon("momPop_Background4.png"));
        pizzaBuilderPagePanel.add(builderBackground);
        builderBackground.setBounds(0, 0, 770, 590);
    }

    public JPanel returnPizzaBuilderPage() {
        initComponents();
        return pizzaBuilderPagePanel;
    }
    JPanel pizzaBuilderPagePanel = new JPanel();
    private javax.swing.JButton menuButton;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton accountButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton backButton;
    private javax.swing.JCheckBox thinCheck;
    private javax.swing.JCheckBox regularCheck;
    private javax.swing.JCheckBox panCheck;
    private javax.swing.JLabel builderBackground;
   
}

