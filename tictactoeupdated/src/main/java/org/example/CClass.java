package org.example;

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class CClass {
    JavaCSG csg = JavaCSGFactory.createNoCaching();

    public void viewCircle(){
        Geometry3D cir = csg.cylinder3D(10,3.33,128,false);
        Geometry3D cir2 = csg.cylinder3D(6.66,3.33,128,false);

        Geometry3D circle = csg.difference3D(cir, cir2);
        csg.view(circle);

    }
}
