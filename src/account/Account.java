package account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Account {
//    this is the main frame when you run the program, it asks for the user password
    JFrame mainFrame = new JFrame("Bank Application");

    JTextField passwordField = new JTextField("Enter your password");
    JButton passwordSubmit = new JButton("Enter");

    JButton currentAccount = new JButton("Current");
    JButton savingsAccount = new JButton("Savings");

//    these are for the things for the Current Account
    JButton deposit = new JButton("Deposit");
    JTextField depositAmount = new JTextField("Enter the deposit amount");

    JButton withdraw = new JButton("Withdraw");
    JTextField withdrawAmount = new JTextField("Enter the withdraw amount");


    public static void main(String[] args) {




    }

    public void mainUi( ) {
        BankAccount bankAccount = new BankAccount();

        mainFrame.add(passwordField);
        mainFrame.add(passwordSubmit);

        mainFrame.setSize(150,200);
        mainFrame.setVisible(true);
        mainFrame.setLayout(new GridLayout(2,1));
        passwordSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame accountsFrame = new JFrame("Accounts");
                int pin = (int) Float.parseFloat(passwordField.getText());
                if (pin != 5555){
                    JOptionPane.showMessageDialog(null, pin,
                            "The Pin you entered is wrong", JOptionPane.INFORMATION_MESSAGE);
                } else{
                    drawAccountsFrame();
                }


            }
        });


        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void drawAccountsFrame(){
        BankAccount bankAccount = new BankAccount();
        mainFrame.add(currentAccount);
        mainFrame.add(savingsAccount);

        currentAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawCurrentAccount();
                JOptionPane.showMessageDialog(null,"You Have Chosen Current Account","Current Account",JOptionPane.INFORMATION_MESSAGE);

            }
        });

        savingsAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"You Have Chosen Savings Account", "Savings Account", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        mainFrame.setLayout(new GridLayout(2,1));
        mainFrame.setSize(150,200);
        mainFrame.setVisible(true);
    }

    public void drawCurrentAccount(){
        mainFrame.add(deposit);
        mainFrame.add(depositAmount);
        mainFrame.add(withdraw);
        mainFrame.add(withdrawAmount);

        BankAccount bankAccount = new BankAccount();

        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               float deposit = bankAccount.deposit(Float.parseFloat(depositAmount.getText()));
               JOptionPane.showMessageDialog(null,deposit,"Amount Deposited",JOptionPane.INFORMATION_MESSAGE);

            }
        });

        withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float withdraw = bankAccount.withdraw(Float.parseFloat(withdrawAmount.getText()));
                JOptionPane.showMessageDialog(null,withdraw,"Amount Withdrawn",JOptionPane.INFORMATION_MESSAGE);
            }
        });


        mainFrame.setLayout(new GridLayout(2,2));
        mainFrame.setSize(150,200);
        mainFrame.setVisible(true);
    }

}
