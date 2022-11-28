import javax.swing.*;

public class createAccountPage extends JFrame {

    public createAccountPage() {
        returnAccountPage();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        phoneNumInput = new javax.swing.JTextField();
        addressInput = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        mainPageButton = new javax.swing.JButton();
        orderPageButton = new javax.swing.JButton();
        aboutUsPageButton = new javax.swing.JButton();
        MenuPageButton = new javax.swing.JButton();
        createAccountBackground = new javax.swing.JLabel();

        createAccountPagePanel.setLayout(null);

        firstNameInput.setBackground(new java.awt.Color(229, 229, 229));
        firstNameInput.setForeground(new java.awt.Color(102, 102, 102));
        firstNameInput.setText("");
        createAccountPagePanel.add(firstNameInput);
        firstNameInput.setBounds(320, 190, 340, 35);

        lastNameInput.setBackground(new java.awt.Color(229, 229, 229));
        lastNameInput.setForeground(new java.awt.Color(102, 102, 102));
        lastNameInput.setText("LastName");

        createAccountPagePanel.add(lastNameInput);
        lastNameInput.setBounds(320, 250, 340, 35);

        emailInput.setBackground(new java.awt.Color(229, 229, 229));
        emailInput.setForeground(new java.awt.Color(102, 102, 102));
        emailInput.setText("Email");
        createAccountPagePanel.add(emailInput);
        emailInput.setBounds(320, 300, 340, 35);

        phoneNumInput.setBackground(new java.awt.Color(229, 229, 229));
        phoneNumInput.setForeground(new java.awt.Color(102, 102, 102));
        phoneNumInput.setText("PhoneNumber");
        createAccountPagePanel.add(phoneNumInput);
        phoneNumInput.setBounds(320, 360, 340, 35);

        addressInput.setBackground(new java.awt.Color(229, 229, 229));
        addressInput.setForeground(new java.awt.Color(102, 102, 102));
        addressInput.setText("Address");
        createAccountPagePanel.add(addressInput);
        addressInput.setBounds(320, 410, 340, 35);

        submitButton.setBackground(new java.awt.Color(242, 242, 242));
        submitButton.setFont(new java.awt.Font("Gill Sans MT", 3, 24));
        submitButton.setForeground(new java.awt.Color(144, 0, 0));
        submitButton.setText("Submit");
        submitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));
        createAccountPagePanel.add(submitButton);
        submitButton.setBounds(500, 490, 150, 70);

        mainPageButton.setBackground(new java.awt.Color(144, 0, 0));
        mainPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        mainPageButton.setForeground(new java.awt.Color(255, 255, 255));
        mainPageButton.setText("Main Page");
        createAccountPagePanel.add(mainPageButton);
        mainPageButton.setBounds(30, 30, 120, 32);

        orderPageButton.setBackground(new java.awt.Color(144, 0, 0));
        orderPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        orderPageButton.setForeground(new java.awt.Color(255, 255, 255));
        orderPageButton.setText("Order Page");

        createAccountPagePanel.add(orderPageButton);
        orderPageButton.setBounds(340, 30, 160, 32);

        aboutUsPageButton.setBackground(new java.awt.Color(144, 0, 0));
        aboutUsPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        aboutUsPageButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutUsPageButton.setText("About Us");

        createAccountPagePanel.add(aboutUsPageButton);
        aboutUsPageButton.setBounds(530, 30, 140, 32);

        MenuPageButton.setBackground(new java.awt.Color(144, 0, 0));
        MenuPageButton.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        MenuPageButton.setForeground(new java.awt.Color(255, 255, 255));
        MenuPageButton.setText("Menu");
        createAccountPagePanel.add(MenuPageButton);
        MenuPageButton.setBounds(200, 30, 108, 32);

        createAccountBackground.setIcon(new javax.swing.ImageIcon("momPop_Background13.png"));
        createAccountPagePanel.add(createAccountBackground);
        createAccountBackground.setBounds(0, 0, 800, 600);
    }
    public JPanel returnAccountPage() {
        initComponents();
        return createAccountPagePanel;
    }
    JPanel createAccountPagePanel = new JPanel();

    private javax.swing.JButton submitButton;
    private javax.swing.JButton mainPageButton;
    private javax.swing.JButton orderPageButton;
    private javax.swing.JButton aboutUsPageButton;
    private javax.swing.JButton MenuPageButton;
    private javax.swing.JLabel createAccountBackground;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JTextField phoneNumInput;
    private javax.swing.JTextField addressInput;

}