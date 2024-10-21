/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginpage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author johnl
 */
public class welcomePage extends JFrame implements  ActionListener{
    private JLabel lblWelcome,lblRealEstate, lblTagLine1,lblTagLine2, lblTo;
    private JButton btnLogin,btnSignUp;
    private JPanel jpLogo;
    
    public welcomePage() {
        setTitle("Homepage");
        setSize(400,600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblWelcome = new JLabel("WELCOME");
        lblWelcome.setBounds(0,20,400,60);
        lblWelcome.setHorizontalAlignment(JLabel.CENTER);
        lblWelcome.setFont(new Font("Arial", Font.PLAIN, 40));
        add(lblWelcome);
        
//        lblTo = new JLabel("to");
//        lblTo.setBounds(0,55,400,50);
//        lblTo.setHorizontalAlignment(JLabel.CENTER);
//        lblTo.setFont(new Font("Arial", Font.PLAIN, 20));
//        add(lblTo);
        
        lblRealEstate = new JLabel("Quahog Springfield Real Estate");
        lblRealEstate.setBounds(0,90,380,50);
        lblRealEstate.setHorizontalAlignment(JLabel.CENTER);
        lblRealEstate.setFont(new Font("Arial", Font.PLAIN, 25));
        add(lblRealEstate);
        
        jpLogo = new JPanel();
        jpLogo.setBounds(95,160,200,200);
        jpLogo.setBackground(Color.red);
        add(jpLogo);
        
        lblTagLine1 = new JLabel("From Springfield to Spooner Street");
        lblTagLine1.setBounds(0,380,400,20);
        lblTagLine1.setHorizontalAlignment(JLabel.CENTER);
        lblTagLine1.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblTagLine1);
        
        lblTagLine2 = new JLabel("Make Your Move with Us!");
        lblTagLine2.setBounds(0,410,400,15);
        lblTagLine2.setHorizontalAlignment(JLabel.CENTER);
        lblTagLine2.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblTagLine2);
        
        btnLogin = new JButton("Log In");
        btnLogin.setBounds(150,450, 100,35);
        btnLogin.setHorizontalAlignment(JLabel.CENTER);
        btnLogin.setFont(new Font("Arial", Font.PLAIN, 15));
        add(btnLogin);
        
        btnSignUp = new JButton("Sign Up");
        btnSignUp.setBounds(150,490, 100,35);
        btnSignUp.setHorizontalAlignment(JLabel.CENTER);
        btnSignUp.setFont(new Font("Arial", Font.PLAIN, 15));
        add(btnSignUp);
        
        btnLogin.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogin){
            loginPage loginPage = new loginPage();
            loginPage.setVisible(true);
            dispose();
            
        }
    }
 
}
