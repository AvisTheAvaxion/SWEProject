import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPage extends JFrame{


    public mainPage() {
        returnMainPage();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        menu = new javax.swing.JButton();
        order = new javax.swing.JButton();
        aboutUs = new javax.swing.JButton();
        login = new javax.swing.JButton();
        yourAcc = new javax.swing.JButton();
        pizzaBuilder = new javax.swing.JButton();
        seeMore = new javax.swing.JButton();
        mainBackground = new javax.swing.JLabel();

        mainPagePanel.setLayout(null);

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setFont(new java.awt.Font("Segoe UI", 0, 14));
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("Menu");


        /* menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        }); */

        mainPagePanel.add(menu);
        menu.setBounds(220, 170, 90, 30);

        order.setBackground(new java.awt.Color(0, 0, 0));
        order.setFont(new java.awt.Font("Segoe UI", 0, 14));
        order.setForeground(new java.awt.Color(255, 255, 255));
        order.setText("Order");
        mainPagePanel.add(order);
        order.setBounds(330, 170, 90, 30);

        aboutUs.setBackground(new java.awt.Color(0, 0, 0));
        aboutUs.setFont(new java.awt.Font("Segoe UI", 0, 14));
        aboutUs.setForeground(new java.awt.Color(255, 255, 255));
        aboutUs.setText("About Us");
        mainPagePanel.add(aboutUs);
        aboutUs.setBounds(440, 170, 108, 30);

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Segoe UI", 0, 14));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");

        mainPagePanel.add(login);
        login.setBounds(570, 170, 108, 30);

        yourAcc.setBackground(new java.awt.Color(144, 0, 0));
        yourAcc.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18));
        yourAcc.setForeground(new java.awt.Color(255, 255, 255));
        yourAcc.setText("Your Account");
        yourAcc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        mainPagePanel.add(yourAcc);
        yourAcc.setBounds(210, 220, 180, 60);

        pizzaBuilder.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18));
        pizzaBuilder.setForeground(new java.awt.Color(144, 0, 0));
        pizzaBuilder.setText("Go to Pizza Builder");
        pizzaBuilder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        mainPagePanel.add(pizzaBuilder);
        pizzaBuilder.setBounds(410, 220, 220, 60);

        seeMore.setFont(new java.awt.Font("Gill Sans MT", 1, 18));
        seeMore.setForeground(new java.awt.Color(144, 0, 0));
        seeMore.setText("See More>>");
        seeMore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

        mainPagePanel.add(seeMore);
        seeMore.setBounds(200, 310, 120, 35);

        mainBackground.setIcon(new javax.swing.ImageIcon("momPop_Background1.png"));

        mainPagePanel.add(mainBackground);
        mainBackground.setBounds(0, -10, 700, 610);


    }


    /* private void menuActionPerformed(java.awt.event.ActionEvent evt) {
        app.setPage(menuPage);

    } */

    public JPanel returnMainPage() {
        initComponents();
        return mainPagePanel;
    }

    JPanel mainPagePanel = new JPanel();
    private javax.swing.JButton seeMore;
    private javax.swing.JButton pizzaBuilder;
    private javax.swing.JButton yourAcc;
    private javax.swing.JButton menu;
    private javax.swing.JButton order;
    private javax.swing.JButton aboutUs;
    private javax.swing.JButton login;
    private javax.swing.JLabel mainBackground;


}
