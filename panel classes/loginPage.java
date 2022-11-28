import javax.swing.*;

public class loginPage extends JFrame {


    public loginPage() {
        returnLoginPage();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {
        
        usernameInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        createAccButton = new javax.swing.JButton();
        mainPageButton = new javax.swing.JButton();
        loginBackground = new javax.swing.JLabel();


        loginPagePanel.setLayout(null);

        usernameInput.setBackground(new java.awt.Color(231, 231, 231));
        usernameInput.setFont(new java.awt.Font("Segoe UI", 2, 18));
        usernameInput.setForeground(new java.awt.Color(102, 102, 102));
        usernameInput.setText("Username");

        loginPagePanel.add(usernameInput);
        usernameInput.setBounds(210, 100, 270, 35);

        passwordInput.setBackground(new java.awt.Color(229, 229, 229));
        passwordInput.setFont(new java.awt.Font("Segoe UI", 2, 18));
        passwordInput.setForeground(new java.awt.Color(102, 102, 102));
        passwordInput.setText("Password");
        loginPagePanel.add(passwordInput);
        passwordInput.setBounds(210, 150, 270, 35);

        submitButton.setText("Submit");
        loginPagePanel.add(submitButton);
        submitButton.setBounds(290, 200, 108, 35);

        createAccButton.setBackground(new java.awt.Color(102, 102, 102));
        createAccButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
        createAccButton.setForeground(new java.awt.Color(255, 255, 255));
        createAccButton.setText("Create an Account");

        loginPagePanel.add(createAccButton);
        createAccButton.setBounds(30, 520, 210, 35);

        mainPageButton.setBackground(new java.awt.Color(144, 0, 0));
        mainPageButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
        mainPageButton.setForeground(new java.awt.Color(255, 255, 255));
        mainPageButton.setText("Main Page");

        loginPagePanel.add(mainPageButton);
        mainPageButton.setBounds(510, 520, 160, 35);

        loginBackground.setIcon(new javax.swing.ImageIcon("momPop_Background12.png"));
        loginPagePanel.add(loginBackground);
        loginBackground.setBounds(0, 0, 850, 600);
    }
    
    public JPanel returnLoginPage() {
        initComponents();
        return loginPagePanel;
    }
    JPanel loginPagePanel = new JPanel();
    private javax.swing.JButton submitButton;
    private javax.swing.JButton createAccButton;
    private javax.swing.JButton mainPageButton;

    private javax.swing.JLabel loginBackground;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JTextField passwordInput;

}
