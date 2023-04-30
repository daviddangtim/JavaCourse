package com.company;

public class Physics extends Math{
    private double GRAVITY = 10.0 ;

    public double getGRAVITY() {
        return GRAVITY;
    }

    public void setGRAVITY(double GRAVITY) {
        this.GRAVITY = GRAVITY;
    }

    public double kineticEnergy(float mass, float velocity){
        return divide(1,2) * multiply(mass,powerOfTwo((int)velocity));
    }

    public double potentialEnergy(float mass, float height){

        return multiply(mass, height) * getGRAVITY();
    }

    public double momentum(float mass, float velocity){

        return multiply(mass,velocity);
    }

    public double acceleration(float velocity, float time){
        return  divide(velocity,time);
    }

    public double density(float mass, float volume){
        return divide(mass,volume);
    }


}
