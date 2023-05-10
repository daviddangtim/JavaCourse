package com.company;

public class Geometry extends Math {
     public Geometry(){

        System.out.println("Constructor called");
    }


    public float areaOfSquare (int length){
        return powerOfTwo(length);

    }

    float areaOfTriangle (float length, float breadth){

        return divide(1,2) * multiply(length,breadth);
    }

    float areaOfCircle (float radius){

        return 2 * multiply(getPI(),powerOfTwo((int)radius));
    }



    public float areaOfRectangle(float parseFloat, float length, float breadth) {
        return multiply(length,breadth);
    }
}
