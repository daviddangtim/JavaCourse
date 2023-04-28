package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
       Geometry geometryInstance = new Geometry();
//       User input Reading
        Scanner  lengthInput = new Scanner(System.in);
        Scanner breadthInput = new Scanner(System.in);
//        Exception Handling block
    try {
        System.out.println("Input your length");
        float length = lengthInput.nextFloat();

        System.out.println("Input your breadth");
        float breadth = breadthInput.nextFloat();


        System.out.println(geometryInstance.areaOfTriangle(length,breadth));

    }
    catch (InputMismatchException im){
//        System.out.println("Input a valid number.");
        System.out.println(im);

    }
        catch (Exception e){

        System.out.println("ERROR");



    }



    }
}


