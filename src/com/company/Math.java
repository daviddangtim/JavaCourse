package com.company;

public class Math {
   private float PI = 22/7;
    float powerOfTwo(int number){

        return number^2;
    }
      float multiply(float numberOne, float numberTwo){

        return numberOne * numberTwo;
    }
    float divide( float numberOne, float numberTwo){

        return numberOne / numberTwo;
    }
    float add (float numberOne, float numberTwo){
        return numberOne + numberTwo;
    }
    float subtract (float numberOne, float numberTwo){
        return numberOne - numberTwo;
    }
//      Getter and Setter
    public float getPI() {
        return PI;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }
}
