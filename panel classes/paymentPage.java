import javax.swing.*;

public class paymentPage extends JFrame {

    public paymentPage() {
        returnPaymentPage();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        tenTip = new javax.swing.JButton();
        twentyTip = new javax.swing.JButton();
        thirtyTip = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        cardNum = new javax.swing.JTextField();
        expDate = new javax.swing.JTextField();
        securityCode = new javax.swing.JTextField();
        customTip = new javax.swing.JTextField();
        paymentBackground = new javax.swing.JLabel();

        paymentPagePanel.setLayout(null);

        tenTip.setBackground(new java.awt.Color(255, 255, 204));
        tenTip.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        tenTip.setForeground(new java.awt.Color(144, 0, 0));
        tenTip.setText("10%");
        paymentPagePanel.add(tenTip);
        tenTip.setBounds(160, 390, 80, 30);

        twentyTip.setBackground(new java.awt.Color(255, 255, 204));
        twentyTip.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        twentyTip.setForeground(new java.awt.Color(144, 0, 0));
        twentyTip.setText("20%");
        paymentPagePanel.add(twentyTip);
        twentyTip.setBounds(250, 390, 80, 30);

        thirtyTip.setBackground(new java.awt.Color(255, 255, 204));
        thirtyTip.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        thirtyTip.setForeground(new java.awt.Color(144, 0, 0));
        thirtyTip.setText("30%");
        paymentPagePanel.add(thirtyTip);
        thirtyTip.setBounds(340, 390, 80, 30);

        backButton.setFont(new java.awt.Font("Rockwell", 1, 24)); 
        backButton.setForeground(new java.awt.Color(144, 0, 0));
        backButton.setText("Go Back");
        backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        paymentPagePanel.add(backButton);
        backButton.setBounds(100, 500, 220, 60);

        placeOrderButton.setBackground(new java.awt.Color(200, 131, 131));
        placeOrderButton.setFont(new java.awt.Font("Rockwell", 1, 24));
        placeOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderButton.setText("PLACE ORDER");
        placeOrderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        paymentPagePanel.add(placeOrderButton);
        placeOrderButton.setBounds(370, 500, 250, 60);

        cardNum.setFont(new java.awt.Font("Segoe UI", 0, 16)); 
        cardNum.setForeground(new java.awt.Color(102, 102, 102));
        cardNum.setText("xxxx-xxxx-xxxx");

        paymentPagePanel.add(cardNum);
        cardNum.setBounds(310, 200, 160, 35);

        expDate.setFont(new java.awt.Font("Segoe UI", 0, 16)); 
        expDate.setForeground(new java.awt.Color(102, 102, 102));
        expDate.setText("mm/yy");

        paymentPagePanel.add(expDate);
        expDate.setBounds(320, 250, 96, 32);

        securityCode.setFont(new java.awt.Font("Segoe UI", 0, 16)); 
        securityCode.setForeground(new java.awt.Color(102, 102, 102));
        securityCode.setText("***");
        paymentPagePanel.add(securityCode);
        securityCode.setBounds(320, 290, 96, 32);

        customTip.setBackground(new java.awt.Color(255, 255, 204));
        customTip.setFont(new java.awt.Font("Segoe UI", 2, 14)); 
        customTip.setForeground(new java.awt.Color(144, 0, 0));
        customTip.setText("Custom Tip: ");
        paymentPagePanel.add(customTip);
        customTip.setBounds(430, 390, 100, 30);

        paymentBackground.setIcon(new javax.swing.ImageIcon("momPop_Background10.png"));
        paymentPagePanel.add(paymentBackground);
        paymentBackground.setBounds(0, -60, 830, 720);
    }

    public JPanel returnPaymentPage() {
        initComponents();
        return paymentPagePanel;
    }
    JPanel paymentPagePanel = new JPanel();
    private javax.swing.JButton tenTip;
    private javax.swing.JButton twentyTip;
    private javax.swing.JButton thirtyTip;
    private javax.swing.JButton backButton;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JLabel paymentBackground;
    private javax.swing.JTextField cardNum;
    private javax.swing.JTextField expDate;
    private javax.swing.JTextField securityCode;
    private javax.swing.JTextField customTip;

}
