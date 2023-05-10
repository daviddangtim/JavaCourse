package com.company;

import com.company.ui.GeometryUI;
import com.company.ui.PhysicsUi;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        GeometryUI geoUi = new GeometryUI();
        geoUi.mainUI();
        PhysicsUi phyUi = new PhysicsUi();
        phyUi.mainUi();


}
}


