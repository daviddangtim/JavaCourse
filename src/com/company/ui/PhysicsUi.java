package com.company.ui;

import com.company.Geometry;
import com.company.Physics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsUi {
//    Frame
    JFrame myFrame = new JFrame("Physics");

//    Create Buttons
    JButton kineticEnergy = new JButton("Kinetic Energy");
    JButton potentialEnergy = new JButton("Potential Energy");
    JButton momentum = new JButton("Momentum");

//    Main method
    public void mainUi(){
        myFrame.add(kineticEnergy);
        myFrame.add(potentialEnergy);
        myFrame.add(momentum);

//        frame sizing
        myFrame.setSize(150,200);

//        frame layout
        myFrame.setLayout(new GridLayout(3,1));

//        frame visibility
        myFrame.setVisible(true);
//         First Method
        kineticEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculate Kinetic Energy");
                JFrame kineticEnergy = new JFrame("Kinetic Energy") ;
                drawKineticEnergy();

            }
        });

//      Second Method
        potentialEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculate Potential Energy");
                JFrame potentialEnergy = new JFrame("Potential Energy");
                drawPotentialEnergy();
            }
        });

        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    JTextField enterMass = new JTextField("Enter Mass");
    JTextField enterVelocity = new JTextField("Enter Velocity");
    JTextField enterHeight = new JTextField("Enter Height");

    JButton calculateMomentum = new JButton("Calculate");
    JButton calculatePotentialEnergy = new JButton("Calculate");
    JButton calculateKineticEnergy = new JButton("Calculate");
//First solution box
    public void drawKineticEnergy(){
        Physics phy = new Physics();
        myFrame.add(enterMass);
        myFrame.add(enterVelocity);
        myFrame.add(calculateKineticEnergy);
        calculateKineticEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float kinEnergy = phy.kineticEnergy(Float.parseFloat(enterMass.getText()),
                        Float.parseFloat(enterVelocity.getText()));
                JOptionPane.showMessageDialog(null, kinEnergy, "The Kinetic Energy is:", JOptionPane.INFORMATION_MESSAGE);
            }


        });
        myFrame.setLayout(new GridLayout(3,1));
        myFrame.setSize(150,200);
        myFrame.setVisible(true);
    }

//  Second solution box

    public void drawPotentialEnergy(){
        Physics phy = new Physics();
        myFrame.add(enterMass);
        myFrame.add(enterHeight);
        myFrame.add(calculatePotentialEnergy);
        calculatePotentialEnergy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                This is the variable to solve all the stuff
                float potEnergy = (float) phy.potentialEnergy(Float.parseFloat(enterMass.getText()),
                        Float.parseFloat(enterHeight.getText()));
//                This prints the solution in a neat box
                JOptionPane.showMessageDialog(null, potEnergy,
                        "The Potential Energy is:", JOptionPane.INFORMATION_MESSAGE);
            }


        });
        myFrame.setLayout(new GridLayout(3,1));
        myFrame.setSize(150,200);
        myFrame.setVisible(true);
    }

}
