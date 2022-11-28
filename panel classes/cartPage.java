import javax.swing.*;
public class cartPage extends JFrame {


    public cartPage() {
        returnCartPage();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        checkoutButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        pizzaBuilderButton = new javax.swing.JButton();
        drinksButton = new javax.swing.JButton();
        sidesButton = new javax.swing.JButton();
        pizzaText = new javax.swing.JLabel();
        toppingText = new javax.swing.JLabel();
        sideText = new javax.swing.JLabel();
        drinkText = new javax.swing.JLabel();
        pizzaPriceText = new javax.swing.JLabel();
        toppingPriceText = new javax.swing.JLabel();
        sidePriceText = new javax.swing.JLabel();
        drinkPriceText = new javax.swing.JLabel();
        subTotalText = new javax.swing.JLabel();
        subTotal = new javax.swing.JLabel();
        tax = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        cartBackground = new javax.swing.JLabel();

        cartPagePanel.setLayout(null);

        checkoutButton.setBackground(new java.awt.Color(144, 0, 0));
        checkoutButton.setFont(new java.awt.Font("Segoe UI", 1, 16));
        checkoutButton.setForeground(new java.awt.Color(255, 255, 255));
        checkoutButton.setText("Continue to Checkout");
        cartPagePanel.add(checkoutButton);
        checkoutButton.setBounds(470, 270, 220, 50);

        mainMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 16));
        mainMenuButton.setForeground(new java.awt.Color(144, 0, 0));
        mainMenuButton.setText("Go to Main Menu");
        cartPagePanel.add(mainMenuButton);
        mainMenuButton.setBounds(470, 330, 220, 50);

        pizzaBuilderButton.setBackground(new java.awt.Color(255, 255, 204));
        pizzaBuilderButton.setFont(new java.awt.Font("Segoe UI", 1, 16));
        pizzaBuilderButton.setForeground(new java.awt.Color(144, 0, 0));
        pizzaBuilderButton.setText("Go to Pizza Builder");
        cartPagePanel.add(pizzaBuilderButton);
        pizzaBuilderButton.setBounds(470, 390, 220, 50);

        drinksButton.setBackground(new java.awt.Color(255, 255, 204));
        drinksButton.setFont(new java.awt.Font("Segoe UI", 1, 16));
        drinksButton.setForeground(new java.awt.Color(144, 0, 0));
        drinksButton.setText("Go to Drinks");
        cartPagePanel.add(drinksButton);
        drinksButton.setBounds(470, 460, 220, 50);

        sidesButton.setBackground(new java.awt.Color(255, 255, 204));
        sidesButton.setFont(new java.awt.Font("Segoe UI", 1, 16));
        sidesButton.setForeground(new java.awt.Color(144, 0, 0));
        sidesButton.setText("Go to Sides");
        cartPagePanel.add(sidesButton);
        sidesButton.setBounds(470, 520, 220, 50);

        pizzaText.setBackground(new java.awt.Color(0, 0, 0));
        pizzaText.setFont(new java.awt.Font("SansSerif", 0, 18));
        pizzaText.setForeground(new java.awt.Color(144, 0, 0));
        pizzaText.setText("");
        cartPagePanel.add(pizzaText);
        pizzaText.setBounds(40, 170, 270, 30);

        toppingText.setFont(new java.awt.Font("SansSerif", 0, 18));
        toppingText.setForeground(new java.awt.Color(144, 0, 0));
        toppingText.setText("");
        cartPagePanel.add(toppingText);
        toppingText.setBounds(40, 210, 280, 40);

        sideText.setFont(new java.awt.Font("SansSerif", 0, 18));
        sideText.setForeground(new java.awt.Color(144, 0, 0));
        sideText.setText("");
        cartPagePanel.add(sideText);
        sideText.setBounds(40, 250, 280, 40);

        drinkText.setFont(new java.awt.Font("SansSerif", 0, 18));
        drinkText.setForeground(new java.awt.Color(144, 0, 0));
        drinkText.setText("");
        cartPagePanel.add(drinkText);
        drinkText.setBounds(40, 300, 260, 40);

        pizzaPriceText.setFont(new java.awt.Font("SansSerif", 2, 18));
        pizzaPriceText.setForeground(new java.awt.Color(144, 0, 0));
        pizzaPriceText.setText("$");
        cartPagePanel.add(pizzaPriceText);
        pizzaPriceText.setBounds(350, 170, 90, 24);

        toppingPriceText.setFont(new java.awt.Font("SansSerif", 2, 18));
        toppingPriceText.setForeground(new java.awt.Color(144, 0, 0));
        toppingPriceText.setText("$");
        cartPagePanel.add(toppingPriceText);
        toppingPriceText.setBounds(350, 210, 90, 24);

        sidePriceText.setFont(new java.awt.Font("SansSerif", 2, 18));
        sidePriceText.setForeground(new java.awt.Color(144, 0, 0));
        sidePriceText.setText("$");
        cartPagePanel.add(sidePriceText);
        sidePriceText.setBounds(350, 260, 90, 24);

        drinkPriceText.setFont(new java.awt.Font("SansSerif", 2, 18));
        drinkPriceText.setForeground(new java.awt.Color(144, 0, 0));
        drinkPriceText.setText("$");
        cartPagePanel.add(drinkPriceText);
        drinkPriceText.setBounds(350, 310, 45, 24);

        subTotalText.setFont(new java.awt.Font("SansSerif", 3, 18));
        subTotalText.setForeground(new java.awt.Color(144, 0, 0));
        subTotalText.setText("$");
        cartPagePanel.add(subTotalText);
        subTotalText.setBounds(350, 460, 80, 24);

        subTotal.setFont(new java.awt.Font("Segoe UI", 1, 16));
        subTotal.setText("$");
        cartPagePanel.add(subTotal);
        subTotal.setBounds(600, 140, 65, 25);

        tax.setFont(new java.awt.Font("Segoe UI", 1, 16));
        tax.setText("$");
        cartPagePanel.add(tax);
        tax.setBounds(600, 180, 59, 22);

        total.setFont(new java.awt.Font("Segoe UI", 1, 15));
        total.setText("$");
        cartPagePanel.add(total);
        total.setBounds(600, 220, 59, 22);

        cartBackground.setIcon(new javax.swing.ImageIcon("momPop_Background9.png"));
        cartPagePanel.add(cartBackground);
        cartBackground.setBounds(0, -10, 770, 610);
    }

    public JPanel returnCartPage() {
        initComponents();
        return cartPagePanel;
    }
    JPanel cartPagePanel = new JPanel();
    private javax.swing.JButton checkoutButton;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton pizzaBuilderButton;
    private javax.swing.JButton drinksButton;
    private javax.swing.JButton sidesButton;
    private javax.swing.JLabel pizzaText;
    private javax.swing.JLabel subTotal;
    private javax.swing.JLabel tax;
    private javax.swing.JLabel total;
    private javax.swing.JLabel cartBackground;
    private javax.swing.JLabel toppingText;
    private javax.swing.JLabel sideText;
    private javax.swing.JLabel drinkText;
    private javax.swing.JLabel pizzaPriceText;
    private javax.swing.JLabel toppingPriceText;
    private javax.swing.JLabel sidePriceText;
    private javax.swing.JLabel drinkPriceText;
    private javax.swing.JLabel subTotalText;

}