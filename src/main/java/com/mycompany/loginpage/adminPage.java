package com.mycompany.loginpage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class adminPage extends JFrame implements ActionListener{

    
    private JPanel logo, l, usersJPanel, addJPanel, delJPanel, profileJPanel, transactJPanel; 
    private JLabel lQs, lRe;
    private JButton btnAdd, btnDel, btnTransact, btnUsers,  btnProfile;
//    private JTabbedPane jtab;
    public adminPage() {
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        logo=new JPanel();
        logo.setBounds(10,10,80,80);
        logo.setBackground(Color.green);
        add(logo);
        
        
        
        lQs=new JLabel("QUAHOG SPRINGFIELDS");
        lQs.setBounds(120,10,300,50);
        lQs.setFont(new Font("Arial", Font.BOLD, 25));
        add(lQs);
        
        lRe=new JLabel("REAL ESTATES");
        lRe.setBounds(120,40,300,50);
        lRe.setFont(new Font("Arial", Font.BOLD, 15));
        add(lRe);
        
        
        
        btnAdd=new JButton("ADD");
        btnAdd.setBounds(525,60,100,25);
        btnAdd.setBorder(null);
        btnAdd.setBackground(Color.CYAN);
        btnAdd.setFocusable(false);
        btnAdd.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnAdd);
        
        btnDel=new JButton("DELETE");
        btnDel.setBounds(650,60,100,25);
        btnDel.setBorder(null);
        btnDel.setBackground(Color.CYAN);
        btnDel.setFocusable(false);
        btnDel.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnDel);
        
        btnUsers=new JButton("USERS");
        btnUsers.setBounds(775,60,100,25);
        btnUsers.setBorder(null);
        btnUsers.setFocusable(false);
        btnUsers.setBackground(Color.CYAN);
        btnUsers.setFocusable(false);
        btnUsers.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnUsers);
        
        btnTransact=new JButton("TRANSACTIONS");
        btnTransact.setBounds(900,60,130,25);
        btnTransact.setBorder(null);
        btnTransact.setFocusable(false);
        btnTransact.setBackground(Color.CYAN);
        btnTransact.setFocusable(false);
        btnTransact.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnTransact);
        
        btnProfile=new JButton("PROFILE");
        btnProfile.setBounds(1055,60,130,25);
        btnProfile.setBorder(null);
        btnProfile.setFocusable(false);
        btnProfile.setBackground(Color.CYAN);
        btnProfile.setFont(new Font("Arial", Font.BOLD, 15));
        add(btnProfile);
        
      
     
        
        transactJPanel= new JPanel();
        transactJPanel.setBounds(0,0,1200,560);
        transactJPanel.setBackground(Color.pink);
     //   jtab.add(transactJPanel);
        
        profileJPanel= new JPanel();
        profileJPanel.setBounds(0,0,1200,560);
        profileJPanel.setBackground(Color.green);
     //   jtab.add(profileJPanel);
        
        btnAdd.addActionListener(this);
        btnAdd.addActionListener(this);
        btnUsers.addActionListener(this);
        btnTransact.addActionListener(this);
        btnProfile.addActionListener(this);
        
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
//        if(e.getSource()==btnAdd){
//            jtab.setSelectedIndex(0);
//        }else if(e.getSource()==btnUsers){
//            jtab.setSelectedIndex(1);
//        }else if(e.getSource()==btnTransact){
//            jtab.setSelectedIndex(2);
//        }else if(e.getSource()==btnProfile){
//            jtab.setSelectedIndex(3);
//        }
//       
    }
        
}