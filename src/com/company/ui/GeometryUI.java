package com.company.ui;

import com.company.Geometry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometryUI {
//    Frame
    JFrame myFrame = new JFrame("Geometry");

//    Create Buttons
    JButton areaOfSquare = new JButton("Area of Square");
    JButton areaOfTriangle = new JButton("Area of Triangle");
    JButton areaOfRectangle = new JButton("Area of Rectangle");

//    method to add buttons to frame
    public void mainUI(){
        myFrame.add(areaOfRectangle);
        myFrame.add(areaOfSquare);
        myFrame.add(areaOfTriangle);

//        frame size setting
        myFrame.setSize(150,200);

//        frame layout setting
        myFrame.setLayout(new GridLayout(3,1));

//        frame visibility setting
        myFrame.setVisible(true);

        areaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculate area of Square");
                JFrame areaOfSquare = new JFrame("Area of Square");
               drawAreaOfSquare();


            }


        });
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    JTextField enterLengthOfSquare = new JTextField("Enter Length");
    JButton calculateAreaOfSquare = new JButton("Calculate");

//
    public void drawAreaOfSquare(){
        Geometry geo = new Geometry();
        myFrame.add(enterLengthOfSquare);
        myFrame.add(calculateAreaOfSquare);
        calculateAreaOfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float area = geo.areaOfSquare((int)
                        Float.parseFloat(enterLengthOfSquare.getText())) ;
                JOptionPane.showMessageDialog(null,area , "Area is:", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        myFrame.setLayout(new GridLayout(2,1));
        myFrame.setSize(150,200);
        myFrame.setVisible(true);
    }
}
