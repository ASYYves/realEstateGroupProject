/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginpage;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class receiptPage extends JFrame {
    
    private JLabel lblQuahogSpringField1, lblQuahogSpringField2, lblName, lblUserName, lblDate, lblTime, lblProductName, lblProductID, lblPrice, lblTransactionID, lblPurchasedEstate, lblOfficial, lblThankYou;
    private JPanel jpLogo;
    private JButton btnBackToHome;
    
    
    public receiptPage () {
       
        
        setSize(400, 600);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lblQuahogSpringField1 = new JLabel("Quahog Springfield");
        lblQuahogSpringField1.setBounds(20, 20, 360, 30);
        lblQuahogSpringField1.setHorizontalAlignment(JLabel.CENTER);
        lblQuahogSpringField1.setFont(new Font("Arial", Font.PLAIN, 25));
        add(lblQuahogSpringField1);
        
        
        lblQuahogSpringField2 = new JLabel("Real Estates");
        lblQuahogSpringField2.setBounds(20, 55, 360, 20);
        lblQuahogSpringField2.setHorizontalAlignment(JLabel.CENTER);
        lblQuahogSpringField2.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblQuahogSpringField2);
        
        
        jpLogo = new JPanel();
        jpLogo.setBounds(150,80,100,100);
        jpLogo.setBackground(Color.red);
        add(jpLogo);
        
        
        lblName = new JLabel("Name :");
        lblName.setBounds(20, 210, 360, 15);
        lblName.setHorizontalAlignment(JLabel.LEFT);
        lblName.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblName);
        
        
        lblUserName = new JLabel("Username :");
        lblUserName.setBounds(20, 240, 360, 15);
        lblUserName.setHorizontalAlignment(JLabel.LEFT);
        lblUserName.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblUserName);
        
        
        lblPurchasedEstate = new JLabel("- - - - - - - - - - - - - - - Purchased Estate - - - - - - - - - - - - - - -");
        lblPurchasedEstate.setBounds(20, 270, 360, 15);
        lblPurchasedEstate.setHorizontalAlignment(JLabel.CENTER);
        lblPurchasedEstate.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblPurchasedEstate);
        
        
        lblProductName = new JLabel("Estate Name :");
        lblProductName.setBounds(20, 300, 360, 15);
        lblProductName.setHorizontalAlignment(JLabel.LEFT);
        lblProductName.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblProductName);
        
        
        lblProductID = new JLabel("Estate ID :");
        lblProductID.setBounds(20, 330, 360, 15);
        lblProductID.setHorizontalAlignment(JLabel.LEFT);
        lblProductID.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblProductID);
        
        
        lblTime = new JLabel("Time Purchased :");
        lblTime.setBounds(20, 360, 360, 15);
        lblTime.setHorizontalAlignment(JLabel.LEFT);
        lblTime.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblTime);
        
        
        lblDate = new JLabel("Date Purchased :");
        lblDate.setBounds(20, 390, 360, 15);
        lblDate.setHorizontalAlignment(JLabel.LEFT);
        lblDate.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblDate);
        
        
        lblPrice = new JLabel("Paid Amount :");
        lblPrice.setBounds(20, 420, 360, 15);
        lblPrice.setHorizontalAlignment(JLabel.LEFT);
        lblPrice.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblPrice);
        
        
        lblTransactionID = new JLabel("Transaction ID :");
        lblTransactionID.setBounds(20, 450, 360, 15);
        lblTransactionID.setHorizontalAlignment(JLabel.LEFT);
        lblTransactionID.setFont(new Font("Arial", Font.PLAIN, 10));
        add(lblTransactionID);
        
        lblOfficial = new JLabel("THIS IS AN OFFICIAL RECEIPT");
        lblOfficial.setBounds(20, 480, 360, 20);
        lblOfficial.setHorizontalAlignment(JLabel.CENTER);
        lblOfficial.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblOfficial);
        
        
        lblThankYou = new JLabel("Thank you for purchase!");
        lblThankYou.setBounds(20, 500, 360, 20);
        lblThankYou.setHorizontalAlignment(JLabel.CENTER);
        lblThankYou.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblThankYou);
        
        
        btnBackToHome = new JButton("Back to Home");
        btnBackToHome.setBounds(245, 530, 130, 20);
        btnBackToHome.setFocusable(false);
        btnBackToHome.setHorizontalAlignment(JLabel.CENTER);
        btnBackToHome.setFont(new Font("Arial", Font.PLAIN, 15));
        add(btnBackToHome);
        
        
        setVisible(true);
    }
    
}
