package org.example;

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class Xclass {
    JavaCSG csg = JavaCSGFactory.createNoCaching();

    public void viewbox(){
        Geometry3D x1 = csg.box3D(10, 3.33, 3.33, false);
        Geometry3D x2 = csg.box3D(3.33, 10, 3.33, false);
        Geometry3D x3 = csg.union3D(x1,x2);
        csg.view(x3);

    }

}
