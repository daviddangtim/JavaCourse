package com.company;

public class Geometry extends Math {



    float areaOfSquare (int length){
        return powerOfTwo(length);

    }

    float areaOfTriangle (float length, float breadth){

        return divide(1,2) * multiply(length,breadth);
    }

    float areaOfCircle (float radius){
        return 2 * multiply(getPI(),powerOfTwo((int)radius));
    }

}
