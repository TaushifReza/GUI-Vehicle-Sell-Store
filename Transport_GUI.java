import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 * Write a description of class Transport_GUI here.
 *
 * @author (MOHAMMAD Taushif Reza)
 * @version (2022/08/02)
 */
public class Transport_GUI implements ActionListener
{
    ArrayList<Vehicle> vehicle = new ArrayList<Vehicle> (); //store array list of vehicle class
   
    private  JFrame frame1 = new JFrame("Transport GUI");
    private JPanel f1panel1 = new JPanel();
    private JLabel f1p1label1 = new JLabel("Transport GUI");
    private JButton f1p1btn1 = new JButton("Electric Scooter");
    private JButton f1p1btn2 = new JButton("Auto RickShaw ");
    private JMenuBar menubar = new JMenuBar();
    private JMenu menu = new JMenu("Menu");
    private JMenuItem login = new JMenuItem("Log In");
    private JMenuItem autorickshaw = new JMenuItem("AutoRickshaw");
    private JMenuItem electricscooter = new JMenuItem("ElectricScooter");
    private JMenuItem quit = new JMenuItem("Quit");

    public void Transport_GUI8()
    {
        frame1.setBounds(400,200,500,250); //setting size and position of Jframe1
        frame1.setLayout(null); //setting layout null
        frame1.setVisible(true); //makes the frme visible
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE); //exit out of application
        frame1.setResizable(false); //prevent frame1 from being resizable

        f1panel1.setBounds(0,0,500,250); //setting size and position of f1panel1
        f1panel1.setBackground(new Color(0x666699)); //setting bg coclor of f1panel1
        f1panel1.setLayout(null); //setting layout of f1panel1 to null

        f1p1label1.setBounds(140,0,300,50); //setting label size and position
        f1p1label1.setFont(new Font("Consolas",Font.BOLD,30)); //setting font family and size of text
        f1p1label1.setForeground(new Color(0x000000)); //set font color

        f1p1btn1.setBounds(40,70,200,50); //setting position and size of button
        f1p1btn1.setFocusable(false);
        f1p1btn1.setFont(new Font("Comic Sans",Font.PLAIN,22)); //set font family and size of button
        f1p1btn1.setBackground(new Color(0xffffff));
        f1p1btn1.addActionListener(this);

        f1p1btn2.setBounds(250,70,200,50); //setting position and size of button
        f1p1btn2.setFocusable(false);
        f1p1btn2.setFont(new Font("Comic Sans",Font.PLAIN,22)); //set font family and size of button
        f1p1btn2.setBackground(new Color(0xffffff));
        f1p1btn2.addActionListener(this);
        
        copyright.setBounds(50,150,400,35); //setting label size and position
        copyright.setFont(new Font("Consolas",Font.PLAIN,14)); //setting font family and size of text
        copyright.setForeground(new Color(0x071e26)); //set font color

        login.addActionListener(this);
        autorickshaw.addActionListener(this);
        electricscooter.addActionListener(this);
        quit.addActionListener(this);

        frame1.add(f1panel1); //adding f1panel1 to frame1
        f1panel1.add(f1p1label1); //adding jlabel to f1panel1
        f1panel1.add(f1p1btn1); //adding button on the f1panel1
        f1panel1.add(f1p1btn2); //adding button on the f1panel1
        f1panel1.add(copyright); //adding jlabel to panel
        frame1.setJMenuBar(menubar);
        menubar.add(menu);
        menu.add(login);
        menu.add(autorickshaw);
        menu.add(electricscooter);
        menu.add(quit);

        frame1.setVisible(true);
    }

    private JFrame frame2 = new JFrame("Electric Scooter");
    private JPanel f2panel1 = new JPanel();
    private JPanel f2panel2 = new JPanel();
    private JPanel f2panel3 = new JPanel();
    private JLabel f2p1label1 = new JLabel("Electric Scooter");
    private JLabel f2p1label2 = new JLabel("Vehicle ID:");
    private JLabel f2p1label3 = new JLabel("Vehicle Name:");
    private JLabel f2p1label4 = new JLabel("Vehicle Weight:");
    private JLabel f2p1label5 = new JLabel("Vehicle Color:");
    private JLabel f2p1label6 = new JLabel("Vehicle Speed");
    private JLabel f2p1label7 = new JLabel("Battery Capacity:");
    private JTextField f2p2textfield2 = new JTextField();
    private JTextField f2p2textfield3 = new JTextField();
    private JTextField f2p2textfield4 = new JTextField();
    private JTextField f2p2textfield5 = new JTextField();
    private JTextField f2p2textfield6 = new JTextField();
    private JTextField f2p2textfield7 = new JTextField();
    private JButton f2p2btn1 = new JButton("Add an Electric Scooter");
    private JLabel f2p3label1 = new JLabel("Vehicle ID:");
    private JLabel f2p3label2 = new JLabel("Brand:");
    private JLabel f2p3label3 = new JLabel("Price:");
    private JLabel f2p3label4 = new JLabel("Charging Time:");
    private JLabel f2p3label5 = new JLabel("Mileage:");
    private JLabel f2p3label6 = new JLabel("Range:");
    private JTextField f2p3textfield1 = new JTextField();
    private JTextField f2p3textfield2 = new JTextField();
    private JTextField f2p3textfield3 = new JTextField();
    private JTextField f2p3textfield4 = new JTextField();
    private JTextField f2p3textfield5 = new JTextField();
    private JTextField f2p3textfield6 = new JTextField();
    private JButton f2p3btn1 = new JButton("Purchase the Electric Scooter");
    private JLabel vIDSell = new JLabel("Vehicle ID:");
    private JLabel vPriceSell = new JLabel("Price:");
    private JTextField txtSell = new JTextField();
    private JTextField txtSell1 = new JTextField();
    private JButton f2p3btn2 = new JButton("Sell the Electric Scooter");
    private JButton f2p3btn3 = new JButton("Display");
    private JButton f2p3btn4 = new JButton("CLEAR");
    private JButton f2p2btn2 = new JButton("Change for Auto Rickshaw");

    public void Electric_Scooter1()
    {
        frame2.setBounds(180,10,1000,630); //setting size and position of Jframe2
        frame2.setLayout(null); //setting layout null
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame2.setResizable(false); //prevent frame2 from being resizable

        f2panel1.setBounds(0,0,1000,630); //setting size and position of panel
        f2panel1.setBackground(new Color(0x666699)); //setting bg coclor of panel
        f2panel1.setLayout(null); //setting layout of panel to null

        copyright.setBounds(300,520,400,35); //setting label size and position
        copyright.setFont(new Font("Consolas",Font.PLAIN,14)); //setting font family and size of text
        copyright.setForeground(new Color(0x071e26)); //set font color

        f2panel2.setBounds(20,70,470,440); //setting size and position of panel
        f2panel2.setBackground(new Color(0x669999)); //setting bg coclor of panel
        f2panel2.setLayout(null); //setting layout of panel to null

        f2panel3.setBounds(510,70,470,440); //setting size and position of panel
        f2panel3.setBackground(new Color(0x669999)); //setting bg coclor of panel
        f2panel3.setLayout(null); //setting layout of panel to null

        f2p1label1.setBounds(365,30,270,35); //setting label size and position
        f2p1label1.setFont(new Font("Consolas",Font.BOLD,30)); //setting font family and size of text
        f2p1label1.setForeground(new Color(0x000000)); //set font color

        f2p1label2.setBounds(20,20,300,30); //setting label size and position
        f2p1label2.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p1label2.setForeground(new Color(0x000000)); //set font color

        f2p1label3.setBounds(20,60,300,30); //setting label size and position
        f2p1label3.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p1label3.setForeground(new Color(0x000000)); //set font color

        f2p1label4.setBounds(20,100,300,30); //setting label size and position
        f2p1label4.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p1label4.setForeground(new Color(0x000000)); //set font color

        f2p1label5.setBounds(20,140,300,30); //setting label size and position
        f2p1label5.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p1label5.setForeground(new Color(0x000000)); //set font color

        f2p1label6.setBounds(20,180,300,30); //setting label size and position
        f2p1label6.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p1label6.setForeground(new Color(0x000000)); //set font color

        f2p1label7.setBounds(20,220,300,30); //setting label size and position
        f2p1label7.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p1label7.setForeground(new Color(0x000000)); //set font color

        f2p2textfield2.setBounds(205,20,170,30); //set size and position for textfield
        f2p2textfield2.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p2textfield3.setBounds(205,60,170,30); //set size and position for textfield
        f2p2textfield3.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p2textfield4.setBounds(205,100,170,30); //set size and position for textfield
        f2p2textfield4.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p2textfield5.setBounds(205,140,170,30); //set size and position for textfield
        f2p2textfield5.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p2textfield6.setBounds(205,180,170,30); //set size and position for textfield
        f2p2textfield6.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p2textfield7.setBounds(205,220,170,30); //set size and position for textfield
        f2p2textfield7.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p2btn1.setBounds(55,345,350,40); //setting position and size of button
        f2p2btn1.setFocusable(false);
        f2p2btn1.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f2p2btn1.addActionListener(this);

        f2p2btn2.setBounds(55,390,350,40); //setting position and size of button
        f2p2btn2.setFocusable(false);
        f2p2btn2.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f2p2btn2.addActionListener(this);

        f2p3label1.setBounds(20,20,300,30); //setting label size and position
        f2p3label1.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p3label1.setForeground(new Color(0x000000)); //set font color

        f2p3label2.setBounds(20,60,300,30); //setting label size and position
        f2p3label2.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p3label2.setForeground(new Color(0x000000)); //set font color

        f2p3label3.setBounds(20,100,300,30); //setting label size and position
        f2p3label3.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p3label3.setForeground(new Color(0x000000)); //set font color

        f2p3label4.setBounds(20,140,300,30); //setting label size and position
        f2p3label4.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p3label4.setForeground(new Color(0x000000)); //set font color

        f2p3label5.setBounds(20,180,300,30); //setting label size and position
        f2p3label5.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p3label5.setForeground(new Color(0x000000)); //set font color

        f2p3label6.setBounds(20,220,300,30); //setting label size and position
        f2p3label6.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f2p3label6.setForeground(new Color(0x000000)); //set font color

        f2p3textfield1.setBounds(205,20,170,30); //set size and position for textfield
        f2p3textfield1.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p3textfield2.setBounds(205,60,170,30); //set size and position for textfield
        f2p3textfield2.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p3textfield3.setBounds(205,100,170,30); //set size and position for textfield
        f2p3textfield3.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p3textfield4.setBounds(205,140,170,30); //set size and position for textfield
        f2p3textfield4.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p3textfield5.setBounds(205,180,170,30); //set size and position for textfield
        f2p3textfield5.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p3textfield6.setBounds(205,220,170,30); //set size and position for textfield
        f2p3textfield6.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f2p3btn1.setBounds(55,260,350,40); //setting position and size of button
        f2p3btn1.setFocusable(false);
        f2p3btn1.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f2p3btn1.addActionListener(this);

        vIDSell.setBounds(20,305,300,30); //setting label size and position
        vIDSell.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        vIDSell.setForeground(new Color(0x000000)); //set font color
        
        vPriceSell.setBounds(260,305,300,30); //setting label size and position
        vPriceSell.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        vPriceSell.setForeground(new Color(0x000000)); //set font color

        txtSell.setBounds(135,305,110,30); //set size and position for textfield
        txtSell.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field
        
        txtSell1.setBounds(325,305,80,30); //set size and position for textfield
        txtSell1.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field


        f2p3btn2.setBounds(55,345,350,40); //setting position and size of button
        f2p3btn2.setFocusable(false);
        f2p3btn2.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f2p3btn2.addActionListener(this);

        f2p3btn3.setBounds(55,390,165,40); //setting position and size of button
        f2p3btn3.setFocusable(false);
        f2p3btn3.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f2p3btn3.addActionListener(this);

        f2p3btn4.setBounds(235,390,170,40); //setting position and size of button
        f2p3btn4.setFocusable(false);
        f2p3btn4.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f2p3btn4.setForeground(new Color(0xff0000)); //set font color
        f2p3btn4.addActionListener(this);

        f3menuitem.addActionListener(this);
        f3menuitem444.addActionListener(this);
        f3menuitem4444.addActionListener(this);
        f3menuitem44.addActionListener(this);

        frame2.add(f2panel1); //adding panel to frame2
        f2panel1.add(copyright); //adding jlabel to panel
        f2panel1.add(f2panel2); //adding panel to frame2
        f2panel1.add(f2panel3); //adding panel to frame2
        f2panel1.add(f2p1label1); //adding jlabel to panel
        f2panel2.add(f2p1label2); //adding jlabel to panel
        f2panel2.add(f2p1label3); //adding jlabel to panel
        f2panel2.add(f2p1label4); //adding jlabel to panel
        f2panel2.add(f2p1label5); //adding jlabel to panel
        f2panel2.add(f2p1label6); //adding jlabel to panel
        f2panel2.add(f2p1label7); //adding jlabel to panel
        f2panel2.add(f2p2textfield2); //add textfield to panel
        f2panel2.add(f2p2textfield3); //add textfield to panel
        f2panel2.add(f2p2textfield4); //add textfield to panel
        f2panel2.add(f2p2textfield5); //add textfield to panel
        f2panel2.add(f2p2textfield6); //add textfield to panel
        f2panel2.add(f2p2textfield7); //add textfield to panel
        f2panel2.add(f2p2btn1); //adding button on the frame2
        f2panel2.add(f2p2btn2); //adding button on the frame2
        f2panel3.add(f2p3label1); //adding jlabel to panel
        f2panel3.add(f2p3label2); //adding jlabel to panel
        f2panel3.add(f2p3label3); //adding jlabel to panel
        f2panel3.add(f2p3label4); //adding jlabel to panel
        f2panel3.add(f2p3label5); //adding jlabel to panel
        f2panel3.add(f2p3label6); //adding jlabel to panel
        f2panel3.add(f2p3textfield1); //add textfield to panel
        f2panel3.add(f2p3textfield2); //add textfield to panel
        f2panel3.add(f2p3textfield3); //add textfield to panel
        f2panel3.add(f2p3textfield4); //add textfield to panel
        f2panel3.add(f2p3textfield5); //add textfield to panel
        f2panel3.add(f2p3textfield5); //add textfield to panel
        f2panel3.add(f2p3textfield6); //add textfield to panel
        f2panel3.add(f2p3btn1); //adding button on the frame2
        f2panel3.add(f2p3btn2); //adding button on the frame2
        f2panel3.add(f2p3btn3); //adding button on the frame2
        f2panel3.add(f2p3btn4); //adding button on the frame2
        f2panel3.add(vIDSell); //add Jlabel to panel3
        f2panel3.add(vPriceSell); //add Jlabel to panel3
        f2panel3.add(txtSell); //add Jtextfield to panel3
        f2panel3.add(txtSell1); //add Jtextfield to panel3

        frame2.setJMenuBar(f3menubar); //adding f3menubar to frame3
        f3menubar.add(f3menu); //adding menu to f3menubar
        f3menu.add(f3menuitem); //adding menuitem in file
        f3menubar.add(f3menu1); //adding menu to f3menubar
        f3menu1.add(f3menuitem44); //adding menuitem in file
        f3menu1.add(f3menuitem4444); //adding menuitem in file  
        f3menu1.add(f3menuitem444); //adding menuitem in file      
    
        frame2.setVisible(true); //makes the frame visible
    }

    private JFrame frame3 = new JFrame("Auto Rickshaw");
    private JPanel f3panel1 = new JPanel();
    private JPanel f3panel2 = new JPanel();
    private JPanel f3panel3 = new JPanel();
    private JLabel f3label1 = new JLabel("Auto Rickshaw");
    private JLabel f3p2label2 = new JLabel("Vehicle ID:");
    private JLabel f3p2label3 = new JLabel("Vehicle Name:");
    private JLabel f3p2label4 = new JLabel("Vehicle Weight:");
    private JLabel f3p2label5 = new JLabel("Vehicle Color:");
    private JLabel f3p2label6 = new JLabel("Vehicle Speed");
    private JLabel f3p2label7 = new JLabel("Engine Displacement:");
    private JLabel f3p2label8 = new JLabel("Torque:");
    private JLabel f3p2label9 = new JLabel("Fuel Tank Capacity:");
    private JLabel f3p2label10 = new JLabel("Ground Clearance:");
    private JTextField f3p2textfield2 = new JTextField();
    private JTextField f3p2textfield3 = new JTextField();
    private JTextField f3p2textfield4 = new JTextField();
    private JTextField f3p2textfield5 = new JTextField();
    private JTextField f3p2textfield6 = new JTextField();
    private JTextField f3p2textfield7 = new JTextField();
    private JTextField f3p2textfield8 = new JTextField();
    private JTextField f3p2textfield9 = new JTextField();
    private JTextField f3p2textfield10 = new JTextField();
    private JButton f3p2btn1 = new JButton("Add an Auto Rickshaw");
    private JButton f3p3btn1 = new JButton("Change for Electric Scooter");
    private JLabel f3p3lable1 = new JLabel("Vehicle ID:");
    private JLabel f3p3lable2 = new JLabel("Booked Date:");
    private JLabel f3p3lable3 = new JLabel("Charge Amount:");
    private JLabel f3p3lable4 = new JLabel("Numbers of Seats:");
    private JTextField f3p3textfield1 = new JTextField();
    String[] year = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004",
            "2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2019",
            "2020","2021","2022"};
    private JComboBox f3p3combobox2 = new JComboBox(year); //creating a Jcombobox
    String[] month = {"January ","February  ","March  ","April ","May ","June ","July ","August ","September ",
            "October ","November ","December",};
    private JComboBox f3p3combobox22 = new JComboBox(month); //creating a Jcombobox
    String[] day = {"1 ","2  ","3  ","4 ","5 ","6 ","7 ","8 ","9 ",
            "10 ","11 ","12 ","13 ","14 ","15 ","16 ","17 ","18 ","19 ","20 ","21 ","22 ","23 ","24 ","25 ","26 ",
            "27 ","28 ","29 ","30 ","31 ","32 "};
    private JComboBox f3p3combobox222 = new JComboBox(day); //creating a Jcombobox
    private JTextField f3p3textfield3 = new JTextField();
    private JTextField f3p3textfield4 = new JTextField();
    private JButton f3p3btn2 = new JButton("Book an Auto Rickshaw");
    private JButton f3p3btn3 = new JButton("Display");
    private JButton f3p3btn4 = new JButton("CLEAR");
    private JMenuBar f3menubar = new JMenuBar(); //creating a f3menubar
    private JMenu f3menu = new JMenu("File"); //creating menu on f3menubar
    private JMenuItem f3menuitem = new JMenuItem("New File"); //creating menuitem
    private JMenu f3menu1 = new JMenu("Option"); //creating menu on f3menubar
    private JMenuItem f3menuitem44 = new JMenuItem("Home"); //creating menuitem
    private JMenuItem f3menuitem4444 = new JMenuItem("Log In"); //creating menuitem
    private JMenuItem f3menuitem444= new JMenuItem("Exit"); //creating menuitem

    public void Auto_Rickshaw1()
    {
        frame3.setBounds(180,10,1010,630); //setting size and position of Jframe3
        frame3.setLayout(null); //setting layout null
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame3.setResizable(false); //prevent frame3 from being resizable

        f3panel1.setBounds(0,0,1010,630); //setting size and position of panel
        f3panel1.setBackground(new Color(0x666699)); //setting bg coclor of panel
        f3panel1.setLayout(null); //setting layout of panel to null

        f3label1.setBounds(365,30,270,35); //setting label size and position
        f3label1.setFont(new Font("Consolas",Font.BOLD,30)); //setting font family and size of text
        f3label1.setForeground(new Color(0x000000)); //set font color

        copyright.setBounds(300,520,400,35); //setting label size and position
        copyright.setFont(new Font("Consolas",Font.PLAIN,14)); //setting font family and size of text
        copyright.setForeground(new Color(0x071e26)); //set font color

        f3panel2.setBounds(20,100,470,400); //setting size and position of panel
        f3panel2.setBackground(new Color(0x669999)); //setting bg coclor of panel
        f3panel2.setLayout(null); //setting layout of panel to null

        f3p2label2.setBounds(10,10,300,30); //setting label size and position
        f3p2label2.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label2.setForeground(new Color(0x000000)); //set font color

        f3p2label3.setBounds(10,50,300,30); //setting label size and position
        f3p2label3.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label3.setForeground(new Color(0x000000)); //set font color

        f3p2label4.setBounds(10,85,300,30); //setting label size and position
        f3p2label4.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label4.setForeground(new Color(0x000000)); //set font color

        f3p2label5.setBounds(10,120,300,30); //setting label size and position
        f3p2label5.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label5.setForeground(new Color(0x000000)); //set font color

        f3p2label6.setBounds(10,155,300,30); //setting label size and position
        f3p2label6.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label6.setForeground(new Color(0x000000)); //set font color

        f3p2label7.setBounds(10,195,300,30); //setting label size and position
        f3p2label7.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label7.setForeground(new Color(0x000000)); //set font color

        f3p2label8.setBounds(10,230,300,30); //setting label size and position
        f3p2label8.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label8.setForeground(new Color(0x000000)); //set font color

        f3p2label9.setBounds(10,265,300,30); //setting label size and position
        f3p2label9.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label9.setForeground(new Color(0x000000)); //set font color

        f3p2label10.setBounds(10,300,300,30); //setting label size and position
        f3p2label10.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p2label10.setForeground(new Color(0x000000)); //set font color

        f3p2textfield2.setBounds(225,10,170,25); //set size and position for textfield
        f3p2textfield2.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield3.setBounds(225,50,170,25); //set size and position for textfield
        f3p2textfield3.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield4.setBounds(225,85,170,25); //set size and position for textfield
        f3p2textfield4.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield5.setBounds(225,120,170,25); //set size and position for textfield
        f3p2textfield5.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield6.setBounds(225,155,170,25); //set size and position for textfield
        f3p2textfield6.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield7.setBounds(225,195,170,25); //set size and position for textfield
        f3p2textfield7.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield8.setBounds(225,230,170,25); //set size and position for textfield
        f3p2textfield8.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield9.setBounds(225,265,170,25); //set size and position for textfield
        f3p2textfield9.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2textfield10.setBounds(225,300,170,25); //set size and position for textfield
        f3p2textfield10.setFont(new Font("Consolas",Font.PLAIN,15)); //set font family and size for text field

        f3p2btn1.setBounds(85,345,310,40); //setting position and size of button
        f3p2btn1.setFocusable(false);
        f3p2btn1.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f3p2btn1.addActionListener(this);

        f3panel3.setBounds(510,100,470,400); //setting size and position of panel
        f3panel3.setBackground(new Color(0x669999)); //setting bg coclor of panel
        f3panel3.setLayout(null); //setting layout of panel to null

        f3p3btn1.setBounds(60,10,340,40); //setting position and size of button
        f3p3btn1.setFocusable(false);
        f3p3btn1.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f3p3btn1.addActionListener(this);

        f3p3lable1.setBounds(10,70,300,30); //setting label size and position
        f3p3lable1.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p3lable1.setForeground(new Color(0x000000)); //set font color

        f3p3lable2.setBounds(10,120,300,30); //setting label size and position
        f3p3lable2.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p3lable2.setForeground(new Color(0x000000)); //set font color

        f3p3lable3.setBounds(10,170,300,30); //setting label size and position
        f3p3lable3.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p3lable3.setForeground(new Color(0x000000)); //set font color

        f3p3lable4.setBounds(10,220,300,30); //setting label size and position
        f3p3lable4.setFont(new Font("Consolas",Font.PLAIN,18)); //setting font family and size of text
        f3p3lable4.setForeground(new Color(0x000000)); //set font color

        f3p3textfield1.setBounds(205,70,250,35); //set size and position for textfield
        f3p3textfield1.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f3p3combobox2.setBounds(205,120,65,35); //set size and position of combobox
        f3p3combobox2.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for combobox
        f3p3combobox2.setFocusable(false); //disable border of combobox

        f3p3combobox22.setBounds(275,120,125,35); //set size and position of combobox
        f3p3combobox22.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for combobox
        f3p3combobox22.setFocusable(false); //disable border of combobox

        f3p3combobox222.setBounds(405,120,60,35); //set size and position of combobox
        f3p3combobox222.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for combobox
        f3p3combobox222.setFocusable(false); //disable border of combobox

        f3p3textfield3.setBounds(205,170,250,35); //set size and position for textfield
        f3p3textfield3.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f3p3textfield4.setBounds(205,220,250,35); //set size and position for textfield
        f3p3textfield4.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        f3p3btn2.setBounds(60,280,340,40); //setting position and size of button
        f3p3btn2.setFocusable(false);
        f3p3btn2.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f3p3btn2.addActionListener(this);

        f3p3btn3.setBounds(60,340,160,40); //setting position and size of button
        f3p3btn3.setFocusable(false);
        f3p3btn3.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f3p3btn3.addActionListener(this);

        f3p3btn4.setBounds(230,340,170,40); //setting position and size of button
        f3p3btn4.setFocusable(false);
        f3p3btn4.setFont(new Font("Comic Sans",Font.BOLD,22)); //set font family and size of button
        f3p3btn4.addActionListener(this);
        f3p3btn4.setForeground(new Color(0xff0000)); //set font color

        f3menuitem.addActionListener(this);
        f3menuitem444.addActionListener(this);
        f3menuitem4444.addActionListener(this);
        f3menuitem44.addActionListener(this);

        frame3.add(f3panel1); //adding panel to frame3
        f3panel1.add(f3label1); //adding jlabel to panel
        f3panel1.add(copyright); //adding jlabel to panel
        f3panel1.add(f3panel2); //adding panel to frame3
        f3panel2.add(f3p2label2); //adding jlabel to panel
        f3panel2.add(f3p2label3); //adding jlabel to panel
        f3panel2.add(f3p2label4); //adding jlabel to panel
        f3panel2.add(f3p2label5); //adding jlabel to panel
        f3panel2.add(f3p2label6); //adding jlabel to panel
        f3panel2.add(f3p2label7); //adding jlabel to panel
        f3panel2.add(f3p2label8); //adding jlabel to panel
        f3panel2.add(f3p2label9); //adding jlabel to panel
        f3panel2.add(f3p2label10); //adding jlabel to panel
        f3panel2.add(f3p2textfield2); //add textfield to panel
        f3panel2.add(f3p2textfield3); //add textfield to panel
        f3panel2.add(f3p2textfield4); //add textfield to panel
        f3panel2.add(f3p2textfield5); //add textfield to panel
        f3panel2.add(f3p2textfield6); //add textfield to panel
        f3panel2.add(f3p2textfield7); //add textfield to panel
        f3panel2.add(f3p2textfield8); //add textfield to panel
        f3panel2.add(f3p2textfield9); //add textfield to panel
        f3panel2.add(f3p2textfield10); //add textfield to panel
        f3panel2.add(f3p2btn1); //adding button on the frame3
        f3panel1.add(f3panel3); //adding panel to frame3
        f3panel3.add(f3p3btn1); //adding button on the frame3
        f3panel3.add(f3p3lable1); //adding jlabel to panel
        f3panel3.add(f3p3lable2); //adding jlabel to panel
        f3panel3.add(f3p3lable3); //adding jlabel to panel
        f3panel3.add(f3p3lable4); //adding jlabel to panel
        f3panel3.add(f3p3textfield1); //add textfield to panel
        f3panel3.add(f3p3combobox2); //adding combobox on panel
        f3panel3.add(f3p3combobox22); //adding combobox on panel
        f3panel3.add(f3p3combobox222); //adding combobox on panel
        f3panel3.add(f3p3textfield3); //add textfield to panel
        f3panel3.add(f3p3textfield4); //add textfield to panel
        f3panel3.add(f3p3btn2); //adding button on the frame3
        f3panel3.add(f3p3btn3); //adding button on the frame3
        f3panel3.add(f3p3btn4); //adding button on the frame3

        frame3.setJMenuBar(f3menubar); //adding f3menubar to frame3
        f3menubar.add(f3menu); //adding menu to f3menubar
        f3menu.add(f3menuitem); //adding menuitem in file
        f3menubar.add(f3menu1); //adding menu to f3menubar
        f3menu1.add(f3menuitem44); //adding menuitem in file
        f3menu1.add(f3menuitem4444); //adding menuitem in file
        f3menu1.add(f3menuitem444); //adding menuitem in file

        frame3.setVisible(true); //makes the frame visible
    }

    private JFrame registationframe = new JFrame("Login Page");
    private JPanel registationpanel = new JPanel();
    private JLabel logintitle = new JLabel("Log In");
    private JLabel username = new JLabel("UserName:");
    private JLabel password = new JLabel("Password:");
    private JTextField usernametxt = new JTextField();
    private JPasswordField passwordfield = new JPasswordField();
    private JButton loginbtn = new JButton("Log In");
    private JLabel note = new JLabel("Note: Your username is your password");
    private JToggleButton togglebutton = new JToggleButton("Show");
    private JLabel copyright = new JLabel("\u00a9 2022 MOHAMMAD AUTOMOBILE || All rights reserved."); //note \u00a9 is a code for copyright symbole 

    public void Login()
    {
        registationframe.setBounds(400,100,500,400); //setting size and position of frame
        registationframe.setLayout(null); //setting layout null
        registationframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        registationframe.setResizable(false); //prevent frame3 from being resizable

        registationpanel.setBounds(0,0,500,400); //setting size and position of panel
        registationpanel.setBackground(new Color(0x666699)); //setting bg coclor of panel
        registationpanel.setLayout(null); //setting layout of panel to null

        logintitle.setBounds(200,20,100,35); //setting label size and position
        logintitle.setFont(new Font("Consolas",Font.BOLD,30)); //setting font family and size of text
        logintitle.setForeground(new Color(0x000000)); //set font color

        username.setBounds(30,70,200,30); //setting label size and position
        username.setFont(new Font("Consolas",Font.PLAIN,20)); //setting font family and size of text
        username.setForeground(new Color(0x000000)); //set font color

        password.setBounds(30,130,200,30); //setting label size and position
        password.setFont(new Font("Consolas",Font.PLAIN,20)); //setting font family and size of text
        password.setForeground(new Color(0x000000)); //set font color

        usernametxt.setBounds(170,70,200,30); //set size and position for textfield
        usernametxt.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field

        passwordfield.setBounds(170,130,200,30); //set size and position for textfield
        passwordfield.setFont(new Font("Consolas",Font.PLAIN,18)); //set font family and size for text field
        passwordfield.setEchoChar('\u25cf'); //note '\u25cf' is a code for • symbole 
        passwordfield.addActionListener(this);

        loginbtn.setBounds(195,190,110,40); //setting position and size of button
        loginbtn.setFocusable(false);
        loginbtn.setFont(new Font("Comic Sans",Font.BOLD,23)); //set font family and size of button
        loginbtn.setBackground(new Color(0xffffff));
        loginbtn.setForeground(new Color(0x000099));
        loginbtn.addActionListener(this);

        note.setBounds(30,260,400,35); //setting label size and position
        note.setFont(new Font("Consolas",Font.PLAIN,14)); //setting font family and size of text
        note.setForeground(new Color(0x000000)); //set font color

        togglebutton.setBounds(380,130,90,30); //setting position and size of button
        togglebutton.setFocusable(false);
        togglebutton.setFont(new Font("Comic Sans",Font.PLAIN,18)); //set font family and size of button
        togglebutton.setBackground(new Color(0xffffff));
        togglebutton.setForeground(new Color(0x000099));
        togglebutton.addActionListener(this);

        copyright.setBounds(50,330,400,35); //setting label size and position
        copyright.setFont(new Font("Consolas",Font.PLAIN,14)); //setting font family and size of text
        copyright.setForeground(new Color(0x071e26)); //set font color

        registationframe.add(registationpanel); //adding panel to frame
        registationpanel.add(logintitle); //adding jlabel to panel
        registationpanel.add(username); //adding jlabel to panel
        registationpanel.add(password); //adding jlabel to panel
        registationpanel.add(usernametxt); //add textfield to panel
        registationpanel.add(passwordfield); //add textfield to panel
        registationpanel.add(loginbtn); //adding button on the frame3
        registationpanel.add(note); //adding jlabel to panel
        registationpanel.add(togglebutton); //adding button on the frame3
        registationpanel.add(copyright); //adding jlabel to panel

        registationframe.setVisible(true);
    }

    //actionperformed method
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==loginbtn)
        {
            String username = usernametxt.getText();
            String password = passwordfield.getText();
            
            //case 1 : if username and password both empty
            if(username .equals ("") && password .equals (""))
            {
                JOptionPane.showMessageDialog(registationframe,"Please enter UserName and Password");
            }
            //case 2 : if username is enter and password empty
            else if(!(username .equals ("")) && password .equals (""))
            {
                JOptionPane.showMessageDialog(registationframe,"Please enter Password");
            }
            //case 3 : if username is empty and password enter
            else if(username .equals ("") && !(password .equals ("")))
            {
                JOptionPane.showMessageDialog(registationframe,"Please enter UserName");
            }
            //if username and password is equal 
            else if(username .equals (password))
            {
                registationframe.dispose();
                Transport_GUI newpage = new Transport_GUI();
                newpage.Transport_GUI8();
            }
            //if username and password not match
            else
            {
                JOptionPane.showMessageDialog(registationframe, "Invalide UserName and Password", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        
        /*
        When show button is selcected, JPasswordField become visible and show button text change to hide. 
        Again hide is press JPasswordField become invisible and hide text of button change to show.
        */
        if(togglebutton.isSelected())
        {
            passwordfield.setEchoChar((char)0); // make text of JPasswordField visible 
            togglebutton.setText("Hide");
        }
        else
        {
            passwordfield.setEchoChar('\u25cf'); //note \u25cf is a code for • symbole or u can just used • symbole 
            togglebutton.setText("Show");
        }
        
        // when this button is press display window become dispose and a new window is open 
        if(e.getSource()==f1p1btn1)
        {
            frame1.dispose();
            Transport_GUI obj1 = new Transport_GUI();
            obj1.Electric_Scooter1();
        }
        
        // when this button is press display window become dispose and a new window is open 
        if(e.getSource()==f1p1btn2)
        {
            frame1.dispose();
            Transport_GUI obj2 = new Transport_GUI();
            obj2.Auto_Rickshaw1();
        }
        
        // when this button is press display window become dispose and a new window is open 
        if(e.getSource()==f2p2btn2)
        {
            frame2.dispose();
            Transport_GUI obj3 = new Transport_GUI();
            obj3.Auto_Rickshaw1();
        }
        
        // when this button is press display window become dispose and a new window is open 
        if(e.getSource()==f3p3btn1)
        {
            frame3.dispose();
            Transport_GUI obj4 = new Transport_GUI();
            obj4.Electric_Scooter1();
        }
        
        // when this button is press all the textfield value is clear 
        if(e.getSource()==f2p3btn4)
        {
            f2p2textfield2.setText("");
            f2p2textfield3.setText("");
            f2p2textfield4.setText("");
            f2p2textfield5.setText("");
            f2p2textfield6.setText("");
            f2p2textfield7.setText("");
            f2p3textfield1.setText("");
            f2p3textfield2.setText("");
            f2p3textfield3.setText("");
            f2p3textfield4.setText("");
            f2p3textfield5.setText("");
            f2p3textfield6.setText("");
        }
        
        // when this button is press all the textfield value is clear 
        if(e.getSource()==f3p3btn4)
        {
            f3p2textfield2.setText("");
            f3p2textfield3.setText("");
            f3p2textfield4.setText("");
            f3p2textfield5.setText("");
            f3p2textfield6.setText("");
            f3p2textfield7.setText("");
            f3p2textfield8.setText("");
            f3p2textfield9.setText("");
            f3p2textfield10.setText("");
            f3p3textfield1.setText("");
            f3p3combobox2.setSelectedIndex(0);
            f3p3combobox22.setSelectedIndex(0);
            f3p3combobox222.setSelectedIndex(0);
            f3p3textfield3.setText("");
            f3p3textfield4.setText("");
        }
        
        //when this menu item is select window is clear
        if(e.getSource()==f3menuitem444)
        {
            System.exit(0);
        }
        
        //when this menu item is select window is clear
        if(e.getSource()==quit)
        {
            System.exit(0);
        }

        //it will open a new file 
        if(e.getSource()==f3menuitem)
        {
            f2p2textfield2.setText("");
            f2p2textfield3.setText("");
            f2p2textfield4.setText("");
            f2p2textfield5.setText("");
            f2p2textfield6.setText("");
            f2p2textfield7.setText("");
            f2p3textfield1.setText("");
            f2p3textfield2.setText("");
            f2p3textfield3.setText("");
            f2p3textfield4.setText("");
            f2p3textfield5.setText("");
            f2p3textfield6.setText("");
            f3p2textfield2.setText("");
            f3p2textfield3.setText("");
            f3p2textfield4.setText("");
            f3p2textfield5.setText("");
            f3p2textfield6.setText("");
            f3p2textfield7.setText("");
            f3p2textfield8.setText("");
            f3p2textfield9.setText("");
            f3p2textfield10.setText("");
            f3p3textfield1.setText("");
            f3p3combobox2.setSelectedIndex(0);
            f3p3combobox22.setSelectedIndex(0);
            f3p3combobox222.setSelectedIndex(0);
            f3p3textfield3.setText("");
            f3p3textfield4.setText("");
        }
        
        // when login menuitem is press display window become dispose and a new window is open 
        if(e.getSource()==login)
        {
            frame1.dispose();
            Transport_GUI obj6 = new Transport_GUI();
            obj6.Login();
        }
        
        // when login menuitem is press display window become dispose and a new window is open 
        if(e.getSource()==f3menuitem4444)
        {
            frame2.dispose();
            frame3.dispose();
            Transport_GUI obj6 = new Transport_GUI();
            obj6.Login();
        }
        
        // when login menuitem is press display window become dispose and a new window is open 
        if(e.getSource()==f3menuitem44)
        {
            frame2.dispose();
            frame3.dispose();
            Transport_GUI obj6 = new Transport_GUI();
            obj6.Transport_GUI8();
        }
        
        // when this button is press display window become dispose and a new window is open 
        if(e.getSource()==autorickshaw)
        {
            frame1.dispose();
            Transport_GUI obj5 = new Transport_GUI();
            obj5.Auto_Rickshaw1();
        }
        
        // when this button is press display window become dispose and a new window is open 
        if(e.getSource()==electricscooter)
        {
            frame1.dispose();
            Transport_GUI obj7 = new Transport_GUI();
            obj7.Electric_Scooter1();
        }

        //add autorickshaw
        if(e.getSource()==f3p2btn1)
        {
            /*
            when any of mention TextField is left empty and add button is press following message is display in ERROR dialogbox
            */
            
            if(f3p2textfield2.getText().isEmpty() || f3p2textfield3.getText().isEmpty() || f3p2textfield4.getText().isEmpty() || f3p2textfield5.getText().isEmpty() || 
               f3p2textfield6.getText().isEmpty() || f3p2textfield7.getText().isEmpty() || f3p2textfield8.getText().isEmpty() || f3p2textfield9.getText().isEmpty() ||
               f3p2textfield10.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(registationframe, "Empty field present ???", "ERROR", 
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int vID = Integer.parseInt(f3p2textfield2.getText());
                    String vName = f3p2textfield3.getText();
                    String vWeight = f3p2textfield4.getText();
                    String vColor = f3p2textfield5.getText();
                    String vSpeed = f3p2textfield6.getText();
                    int engineDisplacement = Integer.parseInt(f3p2textfield7.getText());
                    String torque = f3p2textfield8.getText();
                    int fuelTankCapacity = Integer.parseInt(f3p2textfield9.getText());
                    String groundClearance = f3p2textfield10.getText();
                    boolean unique = false;
                    /*
                    it check all the index of array list and enter Vehicle ID is already register or present in array list an ERROR is appear in dialogbox
                    */
                    for(Vehicle obj_1 : vehicle)
                    {
                        if(obj_1.getvehicleID() == vID)
                        {
                            unique = true;
                            break;
                        }
                    }
                    /*
                     * if enter Vehicle ID not present in array list, enter value is added in array list and vehicle is added
                    */
                    if(unique == false)
                    {
                        AutoRickshaw obj15 = new AutoRickshaw(vID,vName,vWeight,vColor,vSpeed,engineDisplacement,torque,fuelTankCapacity,groundClearance);
                        vehicle.add(obj15);
                        JOptionPane.showMessageDialog(f3panel2,("You have successfulley added AutoRickshaw.\n")+("Vehicle ID: "+vID)+("\nVehicle Weight: "+vWeight)+
                                                      ("\nVehicle Color: "+vColor)+("\nVehicle Speed: "+vSpeed)+("\nEngine Displacement: "+engineDisplacement+(" cm"))+
                                                      ("\nTorque: "+torque)+("\nFuel Tank Capacity: "+fuelTankCapacity+(" Litres"))+("\nGroung Clerance: "+groundClearance));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f3panel2, "Vehicle ID: "+vID+" is already register.", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException nf)
                {
                    JOptionPane.showMessageDialog(registationframe, "\t\tInvalid!!!\nPlease enter Vehicle ID, Engine Displacement and Fuel Tank Capacity in Integer ???", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //add electricscooter
        if(e.getSource()==f2p2btn1)
        {
            /*
            when any of mention TextField is left empty and add button is press following message is display in ERROR dialogbox
            */
            if(f2p2textfield2.getText().isEmpty() || f2p2textfield3.getText().isEmpty() || f2p2textfield4.getText().isEmpty() || f2p2textfield5.getText().isEmpty() ||
               f2p2textfield6.getText().isEmpty() || f2p2textfield7.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(registationframe, "Invalid!!! Empty field present ???", "ERROR", 
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    int vID = Integer.parseInt(f2p2textfield2.getText());
                    String vName = f2p2textfield3.getText();
                    String vWeight = f2p2textfield4.getText();
                    String vColor = f2p2textfield5.getText();
                    String vSpeed = f2p2textfield6.getText();
                    int batteryCapacity = Integer.parseInt(f2p2textfield7.getText());
                    boolean duplicate = false;
                    /*
                    it check all the index of array list and enter Vehicle ID is already register or present in array list an ERROR is appear in dialogbox
                    */
                    for(Vehicle obj79 : vehicle)
                    {
                        if(obj79.getvehicleID() ==vID)
                        {
                            duplicate = true;
                            break;
                        }
                    }
                    /*
                     * if enter Vehicle ID not present in array list, enter value is added in array list and vehicle is added
                    */
                    if(duplicate == false)
                    {
                        ElectricScooter obj16 = new ElectricScooter(vID,vName,vWeight,vColor,vSpeed,batteryCapacity);
                        vehicle.add(obj16);
                        JOptionPane.showMessageDialog(f2panel2,("You have successfulley added ElectricScooter.\n")+("vehicle ID: "+vID)+("\nVehicle Weight: "+vWeight)+
                                                        ("\nVehicle Color: "+vColor)+("\nVehicle Speed: "+vSpeed)+("\nBattery Capacity: "+batteryCapacity+(" Km")));
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f2panel2, "Vehicle ID: "+vID+" is already register.", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException ne)
                {
                    JOptionPane.showMessageDialog(registationframe, "\t\tInvalid!!!\nPlease enter Vehicle ID and Battery Capacity in Integer ???", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        //to book an autorickshaw
        if (e.getSource()==f3p3btn2)
        {
            /*
             *if size of array list is empty or not any Vehicle ID is Added is added following message is display asking user to add an vehicle first
            */
            if(vehicle.size() == 0)
            {
                JOptionPane.showMessageDialog(f3panel2,"Please Add an Auto RickShaw first.");
            }
            else
            {
                /*
                when any of mention TextField is left empty and add button is press following message is display in ERROR dialogbox
                */
                if(f3p3textfield1.getText().isEmpty() || f3p3combobox2.getSelectedItem() == null || f3p3combobox22.getSelectedItem() == null || f3p3combobox222.getSelectedItem() == null || f3p3textfield3.getText().isEmpty() || f3p3textfield4.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(registationframe, "Invalid!!! Empty field present ???", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    try
                    {
                        int vID = Integer.parseInt(f3p3textfield1.getText());
                        String bookedDateYear = (String)f3p3combobox2.getSelectedItem();
                        String bookedDateMonth = (String)f3p3combobox22.getSelectedItem();
                        String bookedDateDay = (String)f3p3combobox222.getSelectedItem();
                        String bookedDate= bookedDateYear + " "+ bookedDateMonth +" "+ bookedDateDay;
                        int chargeAmount = Integer.parseInt(f3p3textfield3.getText());
                        int numberOfSeats = Integer.parseInt(f3p3textfield4.getText());
                        /*
                        for each loop used to iterate to each and every index of array list
                        */
                        for(Vehicle obj20 : vehicle)
                        {
                            /*
                            it comprae the the object vehicle class and is set for AutoRickshaw
                            */
                            if(obj20 instanceof AutoRickshaw)
                            {
                                
                                AutoRickshaw auto_obj = (AutoRickshaw) obj20;//downcast of vehicle class with reference AutoRickshaw
                                /*
                                 *it compare the enter Vehicle ID with added vehicle ID in an arrar list
                                 *if match following task is performed or Invalid message is display 
                                */
                                if(auto_obj.getvehicleID() == vID)
                                {
                                    JOptionPane.showMessageDialog(f3panel2,("You have successfulley Booked an AutoRickshaw.\n")+
                                                      ("Vehicle ID: "+vID)+("\nBooked Date: "+bookedDate )+("\nCharge Amount: Rs. "+chargeAmount )
                                                      +("\nNumber Of Seats: "+numberOfSeats));
                                    /*
                                    if enter Vehicle ID is not register or present in arrar list an AutoRicksaw is booked
                                    */
                                    if(auto_obj.getisBooked() == false)
                                    {
                                        auto_obj.Book(bookedDate , chargeAmount, numberOfSeats);
                                    }
                                    /*
                                    if enter Vehicle ID is already register or present in arrar list following message is display
                                    */
                                    else if(auto_obj.getisBooked() == true)
                                    {
                                        JOptionPane.showMessageDialog(f3panel2,"You have already Booked an AutoRickshaw.");
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(registationframe, "Vehicle ID Not Match.", "ERROR", 
                                    JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                    catch(NumberFormatException nf)
                    {
                        JOptionPane.showMessageDialog(registationframe, "\t\tInvalid!!!\nPlease enter Vehicle ID, Charge Amount and Number of Seats in Integer ???", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        
        //purchased electricscooter
        if (e.getSource()==f2p3btn1)
        {
            /*
             *if size of array list is empty or not any Vehicle ID is Added is added following message is display asking user to add an vehicle first
            */
            if(vehicle.size() == 0)
            {
                JOptionPane.showMessageDialog(f3panel2,"Please Add an Electric Scooter first.");
            }
            else
            {
                /*
                when any of mention TextField is left empty and add button is press following message is display in ERROR dialogbox
                */
                if(f2p3textfield1.getText().isEmpty() || f2p3textfield2.getText().isEmpty() || f2p3textfield3.getText().isEmpty() || 
                   f2p3textfield4.getText().isEmpty() || f2p3textfield5.getText().isEmpty() || f2p3textfield6.getText().isEmpty()) 
                {
                    JOptionPane.showMessageDialog(registationframe, "Empty field present ???", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                     try
                    {
                        int vID = Integer.parseInt(f2p3textfield1.getText());
                        String brand = f2p3textfield2.getText();
                        int price = Integer.parseInt(f2p3textfield3.getText());
                        String chargingTime = f2p3textfield4.getText();
                        String mileage = f2p3textfield5.getText();
                        int range = Integer.parseInt(f2p3textfield6.getText());
                        /*
                        for each loop used to iterate to each and every index of array list
                        */
                        for(Vehicle obj21 : vehicle)
                        {
                            if(obj21 instanceof ElectricScooter)
                            {
                                ElectricScooter electric_obj = (ElectricScooter) obj21;//downcast of vehicle class with reference ElectricScooter
                                /*
                                 *it compare the enter Vehicle ID with added vehicle ID in an arrar list
                                 *if match following task is performed else Invalid message is display 
                                */
                                if(electric_obj.getvehicleID() == vID)
                                {
                                    /*
                                    if enter Vehicle ID is not register or present in arrar list an ElectricScooter is Purchased
                                    */
                                    if(electric_obj.gethasPurchased() == false)
                                    {
                                        electric_obj.Purchase(brand,price,chargingTime,mileage,range);
                                        JOptionPane.showMessageDialog(f2panel3,("You have successfulley Purchased an ElectricScooter.\n")+
                                                      ("Vehicle ID: "+vID)+("\nBrand: "+brand )+("\nPrice: Rs."+price )
                                                      +("\nCharging Time: "+chargingTime+(" Hours"))+("\nMileage: "+mileage+("Km"))+("\nRange: "+range+("Km"))); 
                                                      // "\n" is used to break line in Dialog Box
                                    }
                                    /*
                                    if enter Vehicle ID is already Purchased following message is display
                                    */
                                    else if(electric_obj.gethasPurchased() == true)
                                    {
                                        electric_obj.setbrand(brand);
                                        JOptionPane.showMessageDialog(registationframe, "The ElectricScooter with Vehicle ID: "+vID+" is already purchased",
                                        "ERROR", 
                                        JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(registationframe, "Vehicle ID Not Match.", "ERROR", 
                                    JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                    catch(NumberFormatException nf)
                    {
                        JOptionPane.showMessageDialog(registationframe, "\t\tInvalid!!!\nPlease enter Vehicle ID Price and Range in Integer ???", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        
        //sell electricscooter
        if (e.getSource()==f2p3btn2)
        {
            /*
             *if size of array list is empty or not any Vehicle ID is Added is added following message is display asking user to add an vehicle first
            */
             if(vehicle.size() == 0)
            {
                JOptionPane.showMessageDialog(f3panel2,"Please Add an Electric Scooter first.");
            }
            else
            {
                /*
                when any of mention TextField is left empty and add button is press following message is display in ERROR dialogbox
                */
                if(txtSell.getText().isEmpty() || txtSell1.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(registationframe, "Invalid!!! Empty field present", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    try
                    {
                        int vID = Integer.parseInt(txtSell.getText());
                        int price = Integer.parseInt(txtSell1.getText());
                        /*
                        for each loop used to iterate to each and every index of array list
                        */
                        for (Vehicle obj22 : vehicle)
                        {
                            if(obj22 instanceof ElectricScooter)
                            {
                                ElectricScooter electric_obj1 = (ElectricScooter) obj22;//downcast of vehicle class with reference ElectricScooter
                                /*
                                 *it compare the enter Vehicle ID with added vehicle ID in an arrar list
                                 *if match following task is performed else Invalid message is display 
                                */
                                if(electric_obj1.getvehicleID() == vID)
                                {
                                    /*
                                    if enter Vehicle ID is not register or present in arrar list an ElectricScooter is Sell
                                    */
                                    if(electric_obj1.gethasSold() == false)
                                    {
                                        electric_obj1.Sell(price);
                                        JOptionPane.showMessageDialog(f2panel3,"You have Successfulley Sell an ElectricScooter.\n"+
                                        ("Vehicle ID: "+vID)+("\nPrice: Rs."+price));
                                        
                                    }
                                    /*
                                    if enter Vehicle ID is already Sell following message is display
                                    */
                                    else if(electric_obj1.gethasSold() == true)
                                    {
                                        JOptionPane.showMessageDialog(f2panel3, "The ElectricScooter with Vehicle ID: "+vID+" is already  Sold.", "ERROR", 
                                        JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f2panel3, "Vehicle ID Not Match.", "ERROR", 
                                    JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                    catch(NumberFormatException nf)
                    {
                        JOptionPane.showMessageDialog(registationframe, "Invalid!!! Please enter Vehicle ID and Price in Integer ???", "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
        
        //display for autorickshaw
        if(e.getSource() == f3p3btn3)
        {
            if(vehicle.size() == 0)
            {
                JOptionPane.showMessageDialog(f3panel2,"Please Add or Book an Auto RickShaw first to display.");
            }
            else
            {
                for(Vehicle i : vehicle)
                {
                    if(i instanceof AutoRickshaw)
                    {
                        AutoRickshaw ww = (AutoRickshaw) i;
                        int vID = ww.getvehicleID();
                        String vName = ww.getvehicleName();
                        String vColor = ww.getvehicleColor();
                        String vWeight = ww.getvehicleWeight();
                        String vSpeed = ww.getvehicleSpeed();
                        int eD = ww.getengineDisplacement();
                        String t = ww.gettorque();
                        int fTC = ww.getfuelTankCapacity();
                        String gC = ww.getgroundClearance();
                        String bD = (String)ww.getbookedDate();
                        int cA = ww.getchargeAmount();
                        int nS = ww.getnumberOfSeats();
                        i.display();
                        JOptionPane.showMessageDialog(f2panel3,("Vehicle ID: "+vID)+("\nVehicle Nam: "+vID)+("\nVehicle Weight: "+vWeight)+("\nVehicle Color: "+vColor)+("\nVehicle Speed: "+vSpeed)+
                                                                ("\nEngine Displacemeny: "+eD)+("\nTorque: "+t)+("\nFuel Tank Capacity: "+fTC)+("\nGround Clearanc: "+gC)+
                                                                ("\nBookrd Date: "+bD)+("\nCharge Amount: "+cA)+("\nNumber of Seats: "+nS));
                    }
                }
            }
        }
        
        //display for electricscooter
        if(e.getSource() == f2p3btn3)
        {
            if(vehicle.size() == 0)
            {
                JOptionPane.showMessageDialog(f3panel2,"Please Add, Purchased or Sell an Electric Scooter first to display.");
            }
            else
            {
                for(Vehicle j : vehicle)
                {
                    if(j instanceof ElectricScooter)
                    {
                        ElectricScooter we = (ElectricScooter) j;
                        int vID = we.getvehicleID();
                        String vName = we.getvehicleName();
                        String vColor = we.getvehicleColor();
                        String vWeight = we.getvehicleWeight();
                        String vSpeed = we.getvehicleSpeed();
                        String brand = we.getbrand();
                        int bC = we.getbatteryCapacity();
                        String mileage = we.getmileage();
                        int range = we.getrange();
                        String cT = we.getchargingTime();
                        int p = we.getprice();
                        JOptionPane.showMessageDialog(f2panel3,("Vehicle ID: "+vID)+("\nVehicle Nam: "+vID)+("\nVehicle Weight: "+vWeight)+("\nVehicle Color: "+vColor)+
                                                     ("\nVehicle Speed: "+vSpeed)+("\nBrand: "+brand)+("\nbBattery Capacity:"+bC)+("\nMileage: "+mileage)+("\nrang: "+range)
                                                     +("\nCharging Time: "+cT)+("\nPrice: "+p));
                        j.display();
                    }
                }
            }
        }
    }
    
     public static void main(String[]args)
    {
        Transport_GUI login = new Transport_GUI();
        login.Login(); 
    }
}