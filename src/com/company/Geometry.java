package com.company;

public class Geometry extends Math {

    void accessPI(){
        System.out.println(getPI());
        setPI(34);
        System.out.println(getPI());
    }

    float areaOfSquare (int length){
        return powerOfTwo(length);

    }
    float areaOfTriangle (float length, float breadth){
        return divide(1,2) * multiply(length,breadth);
    }


}
