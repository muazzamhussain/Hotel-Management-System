/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotel;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon("hotelmanagementsystem\\src\\main\\resources\\images\\Main.jpg");
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel welcometext = new JLabel("THE KAMARTAJ WELCOMES YOU");
	welcometext.setForeground(Color.BLACK);
        welcometext.setFont(new Font("Century Gothic", Font.BOLD, 46));
	welcometext.setBounds(600, 60, 1000, 85);
	NewLabel.add(welcometext);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu Menus = new JMenu("HOTEL MANAGEMENT");
        Menus.setForeground(Color.BLUE);
	menuBar.add(Menus);
		
        JMenuItem receptionist = new JMenuItem("RECEPTION");
	Menus.add(receptionist);
		
	JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.RED);
	menuBar.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
	admin.add(addemployee);

        JMenu power = new JMenu("POWER");
        JMenuItem logout = new JMenuItem("Log out");
        JMenuItem close = new JMenuItem("Exit");
        power.add(logout);
        power.add(close);
        menuBar.add(power);
        
        addemployee.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem addroom = new JMenuItem("ADD ROOMS");
	admin.add(addroom);
        
        addroom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	receptionist.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});
        
        
        JMenuItem adddriver = new JMenuItem("ADD DRIVERS");
	admin.add(adddriver);
        
	adddriver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});

	logout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                setVisible(false);
                new Login().setVisible(true);
        }
	});
	close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0); 
        }
	});
        
		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
