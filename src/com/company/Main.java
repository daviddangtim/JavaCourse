package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
//        Instantiation
       Physics physicsInstance = new Physics();

//       User Choice Input Reading
        System.out.println("Please input a number:\n 1 for Kinetic Energy\n 2 for Potential Energy,\n 3 for Momentum, \n 4 for Acceleration, \n 5 for Density");
        Scanner operationInput = new Scanner(System.in);
        byte operationSelector = operationInput.nextByte();

//        Kinetic Energy
        if (operationSelector == 1){
        try{
            System.out.println("Input the mass");
            Scanner massInput = new Scanner(System.in);
            float mass = massInput.nextFloat();

            System.out.println("Input the velocity");
            Scanner velocityInput = new Scanner(System.in);
            float velocity = velocityInput.nextFloat();

            System.out.println(physicsInstance.kineticEnergy(mass,velocity));

        } catch (InputMismatchException im){
            System.out.println(im);

        }
//        Potential Energy
        } else if (operationSelector == 2){
            try{
                System.out.println("Input the mass");
                Scanner massInput = new Scanner(System.in);
                float mass = massInput.nextFloat();

                System.out.println("Input the height");
                Scanner heightInput = new Scanner(System.in);
                float height = heightInput.nextFloat();

                System.out.println(physicsInstance.potentialEnergy(mass,height));


            } catch (InputMismatchException im){
                System.out.println(im);

            }
//            Momentum
        } else if (operationSelector == 3){
            try{
                System.out.println("Input the momentum ");
                Scanner massInput = new Scanner(System.in);
                float mass =  massInput.nextFloat();

                System.out.println("Input the velocity");
                Scanner velocityInput = new Scanner(System.in);
                float velocity = velocityInput.nextFloat();

                System.out.println(physicsInstance.momentum(mass,velocity));
            } catch (InputMismatchException im){
                System.out.println(im);

            }
//            Acceleration
        } else if(operationSelector == 4){
            try{
                System.out.println("Input the velocity");
                Scanner velocityInput = new Scanner(System.in);
                float velocity = velocityInput.nextFloat();

                System.out.println("Input the time");
                Scanner timeInput = new Scanner(System.in);
                float time = timeInput.nextFloat();

                System.out.println("The Acceleration is:");
                System.out.println(physicsInstance.acceleration(velocity,time));
            } catch(InputMismatchException im){
                System.out.println(im);
            }
//            Density
        } else if(operationSelector == 5) {
            try{
                System.out.println("Input the mass");
                Scanner massInput = new Scanner(System.in);
               float mass = massInput.nextFloat();

                System.out.println("Input the volume");
                Scanner volumeInput = new Scanner(System.in);
                float volume = volumeInput.nextFloat();

                System.out.println("The Density is:");
                System.out.println(physicsInstance.density(mass,volume));
            } catch (InputMismatchException im){
                System.out.println(im);
            }

        }

    }
//


}


