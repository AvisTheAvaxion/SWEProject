import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Webpages extends JFrame{

	//PANELS
	JFrame frame = new JFrame("Mom and Pop's Pizzeria");
	JPanel mainPagePanel = new JPanel();
	JPanel menuPagePanel = new JPanel();
	JPanel aboutUsPagePanel = new JPanel();
	JPanel accountInfoPagePanel = new JPanel();
	JPanel cartPagePanel = new JPanel();
	JPanel createAccountPagePanel = new JPanel();
	JPanel drinksPagePanel = new JPanel();
	JPanel loginPagePanel = new JPanel();
	JPanel paymentPagePanel = new JPanel();
	JPanel pickSizePagePanel = new JPanel();
	JPanel pizzaBuilderPagePanel = new JPanel();
	JPanel sidesPagePanel = new JPanel();
	JPanel ticketPagePanel = new JPanel();
	JPanel toppingsPagePanel = new JPanel();



	//ALL PAGES + FRAME
   Webpages(){

	   //-----------------------------------------------------------------------
	   //MAIN PAGE

	   JButton menuPageButton = new JButton();
	   JButton orderPageButton = new JButton();
	   JButton aboutUsButton = new JButton();
	   JButton accountButton = new JButton();
	   JButton yourAccButton = new JButton();
	   JButton pizzaBuilderButton = new JButton();
	   JButton seeMoreButton = new JButton();
	   JLabel mainBackground = new JLabel();

	   mainPagePanel.setLayout(null);

	   menuPageButton.setBackground(new java.awt.Color(0, 0, 0));
	   menuPageButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   menuPageButton.setForeground(new java.awt.Color(255, 255, 255));
	   menuPageButton.setText("Menu");

	   //button click
	  menuPageButton.addActionListener( new ActionListener() {
	   @Override
	   public void actionPerformed(ActionEvent arg0) {
		 frame.setContentPane(menuPagePanel);
		  menuPagePanel.revalidate();
			  }
		});


	   mainPagePanel.add(menuPageButton);
	   menuPageButton.setBounds(220, 170, 90, 30);


	   orderPageButton.setBackground(new java.awt.Color(0, 0, 0));
	   orderPageButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   orderPageButton.setForeground(new java.awt.Color(255, 255, 255));
	   orderPageButton.setText("Order");

		//button click
		 orderPageButton.addActionListener( new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent arg0) {
		  frame.setContentPane(pizzaBuilderPagePanel);
		  pizzaBuilderPagePanel.revalidate();
		   }
		 });

	   mainPagePanel.add(orderPageButton);
	   orderPageButton.setBounds(320, 170, 108, 30);

	   aboutUsButton.setBackground(new java.awt.Color(0, 0, 0));
	   aboutUsButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   aboutUsButton.setForeground(new java.awt.Color(255, 255, 255));
	   aboutUsButton.setText("About Us");

			//button click
			 aboutUsButton.addActionListener( new ActionListener() {
			  @Override
			public void actionPerformed(ActionEvent arg0) {
			   frame.setContentPane(aboutUsPagePanel);
			   aboutUsPagePanel.revalidate();
			   }
		  });


	   mainPagePanel.add(aboutUsButton);
	   aboutUsButton.setBounds(440, 170, 108, 30);

	   accountButton.setBackground(new java.awt.Color(0, 0, 0));
	   accountButton.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   accountButton.setForeground(new java.awt.Color(255, 255, 255));
	   accountButton.setText("Account");

	   //button click
	   accountButton.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		 frame.setContentPane(loginPagePanel);
		 loginPagePanel.revalidate();}
	   });

	   mainPagePanel.add(accountButton);
	   accountButton.setBounds(570, 170, 108, 30);

	   yourAccButton.setBackground(new java.awt.Color(144, 0, 0));
	   yourAccButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18));
	   yourAccButton.setForeground(new java.awt.Color(255, 255, 255));
	   yourAccButton.setText("Your Account");
	   yourAccButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

		//button click
		yourAccButton.addActionListener( new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent arg0) {
		   frame.setContentPane(loginPagePanel);
		   loginPagePanel.revalidate();}
		});


	   mainPagePanel.add(yourAccButton);
	   yourAccButton.setBounds(210, 220, 180, 60);

	   pizzaBuilderButton.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18));
	   pizzaBuilderButton.setForeground(new java.awt.Color(144, 0, 0));
	   pizzaBuilderButton.setText("Go to Pizza Builder");
	   pizzaBuilderButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

		//button click
	   pizzaBuilderButton.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  frame.setContentPane(pizzaBuilderPagePanel);
		 pizzaBuilderPagePanel.revalidate();}
		});

	   mainPagePanel.add(pizzaBuilderButton);
	   pizzaBuilderButton.setBounds(410, 220, 220, 60);

	   seeMoreButton.setFont(new java.awt.Font("Gill Sans MT", 1, 18));
	   seeMoreButton.setForeground(new java.awt.Color(144, 0, 0));
	   seeMoreButton.setText("See More>>");
	   seeMoreButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   //button click
	   seeMoreButton.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		 frame.setContentPane(menuPagePanel);
		 menuPagePanel.revalidate();
		 }
		 });

	   mainPagePanel.add(seeMoreButton);
	   seeMoreButton.setBounds(200, 310, 120, 35);

	   mainBackground.setIcon(new javax.swing.ImageIcon("momPop_Background1.png"));

	   mainPagePanel.add(mainBackground);
	   mainBackground.setBounds(0, -10, 700, 610);

	   //-----------------------------------------------------------------------------
	   //MENU PAGE

	  JButton mainPageButton2 = new JButton();
	  JButton orderPageButton2 = new JButton();
	  JButton aboutUsButton2 = new JButton();
	  JButton accountButton2 = new JButton();
	  JLabel menuBackground = new JLabel();


	  menuPagePanel.setLayout(null);

	   mainPageButton2.setBackground(new java.awt.Color(144, 0, 0));
	   mainPageButton2.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   mainPageButton2.setForeground(new java.awt.Color(255, 255, 255));
	   mainPageButton2.setText("Main Page");

	   mainPageButton2.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  frame.setContentPane(mainPagePanel);
		 mainPagePanel.revalidate();
			 }
		 });

	   menuPagePanel.add(mainPageButton2);
	  mainPageButton2.setBounds(30, 30, 120, 32);

	  orderPageButton2.setBackground(new java.awt.Color(144, 0, 0));
	  orderPageButton2.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	  orderPageButton2.setForeground(new java.awt.Color(255, 255, 255));
	  orderPageButton2.setText("Order Page");

	   //button click
	   orderPageButton2.addActionListener( new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent arg0) {
		  frame.setContentPane(pizzaBuilderPagePanel);
		  pizzaBuilderPagePanel.revalidate();}
		 });

	  menuPagePanel.add(orderPageButton2);
	  orderPageButton2.setBounds(180, 30, 160, 32);

	  aboutUsButton2.setBackground(new java.awt.Color(144, 0, 0));
	  aboutUsButton2.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	  aboutUsButton2.setForeground(new java.awt.Color(255, 255, 255));
	  aboutUsButton2.setText("About Us");

	  //button click
	  aboutUsButton2.addActionListener( new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent arg0) {
	  frame.setContentPane(aboutUsPagePanel);
	  aboutUsPagePanel.revalidate();}
	  });


	  menuPagePanel.add(aboutUsButton2);
	  aboutUsButton2.setBounds(360, 30, 140, 32);

	  accountButton2.setBackground(new java.awt.Color(144, 0, 0));
	  accountButton2.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	  accountButton2.setForeground(new java.awt.Color(255, 255, 255));
	  accountButton2.setText("Account");

	 //button click
	  accountButton2.addActionListener( new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent arg0) {
		frame.setContentPane(loginPagePanel);
		loginPagePanel.revalidate();}
	   });

	  menuPagePanel.add(accountButton2);
	  accountButton2.setBounds(530, 30, 108, 32);

	  menuBackground.setIcon(new javax.swing.ImageIcon("momPop_Background2.png"));

	  menuPagePanel.add(menuBackground);
	  menuBackground.setBounds(0, 0, 700, 590);

	  //------------------------------------------------------------------------------
	   //ABOUT US PAGE

	   JButton mainPageButton3 = new JButton();
	   JButton orderPageButton3 = new JButton();
	   JButton aboutUsPageButton3 = new JButton();
	   JButton accountButton3 = new JButton();
	   JLabel aboutBackground = new JLabel();

	   aboutUsPagePanel.setLayout(null);

	   mainPageButton3.setBackground(new java.awt.Color(144, 0, 0));
	   mainPageButton3.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   mainPageButton3.setForeground(new java.awt.Color(255, 255, 255));
	   mainPageButton3.setText("Main Page");

	  //button click
	  mainPageButton3.addActionListener( new ActionListener() {
	  @Override
	  public void actionPerformed(ActionEvent arg0) {
		 frame.setContentPane(mainPagePanel);
		 mainPagePanel.revalidate();}
	   });

	   aboutUsPagePanel.add(mainPageButton3);
	   mainPageButton3.setBounds(40, 30, 120, 32);

	   orderPageButton3.setBackground(new java.awt.Color(144, 0, 0));
	   orderPageButton3.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   orderPageButton3.setForeground(new java.awt.Color(255, 255, 255));
	   orderPageButton3.setText("Order Page");

       //button click
       orderPageButton3.addActionListener( new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent arg0) {
         frame.setContentPane(pizzaBuilderPagePanel);
         pizzaBuilderPagePanel.revalidate();}
       });

	   aboutUsPagePanel.add(orderPageButton3);
	   orderPageButton3.setBounds(190, 30, 160, 32);

	   aboutUsPageButton3.setBackground(new java.awt.Color(144, 0, 0));
	   aboutUsPageButton3.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   aboutUsPageButton3.setForeground(new java.awt.Color(255, 255, 255));
	   aboutUsPageButton3.setText("About Us");

       //already on this page so no actionlistener

	   aboutUsPagePanel.add(aboutUsPageButton3);
	   aboutUsPageButton3.setBounds(380, 30, 140, 32);

	   accountButton3.setBackground(new java.awt.Color(144, 0, 0));
	   accountButton3.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   accountButton3.setForeground(new java.awt.Color(255, 255, 255));
	   accountButton3.setText("Account");

      //button click
       accountButton3.addActionListener( new ActionListener() {
       @Override
        public void actionPerformed(ActionEvent arg0) {
         frame.setContentPane(loginPagePanel);
         loginPagePanel.revalidate();}
       });

	   aboutUsPagePanel.add(accountButton3);
	   accountButton3.setBounds(550, 30, 108, 32);

	   aboutBackground.setIcon(new javax.swing.ImageIcon("momPop_Background3.png"));

	   aboutUsPagePanel.add(aboutBackground);
	   aboutBackground.setBounds(0, 0, 700, 600);

	   //-----------------------------------------------------------------------------
	   //PIZZA BUILDER PAGE

	   JButton menuButton4 = new JButton();
	   JButton orderButton4 = new JButton();
	   JButton aboutButton4 = new JButton();
	   JButton accountButton4 = new JButton();
	   JButton  continueButton4 = new JButton();
	   JButton backButton4 = new JButton();
	   JCheckBox thinCheck = new JCheckBox();
	   JCheckBox regularCheck = new JCheckBox();
	   JCheckBox panCheck = new JCheckBox();
	   JLabel builderBackground = new JLabel();

	   pizzaBuilderPagePanel.setLayout(null);

	   menuButton4.setBackground(new java.awt.Color(0, 0, 0));
	   menuButton4.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   menuButton4.setForeground(new java.awt.Color(255, 255, 255));
	   menuButton4.setText("Menu");

       //click button
       menuButton4.addActionListener( new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent arg0) {
         frame.setContentPane(menuPagePanel);
         menuPagePanel.revalidate();
          }
       });

	   pizzaBuilderPagePanel.add(menuButton4);
	   menuButton4.setBounds(220, 170, 90, 30);


	   orderButton4.setBackground(new java.awt.Color(0, 0, 0));
	   orderButton4.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   orderButton4.setForeground(new java.awt.Color(255, 255, 255));
	   orderButton4.setText("Order");

       //already on pizza builder page, so no action listener

	   pizzaBuilderPagePanel.add(orderButton4);
	   orderButton4.setBounds(330, 170, 90, 30);

	   aboutButton4.setBackground(new java.awt.Color(0, 0, 0));
	   aboutButton4.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   aboutButton4.setForeground(new java.awt.Color(255, 255, 255));
	   aboutButton4.setText("About Us");

       //click button
       aboutButton4.addActionListener( new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent arg0) {
         frame.setContentPane(aboutUsPagePanel);
         aboutUsPagePanel.revalidate();
        }
       });

	   pizzaBuilderPagePanel.add(aboutButton4);
	   aboutButton4.setBounds(440, 170, 108, 30);

	   accountButton4.setBackground(new java.awt.Color(0, 0, 0));
	   accountButton4.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   accountButton4.setForeground(new java.awt.Color(255, 255, 255));
	   accountButton4.setText("Account");

       //click button
      aboutButton4.addActionListener( new ActionListener() {
       @Override
      public void actionPerformed(ActionEvent arg0) {
      frame.setContentPane(aboutUsPagePanel);
      aboutUsPagePanel.revalidate();}
      });


	   pizzaBuilderPagePanel.add(accountButton4);
	   accountButton4.setBounds(570, 170, 108, 30);

	   continueButton4.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   continueButton4.setForeground(new java.awt.Color(144, 0, 0));
	   continueButton4.setText("Continue");
	   continueButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(144, 0, 0), 2, true));

     //click button
     continueButton4.addActionListener( new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent arg0) {
       frame.setContentPane(pickSizePagePanel);
       pickSizePagePanel.revalidate();}
      });

	   pizzaBuilderPagePanel.add(continueButton4);
	   continueButton4.setBounds(140, 490, 170, 60);

	   backButton4.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   backButton4.setForeground(new java.awt.Color(144, 0, 0));
	   backButton4.setText("Back to Main");
	   backButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

     //click button
      backButton4.addActionListener( new ActionListener() {
       @Override
      public void actionPerformed(ActionEvent arg0) {
      frame.setContentPane(mainPagePanel);
      mainPagePanel.revalidate();}
        });

	   pizzaBuilderPagePanel.add(backButton4);
	   backButton4.setBounds(360, 490, 190, 60);

	   thinCheck.setBackground(new java.awt.Color(144, 0, 0));
	   thinCheck.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 28));
	   thinCheck.setForeground(new java.awt.Color(255, 255, 255));
	   thinCheck.setText("Thin");

      //check
      thinCheck.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
       //to add
          }
       });

	   pizzaBuilderPagePanel.add(thinCheck);
	   thinCheck.setBounds(90, 360, 130, 80);

	   regularCheck.setBackground(new java.awt.Color(144, 0, 0));
	   regularCheck.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 28));
	   regularCheck.setForeground(new java.awt.Color(255, 255, 255));
	   regularCheck.setText("Regular");
	   regularCheck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

     //check
     regularCheck.addActionListener( new ActionListener() {
     @Override
      public void actionPerformed(ActionEvent arg0) {
      //to add
      }
     });

	   pizzaBuilderPagePanel.add(regularCheck);
	   regularCheck.setBounds(260, 360, 190, 80);

	   panCheck.setBackground(new java.awt.Color(144, 0, 0));
	   panCheck.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 28));
	   panCheck.setForeground(new java.awt.Color(255, 255, 255));
	   panCheck.setText("Pan");

     //check
     panCheck.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
      //to add
        }
      });

	   pizzaBuilderPagePanel.add(panCheck);
	   panCheck.setBounds(490, 360, 120, 80);

	   builderBackground.setIcon(new javax.swing.ImageIcon("momPop_Background4.png"));
	   pizzaBuilderPagePanel.add(builderBackground);
	   builderBackground.setBounds(0, 0, 770, 590);

	   //-----------------------------------------------------------------------------
	   //PICK SIZE PAGE

	   JButton menuButton5 = new JButton();
	   JButton orderButton5 = new JButton();
	   JButton aboutButton5 = new JButton();
	   JButton accountButton5 = new JButton();
	   JButton continueButton5 = new JButton();
	   JButton backButton5 = new JButton();
	   JCheckBox smallCheck = new JCheckBox();
	   JCheckBox mediumCheck = new JCheckBox();
	   JCheckBox  largeCheck = new JCheckBox();
	   JCheckBox xLargeCheck = new JCheckBox();
	   JLabel pizzaSizeBackground = new JLabel();

	   pickSizePagePanel.setLayout(null);

	   menuButton5.setBackground(new java.awt.Color(144, 0, 0));
	   menuButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   menuButton5.setForeground(new java.awt.Color(255, 255, 255));
	   menuButton5.setText("Menu");

     //click button
      menuButton5.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        frame.setContentPane(menuPagePanel);
        menuPagePanel.revalidate();}
       });

	   pickSizePagePanel.add(menuButton5);
	   menuButton5.setBounds(40, 40, 108, 32);

	   orderButton5.setBackground(new java.awt.Color(144, 0, 0));
	   orderButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   orderButton5.setForeground(new java.awt.Color(255, 255, 255));
	   orderButton5.setText("Order Page");

       //click button
      orderButton5.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
      frame.setContentPane(pizzaBuilderPagePanel);
      pizzaBuilderPagePanel.revalidate();}
      });

	   pickSizePagePanel.add(orderButton5);
	   orderButton5.setBounds(190, 40, 160, 32);

	   aboutButton5.setBackground(new java.awt.Color(144, 0, 0));
	   aboutButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   aboutButton5.setForeground(new java.awt.Color(255, 255, 255));
	   aboutButton5.setText("About Us");

     //click button
     aboutButton5.addActionListener( new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent arg0) {
       frame.setContentPane(aboutUsPagePanel);
       aboutUsPagePanel.revalidate();}
      });


	   pickSizePagePanel.add(aboutButton5);
	   aboutButton5.setBounds(380, 40, 140, 32);

	   accountButton5.setBackground(new java.awt.Color(144, 0, 0));
	   accountButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   accountButton5.setForeground(new java.awt.Color(255, 255, 255));
	   accountButton5.setText("Account");

      //click button
      accountButton5.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        frame.setContentPane(loginPagePanel);
        loginPagePanel.revalidate();
         }
       });


	   pickSizePagePanel.add(accountButton5);
	   accountButton5.setBounds(550, 40, 108, 32);

	   continueButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   continueButton5.setForeground(new java.awt.Color(144, 0, 0));
	   continueButton5.setText("Continue");
	   continueButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

      //click button
      continueButton5.addActionListener( new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent arg0) {
       frame.setContentPane(toppingsPagePanel);
       toppingsPagePanel.revalidate(); }
       });


	   pickSizePagePanel.add(continueButton5);
	   continueButton5.setBounds(150, 500, 180, 60);

	   backButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   backButton5.setForeground(new java.awt.Color(144, 0, 0));
	   backButton5.setText("Go Back");
	   backButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

     //click button
      backButton5.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
      frame.setContentPane(pizzaBuilderPagePanel);
      pizzaBuilderPagePanel.revalidate(); }
      });

	   pickSizePagePanel.add(backButton5);
	   backButton5.setBounds(350, 500, 170, 60);


      //small check
      smallCheck.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
      //to add
        }
       });

	   pickSizePagePanel.add(smallCheck);
	   smallCheck.setBounds(90, 420, 40, 29);


     //medium check
      mediumCheck.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
      //to add
        }
      });

	   pickSizePagePanel.add(mediumCheck);
	   mediumCheck.setBounds(210, 420, 40, 29);

    //large check
     largeCheck.addActionListener( new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
         //to add
          }
       });


	   pickSizePagePanel.add(largeCheck);
	   largeCheck.setBounds(370, 420, 40, 29);

    //xlarge check
      xLargeCheck.addActionListener( new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
         //to add
         }
       });

	   pickSizePagePanel.add(xLargeCheck);
	   xLargeCheck.setBounds(550, 420, 40, 29);



	   pizzaSizeBackground.setIcon(new javax.swing.ImageIcon("momPop_Background5.png"));

	   pickSizePagePanel.add(pizzaSizeBackground);
	   pizzaSizeBackground.setBounds(0, 0, 700, 610);

	   //-----------------------------------------------------------------------------
	   //TOPPINGS PAGE

	   JButton menuButton6 = new JButton();
	   JButton orderButton6 = new JButton();
	   JButton aboutButton6 = new JButton();
	   JButton accountButton6 = new JButton();
	   JButton continueButton6 = new JButton();
	   JButton backButton6 = new JButton();
	   JCheckBox cheeseCheck = new JCheckBox();
	   JCheckBox pepperoniCheck = new JCheckBox();
	   JCheckBox  sausageCheck = new JCheckBox();
	   JCheckBox  hamCheck = new JCheckBox();
	   JCheckBox greenPepperCheck = new JCheckBox();
	   JCheckBox onionCheck = new JCheckBox();
	   JCheckBox mushroomCheck = new JCheckBox();
	   JCheckBox tomatoCheck = new JCheckBox();
	   JCheckBox pineappleCheck = new JCheckBox();
	   JLabel toppingsBackground = new JLabel();

	   toppingsPagePanel.setLayout(null);

	   menuButton6.setBackground(new java.awt.Color(144, 0, 0));
	   menuButton6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
	   menuButton6.setForeground(new java.awt.Color(255, 255, 255));
	   menuButton6.setText("Menu");

      //click button
      menuButton6.addActionListener( new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent arg0) {
        frame.setContentPane(menuPagePanel);
         menuPagePanel.revalidate();}
      });


	   toppingsPagePanel.add(menuButton6);
	   menuButton6.setBounds(40, 40, 108, 32);

	   orderButton6.setBackground(new java.awt.Color(144, 0, 0));
	   orderButton6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
	   orderButton6.setForeground(new java.awt.Color(255, 255, 255));
	   orderButton6.setText("Order Page");

     //click button
     orderButton6.addActionListener( new ActionListener() {
     @Override
      public void actionPerformed(ActionEvent arg0) {
       frame.setContentPane(pizzaBuilderPagePanel);
       pizzaBuilderPagePanel.revalidate();}
      });



	   toppingsPagePanel.add(orderButton6);
	   orderButton6.setBounds(190, 40, 160, 32);

	   aboutButton6.setBackground(new java.awt.Color(144, 0, 0));
	   aboutButton6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
	   aboutButton6.setForeground(new java.awt.Color(255, 255, 255));
	   aboutButton6.setText("About Us");

      //click button
      aboutButton6.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
         frame.setContentPane(aboutUsPagePanel);
         aboutUsPagePanel.revalidate();}
      });


	   toppingsPagePanel.add(aboutButton6);
	   aboutButton6.setBounds(380, 40, 140, 32);

	   accountButton6.setBackground(new java.awt.Color(144, 0, 0));
	   accountButton6.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
	   accountButton6.setForeground(new java.awt.Color(255, 255, 255));
	   accountButton6.setText("Account");

      //click button
      accountButton6.addActionListener( new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        frame.setContentPane(loginPagePanel);
        loginPagePanel.revalidate();}
       });


	   toppingsPagePanel.add(accountButton6);
	   accountButton6.setBounds(550, 40, 108, 32);

	   continueButton6.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
	   continueButton6.setForeground(new java.awt.Color(144, 0, 0));
	   continueButton6.setText("Continue");

     //click button
      continueButton6.addActionListener( new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent arg0) {
       frame.setContentPane(sidesPagePanel);
       sidesPagePanel.revalidate();}
      });


	   continueButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   toppingsPagePanel.add(continueButton6);
	   continueButton6.setBounds(160, 490, 180, 60);

	   backButton6.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
	   backButton6.setForeground(new java.awt.Color(144, 0, 0));
	   backButton6.setText("Go Back");
	   backButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   toppingsPagePanel.add(backButton6);
	   backButton6.setBounds(370, 490, 170, 60);

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

	   //----------------------------------------------------------------------------
	   //SIDES PAGE

	   JButton menuButton7 = new JButton();
	   JButton orderButton7 = new JButton();
	   JButton aboutButton7 = new JButton();
	   JButton accountButton7 = new JButton();
	   JButton continueButton7 = new JButton();
	   JButton backButton7 = new JButton();
	   JTextField breadsticksAmount = new JTextField();
	   JTextField  breadsticksBitesAmount = new JTextField();
	   JTextField cookieAmount = new JTextField();
	   JLabel sidesBackground = new JLabel();

	   sidesPagePanel.setLayout(null);

	   menuButton7.setBackground(new java.awt.Color(144, 0, 0));
	   menuButton7.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   menuButton7.setForeground(new java.awt.Color(255, 255, 255));
	   menuButton7.setText("Menu");
	   sidesPagePanel.add(menuButton7);
	   menuButton7.setBounds(40, 40, 108, 32);

	   orderButton7.setBackground(new java.awt.Color(144, 0, 0));
	   orderButton7.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   orderButton7.setForeground(new java.awt.Color(255, 255, 255));
	   orderButton7.setText("Order Page");

	   sidesPagePanel.add(orderButton7);
	   orderButton7.setBounds(190, 40, 160, 32);

	   aboutButton7.setBackground(new java.awt.Color(144, 0, 0));
	   aboutButton7.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   aboutButton7.setForeground(new java.awt.Color(255, 255, 255));
	   aboutButton7.setText("About Us");

	   sidesPagePanel.add(aboutButton7);
	   aboutButton7.setBounds(380, 40, 140, 32);

	   accountButton7.setBackground(new java.awt.Color(144, 0, 0));
	   accountButton7.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   accountButton7.setForeground(new java.awt.Color(255, 255, 255));
	   accountButton7.setText("Account");
	   sidesPagePanel.add(accountButton7);
	   accountButton7.setBounds(550, 40, 108, 32);

	   continueButton7.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   continueButton7.setForeground(new java.awt.Color(144, 0, 0));
	   continueButton7.setText("Continue");
	   continueButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   sidesPagePanel.add(continueButton7);
	   continueButton7.setBounds(140, 510, 180, 60);

	   backButton7.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   backButton7.setForeground(new java.awt.Color(144, 0, 0));
	   backButton7.setText("Go Back");
	   backButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   sidesPagePanel.add(backButton7);
	   backButton7.setBounds(380, 510, 170, 60);

	   breadsticksAmount.setText("#");

	   sidesPagePanel.add(breadsticksAmount);
	   breadsticksAmount.setBounds(100, 280, 90, 30);

	   breadsticksBitesAmount.setText("#");

	   sidesPagePanel.add(breadsticksBitesAmount);
	   breadsticksBitesAmount.setBounds(270, 440, 80, 35);

	   cookieAmount.setText("#");
	   sidesPagePanel.add(cookieAmount);
	   cookieAmount.setBounds(440, 280, 90, 35);

	   sidesBackground.setIcon(new javax.swing.ImageIcon("momPop_Background7.png"));
	   sidesPagePanel.add(sidesBackground);
	   sidesBackground.setBounds(0, 0, 710, 600);

	   //-----------------------------------------------------------------------------
	   //DRINKS PAGE

	   JButton menuButton8 = new JButton();
	   JButton orderButton8 = new JButton();
	   JButton aboutButton8 = new JButton();
	   JButton accountButton8 = new JButton();
	   JButton continueButton8 = new JButton();
	   JButton backButton8 = new JButton();
	   JTextField pepsiAmount = new JTextField();
	   JTextField orangeSodaAmount = new JTextField();
	   JTextField  sierraMistAmount = new JTextField();
	   JTextField  lemonadeAmount = new JTextField();
	   JTextField  rootBeerAmount = new JTextField();
	   JTextField  waterAmount = new JTextField();
	   JComboBox pepsiOptions = new JComboBox<>();
	   JComboBox orangeSodaOptions = new JComboBox<>();
	   JComboBox  sierraMistOptions = new JComboBox<>();
	   JComboBox lemonadeOptions = new JComboBox<>();
	   JComboBox rootBeerOptions = new JComboBox<>();
	   JComboBox waterOptions = new JComboBox<>();
	   JLabel drinksBackground = new JLabel();

	   drinksPagePanel.setLayout(null);

	   menuButton8.setBackground(new java.awt.Color(144, 0, 0));
	   menuButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   menuButton8.setForeground(new java.awt.Color(255, 255, 255));
	   menuButton8.setText("Menu");
	   drinksPagePanel.add(menuButton8);
	   menuButton8.setBounds(40, 40, 108, 32);

	   orderButton8.setBackground(new java.awt.Color(144, 0, 0));
	   orderButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   orderButton8.setForeground(new java.awt.Color(255, 255, 255));
	   orderButton8.setText("Order Page");

	   drinksPagePanel.add(orderButton8);
	   orderButton8.setBounds(190, 40, 160, 32);

	   aboutButton8.setBackground(new java.awt.Color(144, 0, 0));
	   aboutButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   aboutButton8.setForeground(new java.awt.Color(255, 255, 255));
	   aboutButton8.setText("About Us");

	   drinksPagePanel.add(aboutButton8);
	   aboutButton8.setBounds(380, 40, 140, 32);

	   accountButton8.setBackground(new java.awt.Color(144, 0, 0));
	   accountButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   accountButton8.setForeground(new java.awt.Color(255, 255, 255));
	   accountButton8.setText("Account");
	   drinksPagePanel.add(accountButton8);
	   accountButton8.setBounds(550, 40, 108, 32);

	   continueButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   continueButton8.setForeground(new java.awt.Color(144, 0, 0));
	   continueButton8.setText("Continue");
	   continueButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   drinksPagePanel.add(continueButton8);
	   continueButton8.setBounds(140, 530, 180, 60);

	   backButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
	   backButton8.setForeground(new java.awt.Color(144, 0, 0));
	   backButton8.setText("Go Back");
	   backButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   drinksPagePanel.add(backButton8);
	   backButton8.setBounds(370, 530, 170, 60);

	   pepsiAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   pepsiAmount.setText("");
	   drinksPagePanel.add(pepsiAmount);
	   pepsiAmount.setBounds(150, 220, 96, 30);

	   orangeSodaAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   orangeSodaAmount.setText("");
	   drinksPagePanel.add(orangeSodaAmount);
	   orangeSodaAmount.setBounds(420, 220, 100, 30);

	   sierraMistAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   sierraMistAmount.setText("");

	   drinksPagePanel.add(sierraMistAmount);
	   sierraMistAmount.setBounds(150, 360, 100, 30);

	   lemonadeAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   lemonadeAmount.setText("");

	   drinksPagePanel.add(lemonadeAmount);
	   lemonadeAmount.setBounds(420, 360, 100, 30);

	   rootBeerAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   rootBeerAmount.setText("");

	   drinksPagePanel.add(rootBeerAmount);
	   rootBeerAmount.setBounds(140, 460, 100, 30);

	   waterAmount.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   waterAmount.setText("");
	   drinksPagePanel.add(waterAmount);
	   waterAmount.setBounds(410, 470, 100, 30);

	   pepsiOptions.setBackground(new java.awt.Color(255, 255, 204));
	   pepsiOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   pepsiOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diet Small", "Diet Medium", "Diet Large", "Regular Small", "Regular Medium", "Regular Large" }));

	   drinksPagePanel.add(pepsiOptions);
	   pepsiOptions.setBounds(190, 170, 80, 40);

	   orangeSodaOptions.setBackground(new java.awt.Color(255, 255, 204));
	   orangeSodaOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   orangeSodaOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Diet Small", "Diet Medium", "Diet Large", "Regular Small", "Regular Medium", "Regular Large" }));
	   drinksPagePanel.add(orangeSodaOptions);
	   orangeSodaOptions.setBounds(460, 170, 80, 40);

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
	   rootBeerOptions.setBounds(180, 420, 75, 30);

	   waterOptions.setBackground(new java.awt.Color(255, 255, 204));
	   waterOptions.setFont(new java.awt.Font("Segoe UI", 0, 14));
	   waterOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large"}));
	   drinksPagePanel.add(waterOptions);
	   waterOptions.setBounds(450, 430, 70, 30);

	   drinksBackground.setIcon(new javax.swing.ImageIcon("momPop_Background8.png"));

	   drinksPagePanel.add(drinksBackground);
	   drinksBackground.setBounds(0, 0, 700, 600);

	   //-----------------------------------------------------------------------------
	   //CART PAGE

	   JButton checkoutButton9 = new JButton();
	   JButton mainMenuButton9 = new JButton();
	   JButton pizzaBuilderButton9 = new JButton();
	   JButton drinksButton9 = new JButton();
	   JButton sidesButton9 = new JButton();
	   JLabel pizzaText = new JLabel();
	   JLabel toppingText = new JLabel();
	   JLabel sideText = new JLabel();
	   JLabel  drinkText = new JLabel();
	   JLabel  pizzaPriceText = new JLabel();
	   JLabel  toppingPriceText = new JLabel();
	   JLabel sidePriceText = new JLabel();
	   JLabel drinkPriceText = new JLabel();
	   JLabel subTotalText = new JLabel();
	   JLabel subTotal = new JLabel();
	   JLabel tax = new JLabel();
	   JLabel total = new JLabel();
	   JLabel cartBackground = new JLabel();

	   cartPagePanel.setLayout(null);

	   checkoutButton9.setBackground(new java.awt.Color(144, 0, 0));
	   checkoutButton9.setFont(new java.awt.Font("Segoe UI", 1, 16));
	   checkoutButton9.setForeground(new java.awt.Color(255, 255, 255));
	   checkoutButton9.setText("Continue to Checkout");
	   cartPagePanel.add(checkoutButton9);
	   checkoutButton9.setBounds(470, 270, 220, 50);

	   mainMenuButton9.setFont(new java.awt.Font("Segoe UI", 1, 16));
	   mainMenuButton9.setForeground(new java.awt.Color(144, 0, 0));
	   mainMenuButton9.setText("Go to Main Menu");
	   cartPagePanel.add(mainMenuButton9);
	   mainMenuButton9.setBounds(470, 330, 220, 50);

	   pizzaBuilderButton9.setBackground(new java.awt.Color(255, 255, 204));
	   pizzaBuilderButton9.setFont(new java.awt.Font("Segoe UI", 1, 16));
	   pizzaBuilderButton9.setForeground(new java.awt.Color(144, 0, 0));
	   pizzaBuilderButton9.setText("Go to Pizza Builder");
	   cartPagePanel.add(pizzaBuilderButton9);
	   pizzaBuilderButton9.setBounds(470, 390, 220, 50);

	   drinksButton9.setBackground(new java.awt.Color(255, 255, 204));
	   drinksButton9.setFont(new java.awt.Font("Segoe UI", 1, 16));
	   drinksButton9.setForeground(new java.awt.Color(144, 0, 0));
	   drinksButton9.setText("Go to Drinks");
	   cartPagePanel.add(drinksButton9);
	   drinksButton9.setBounds(470, 460, 220, 50);

	   sidesButton9.setBackground(new java.awt.Color(255, 255, 204));
	   sidesButton9.setFont(new java.awt.Font("Segoe UI", 1, 16));
	   sidesButton9.setForeground(new java.awt.Color(144, 0, 0));
	   sidesButton9.setText("Go to Sides");
	   cartPagePanel.add(sidesButton9);
	   sidesButton9.setBounds(470, 520, 220, 50);

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

	   //-----------------------------------------------------------------------------
	   //PAYMENT PAGE

	   JButton tenTip = new JButton();
	   JButton twentyTip = new JButton();
	   JButton thirtyTip = new JButton();
	   JButton backButton10 = new JButton();
	   JButton placeOrderButton = new JButton();
	   JTextField cardNum = new JTextField();
	   JTextField expDate = new JTextField();
	   JTextField securityCode = new JTextField();
	   JTextField customTip = new JTextField();
	   JLabel paymentBackground = new JLabel();

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

	   backButton10.setFont(new java.awt.Font("Rockwell", 1, 24));
	   backButton10.setForeground(new java.awt.Color(144, 0, 0));
	   backButton10.setText("Go Back");
	   backButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   paymentPagePanel.add(backButton10);
	   backButton10.setBounds(100, 500, 220, 60);

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

	   //-----------------------------------------------------------------------------
	   //TICKET PAGE

	   JLabel orderTextLabel = new JLabel();
	   JLabel thankYouTextLabel = new JLabel();
	   JButton mainPageButton11 = new JButton();
	   JButton orderPageButton11 = new JButton();
	   JScrollPane jScrollPane1 = new JScrollPane();
	   JTextArea ticketInfo = new JTextArea();
	   JLabel ticketBackground = new JLabel();

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

	   mainPageButton11.setFont(new java.awt.Font("Segoe UI", 1, 14));
	   mainPageButton11.setForeground(new java.awt.Color(144, 0, 0));
	   mainPageButton11.setText("Go to Main");

	   ticketPagePanel.add(mainPageButton11);
	   mainPageButton11.setBounds(10, 540, 130, 30);

	   orderPageButton11.setFont(new java.awt.Font("Segoe UI", 1, 14));
	   orderPageButton11.setForeground(new java.awt.Color(144, 0, 0));
	   orderPageButton11.setText("Go to Order");

	   ticketPagePanel.add(orderPageButton11);
	   orderPageButton11.setBounds(560, 540, 130, 30);

	   ticketInfo.setColumns(20);
	   ticketInfo.setFont(new java.awt.Font("Segoe UI", 2, 18));
	   ticketInfo.setForeground(new java.awt.Color(102, 102, 102));
	   ticketInfo.setRows(5);
	   ticketInfo.setText("");
	   jScrollPane1.setViewportView(ticketInfo);

	   ticketPagePanel.add(jScrollPane1);
	   jScrollPane1.setBounds(180, 200, 322, 135);

	   ticketBackground.setIcon(new javax.swing.ImageIcon("momPop_Background11.png"));
	   ticketPagePanel.add(ticketBackground);
	   ticketBackground.setBounds(0, -10, 790, 610);

	   //-----------------------------------------------------------------------------
	   //LOGIN PAGE

	   JTextField usernameInput = new JTextField();
	   JTextField passwordInput = new JTextField();
	   JButton submitButton12 = new JButton();
	   JButton  createAccButton = new JButton();
	   JButton mainPageButton12 = new JButton();
	   JLabel loginBackground = new JLabel();


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

	   submitButton12.setText("Submit");
	   loginPagePanel.add(submitButton12);
	   submitButton12.setBounds(290, 200, 108, 35);

	   createAccButton.setBackground(new java.awt.Color(102, 102, 102));
	   createAccButton.setFont(new java.awt.Font("Segoe UI", 1, 18));
	   createAccButton.setForeground(new java.awt.Color(255, 255, 255));
	   createAccButton.setText("Create an Account");

	   loginPagePanel.add(createAccButton);
	   createAccButton.setBounds(30, 520, 210, 35);

	   mainPageButton12.setBackground(new java.awt.Color(144, 0, 0));
	   mainPageButton12.setFont(new java.awt.Font("Segoe UI", 1, 18));
	   mainPageButton12.setForeground(new java.awt.Color(255, 255, 255));
	   mainPageButton12.setText("Main Page");

	   loginPagePanel.add(mainPageButton12);
	   mainPageButton12.setBounds(510, 520, 160, 35);

	   loginBackground.setIcon(new javax.swing.ImageIcon("momPop_Background12.png"));
	   loginPagePanel.add(loginBackground);
	   loginBackground.setBounds(0, 0, 850, 600);

	   //-----------------------------------------------------------------------------
	   //CREATE ACCOUNT PAGE

	   JTextField firstNameInput = new JTextField();
	   JTextField lastNameInput = new JTextField();
	   JTextField emailInput = new JTextField();
	   JTextField phoneNumInput = new JTextField();
	   JTextField addressInput = new JTextField();
	   JButton submitButton13 = new JButton();
	   JButton mainPageButton13 = new JButton();
	   JButton orderPageButton13 = new JButton();
	   JButton aboutUsPageButton13 = new JButton();
	   JButton MenuPageButton13 = new JButton();
	   JLabel createAccountBackground = new JLabel();

	   createAccountPagePanel.setLayout(null);

	   firstNameInput.setBackground(new java.awt.Color(229, 229, 229));
	   firstNameInput.setForeground(new java.awt.Color(102, 102, 102));
	   firstNameInput.setText("FirstName");
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

	   submitButton13.setBackground(new java.awt.Color(242, 242, 242));
	   submitButton13.setFont(new java.awt.Font("Gill Sans MT", 3, 24));
	   submitButton13.setForeground(new java.awt.Color(144, 0, 0));
	   submitButton13.setText("Submit");
	   submitButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));
	   createAccountPagePanel.add(submitButton13);
	   submitButton13.setBounds(500, 490, 150, 70);

	   mainPageButton13.setBackground(new java.awt.Color(144, 0, 0));
	   mainPageButton13.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   mainPageButton13.setForeground(new java.awt.Color(255, 255, 255));
	   mainPageButton13.setText("Main Page");
	   createAccountPagePanel.add(mainPageButton13);
	   mainPageButton13.setBounds(30, 30, 120, 32);

	   orderPageButton13.setBackground(new java.awt.Color(144, 0, 0));
	   orderPageButton13.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   orderPageButton13.setForeground(new java.awt.Color(255, 255, 255));
	   orderPageButton13.setText("Order Page");

	   createAccountPagePanel.add(orderPageButton13);
	   orderPageButton13.setBounds(340, 30, 160, 32);

	   aboutUsPageButton13.setBackground(new java.awt.Color(144, 0, 0));
	   aboutUsPageButton13.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   aboutUsPageButton13.setForeground(new java.awt.Color(255, 255, 255));
	   aboutUsPageButton13.setText("About Us");

	   createAccountPagePanel.add(aboutUsPageButton13);
	   aboutUsPageButton13.setBounds(530, 30, 140, 32);

	   MenuPageButton13.setBackground(new java.awt.Color(144, 0, 0));
	   MenuPageButton13.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   MenuPageButton13.setForeground(new java.awt.Color(255, 255, 255));
	   MenuPageButton13.setText("Menu");
	   createAccountPagePanel.add(MenuPageButton13);
	   MenuPageButton13.setBounds(200, 30, 108, 32);

	   createAccountBackground.setIcon(new javax.swing.ImageIcon("momPop_Background13.png"));
	   createAccountPagePanel.add(createAccountBackground);
	   createAccountBackground.setBounds(0, 0, 800, 600);

	   //-----------------------------------------------------------------------------
	   //ACCOUNT INFO PAGE

	  JButton mainPageButton14 = new JButton();
	   JButton menuButton14 = new JButton();
	   JButton orderButton14 = new JButton();
	   JButton aboutButton14 = new JButton();
	   JLabel firstNameLabel = new JLabel();
	   JLabel lastNameLabel = new JLabel();
	   JLabel emailLabel = new JLabel();
	   JLabel  phoneLabel = new JLabel();
	   JLabel addressLabel = new JLabel();
	   JLabel cardNumLabel = new JLabel();
	   JButton logoutButton = new JButton();
	   JLabel accountInfoBackground = new JLabel();

	   accountInfoPagePanel.setLayout(null);

	   mainPageButton14.setBackground(new java.awt.Color(144, 0, 0));
	   mainPageButton14.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   mainPageButton14.setForeground(new java.awt.Color(255, 255, 255));
	   mainPageButton14.setText("Main Page");
	   accountInfoPagePanel.add(mainPageButton14);
	   mainPageButton14.setBounds(30, 30, 120, 32);

	   menuButton14.setBackground(new java.awt.Color(144, 0, 0));
	   menuButton14.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   menuButton14.setForeground(new java.awt.Color(255, 255, 255));
	   menuButton14.setText("Menu");
	   accountInfoPagePanel.add(menuButton14);
	   menuButton14.setBounds(200, 30, 108, 32);

	   orderButton14.setBackground(new java.awt.Color(144, 0, 0));
	   orderButton14.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   orderButton14.setForeground(new java.awt.Color(255, 255, 255));
	   orderButton14.setText("Order Page");

	   accountInfoPagePanel.add(orderButton14);
	   orderButton14.setBounds(340, 30, 160, 32);

	   aboutButton14.setBackground(new java.awt.Color(144, 0, 0));
	   aboutButton14.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
	   aboutButton14.setForeground(new java.awt.Color(255, 255, 255));
	   aboutButton14.setText("About Us");

	   accountInfoPagePanel.add(aboutButton14);
	   aboutButton14.setBounds(530, 30, 140, 32);

	   firstNameLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
	   firstNameLabel.setText("");
	   accountInfoPagePanel.add(firstNameLabel);
	   firstNameLabel.setBounds(280, 190, 380, 25);

	   lastNameLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
	   lastNameLabel.setText("");
	   accountInfoPagePanel.add(lastNameLabel);
	   lastNameLabel.setBounds(280, 240, 380, 25);

	   emailLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
	   emailLabel.setText("");
	   accountInfoPagePanel.add(emailLabel);
	   emailLabel.setBounds(280, 290, 400, 25);

	   phoneLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
	   phoneLabel.setText("");
	   accountInfoPagePanel.add(phoneLabel);
	   phoneLabel.setBounds(280, 350, 360, 25);

	   addressLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
	   addressLabel.setText("");
	   accountInfoPagePanel.add(addressLabel);
	   addressLabel.setBounds(280, 400, 400, 25);

	   cardNumLabel.setFont(new java.awt.Font("Segoe UI", 2, 18));
	   cardNumLabel.setText("");
	   accountInfoPagePanel.add(cardNumLabel);
	   cardNumLabel.setBounds(280, 470, 360, 25);

	   logoutButton.setBackground(new java.awt.Color(242, 242, 242));
	   logoutButton.setFont(new java.awt.Font("Segoe UI", 3, 24));
	   logoutButton.setForeground(new java.awt.Color(144, 0, 0));
	   logoutButton.setText("Logout");
	   logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(144, 0, 0), 2));

	   accountInfoPagePanel.add(logoutButton);
	   logoutButton.setBounds(533, 530, 130, 36);

	   accountInfoBackground.setIcon(new javax.swing.ImageIcon("momPop_Background14.png"));
	   accountInfoPagePanel.add(accountInfoBackground);
	   accountInfoBackground.setBounds(0, -30, 710, 670);

	   //-----------------------------------------------------------------------------
	   //FRAME STUFF

	   frame.setContentPane(mainPagePanel);
	   frame.setSize(710, 620);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setVisible(true);

   }

	//MAIN METHOD
	public static void main(String[] args) {
	 SwingUtilities.invokeLater(new Runnable(){
	  public void run(){
	   new Webpages();
	  }
	 });
	}
}




/*public class Webpages{

	public static class Client{

	}
	public class WebFuncs{

	}

}  */