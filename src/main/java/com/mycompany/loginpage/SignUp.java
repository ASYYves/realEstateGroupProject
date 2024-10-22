/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo Ideapad
 */
public class SignUp extends JFrame implements ActionListener{

    private final JTextField txtNameField;
    private JTextField txtUsernameField, txtContactField;
    private JPasswordField pfPasswordField, pfRetypePasswordField;
    private JButton btnSignUpButton, btnBackButton;
    private JLabel lblQuahogSpringField1, lblQuahogSpringField2, lblQuahogSpringField3, lblNameLabel, lblUsernameLabel, lblContactLabel, lblPasswordLabel, lblRetypeLabel, lblMessageLabel;
    private JPanel jpLogo;

    public SignUp() {
        setTitle("Sign Up");
        setSize(400, 600);
        setLayout(null); 
        
        lblQuahogSpringField1 = new JLabel("Quahog Springfield");
        lblQuahogSpringField1.setBounds(20, 35, 360, 40);
        lblQuahogSpringField1.setHorizontalAlignment(JLabel.CENTER);
        lblQuahogSpringField1.setFont(new Font("Arial", Font.PLAIN, 35));
        add(lblQuahogSpringField1);
        
        lblQuahogSpringField2 = new JLabel("Real Estates");
        lblQuahogSpringField2.setBounds(20, 75, 360, 30);
        lblQuahogSpringField2.setHorizontalAlignment(JLabel.CENTER);
        lblQuahogSpringField2.setFont(new Font("Arial", Font.PLAIN, 20));
        add(lblQuahogSpringField2);
        
        lblQuahogSpringField3 = new JLabel("Create Account");
        lblQuahogSpringField3.setBounds(20, 270, 360, 30);
        lblQuahogSpringField3.setHorizontalAlignment(JLabel.CENTER);
        lblQuahogSpringField3.setFont(new Font("Arial", Font.PLAIN, 30));
        add(lblQuahogSpringField3);
        
        jpLogo = new JPanel();
        jpLogo.setBounds(150,140,100,100);
        jpLogo.setBackground(Color.red);
        add(jpLogo);
        
        
        lblNameLabel = new JLabel("Name:");
        lblNameLabel.setBounds(20, 330, 360, 30);
        lblNameLabel.setHorizontalAlignment(JLabel.LEFT);
        lblNameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblNameLabel);

        txtNameField = new JTextField();
        txtNameField.setBounds(120, 335, 240, 20);
        add(txtNameField);

        lblUsernameLabel = new JLabel("Username:");
        lblUsernameLabel.setBounds(20, 360, 100, 30);
        lblUsernameLabel.setHorizontalAlignment(JLabel.LEFT);
        lblUsernameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblUsernameLabel);

        txtUsernameField = new JTextField();
        txtUsernameField.setBounds(120, 365, 240, 20);
        add(txtUsernameField);
        
        lblContactLabel = new JLabel("Contact:");
        lblContactLabel.setBounds(20, 390, 100, 30);
        lblContactLabel.setHorizontalAlignment(JLabel.LEFT);
        lblContactLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblContactLabel);
        
        txtContactField = new JTextField();
        txtContactField.setBounds(120, 395, 240, 20);
        add(txtContactField);

        lblPasswordLabel = new JLabel("Password:");
        lblPasswordLabel.setBounds(20, 420, 360, 30);
        lblPasswordLabel.setHorizontalAlignment(JLabel.LEFT);
        lblPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        add(lblPasswordLabel);

        pfPasswordField = new JPasswordField();
        pfPasswordField.setBounds(120, 425, 240, 20);
        add(pfPasswordField);

        lblRetypeLabel = new JLabel("Retype Password:");
        lblRetypeLabel.setBounds(20, 450, 360, 30);
        lblRetypeLabel.setHorizontalAlignment(JLabel.LEFT);
        lblRetypeLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        add(lblRetypeLabel);

        pfRetypePasswordField = new JPasswordField();
        pfRetypePasswordField.setBounds(120, 455, 240, 20);
        add(pfRetypePasswordField);

        btnBackButton = new JButton("Back");
        btnBackButton.setBounds(175, 505, 80, 25);
        btnBackButton.addActionListener(this);
        add(btnBackButton);
        
        btnSignUpButton = new JButton("Sign Up");
        btnSignUpButton.setBounds(275, 505, 80, 25);
        btnSignUpButton.addActionListener(this);
        add(btnSignUpButton);

        lblMessageLabel = new JLabel();
        lblMessageLabel.setBounds(240, 530, 300, 25);
        add(lblMessageLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource() == btnSignUpButton) {
        String password = new String(pfPasswordField.getPassword());
        String retypePassword = new String(pfRetypePasswordField.getPassword());

            if (!password.equals(retypePassword)) {
                lblMessageLabel.setText("Password do not match!");

            } 

            else {
                lblMessageLabel.setText(" Sign up successful!");
            }
        }
        
        
        else if (e.getSource()==btnBackButton) {
            welcomePage welcome = new welcomePage();
            welcome.setVisible(true);
            dispose(); 
        }
        
    }
}
