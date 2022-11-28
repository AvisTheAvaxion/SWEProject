import javax.swing.*;

public class ticketPage extends JFrame {


    public ticketPage() {
        returnTicketPage();
    }
    
    @SuppressWarnings("unchecked")

    private void initComponents() {

        orderTextLabel = new javax.swing.JLabel();
        thankYouTextLabel = new javax.swing.JLabel();
        mainPageButton = new javax.swing.JButton();
        orderPageButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketInfo = new javax.swing.JTextArea();
        ticketBackground = new javax.swing.JLabel();

        ticketPagePanel.setLayout(null);

        orderTextLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 24));
        orderTextLabel.setText("Your Order Is:");
        ticketPagePanel.add(orderTextLabel);
        orderTextLabel.setBounds(190, 160, 240, 25);

        thankYouTextLabel.setFont(new java.awt.Font("Gill Sans MT", 3, 30));
        thankYouTextLabel.setForeground(new java.awt.Color(144, 0, 0));
        thankYouTextLabel.setText("THANK YOU!");
        ticketPagePanel.add(thankYouTextLabel);
        thankYouTextLabel.setBounds(260, 500, 250, 35);

        mainPageButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        mainPageButton.setForeground(new java.awt.Color(144, 0, 0));
        mainPageButton.setText("Go to Main");

        ticketPagePanel.add(mainPageButton);
        mainPageButton.setBounds(10, 540, 130, 30);

        orderPageButton.setFont(new java.awt.Font("Segoe UI", 1, 14));
        orderPageButton.setForeground(new java.awt.Color(144, 0, 0));
        orderPageButton.setText("Go to Order");

        ticketPagePanel.add(orderPageButton);
        orderPageButton.setBounds(560, 540, 130, 30);

        ticketInfo.setColumns(20);
        ticketInfo.setFont(new java.awt.Font("Segoe UI", 2, 18));
        ticketInfo.setForeground(new java.awt.Color(102, 102, 102));
        ticketInfo.setRows(5);
        ticketInfo.setText("....");
        jScrollPane1.setViewportView(ticketInfo);

        ticketPagePanel.add(jScrollPane1);
        jScrollPane1.setBounds(180, 200, 322, 135);

        ticketBackground.setIcon(new javax.swing.ImageIcon("momPop_Background11.png"));
        ticketPagePanel.add(ticketBackground);
        ticketBackground.setBounds(0, -10, 790, 610);
    }

    public JPanel returnTicketPage() {
        initComponents();
        return ticketPagePanel;
    }
    JPanel ticketPagePanel = new JPanel();
    private javax.swing.JButton mainPageButton;
    private javax.swing.JButton orderPageButton;
    private javax.swing.JLabel orderTextLabel;
    private javax.swing.JLabel ticketBackground;
    private javax.swing.JLabel thankYouTextLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ticketInfo;

}
