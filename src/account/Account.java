package account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Account {
//    this is the main frame when you run the program, it asks for the user password
    JFrame mainFrame = new JFrame("Bank Application");

    JTextField passwordField = new JTextField("Enter your password:");
    JButton passwordSubmit = new JButton("Enter");

    JButton currentAccount = new JButton("Current");
    JButton savingsAccount = new JButton("Savings");
    public static void main(String[] args) {




    }

    public void mainUi( ) {
        mainFrame.add(passwordField);
        mainFrame.add(passwordSubmit);

        mainFrame.setSize(150,200);
        mainFrame.setVisible(true);
        mainFrame.setLayout(new GridLayout(2,1));
        passwordSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame accountsFrame = new JFrame("Accounts");

            }
        });


    }
    public void drawAccountsFrame(){
        BankAccount bankAccount = new BankAccount();
        mainFrame.add(currentAccount);
        mainFrame.add(savingsAccount);

        currentAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
