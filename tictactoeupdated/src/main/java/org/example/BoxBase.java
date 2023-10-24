package org.example;

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;

public class BoxBase {

    JavaCSG csg = JavaCSGFactory.createNoCaching();

    //Geometry2D box=csg.box3D(12,12,12,false);
    void viewbase() {
        //Geometry3D box       = csg.box3D(120, 120, 1, false);
        Geometry3D firstbox  = csg.box3D(40, 1, 4, false);
        Geometry3D firstbox2 = csg.box3D(40, 1, 4, false);
        Geometry3D firstbox3 = csg.box3D(40, 1, 4, false);
        Geometry3D firstbox4 = csg.box3D(40, 1, 4, false);
        Geometry3D firstbox5 = csg.box3D(40, 1, 4, false);
        Geometry3D firstbox6 = csg.box3D(40, 1, 4, false);
        Geometry3D firstbox7 = csg.box3D(40, 1, 4, false);
        Geometry3D firstbox8 = csg.box3D(40, 1, 4, false);

        Geometry3D movefirstside = csg.translate3D(0, 6.66, 0).transform(firstbox);
        Geometry3D movesecondside = csg.translate3D(0, -6.66, 0).transform(firstbox2);

        Geometry3D rotateside1 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox3);
        Geometry3D movethirdside = csg.translate3D(6.66, 0, 0).transform(rotateside1);

        Geometry3D rotateside2 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox4);
        Geometry3D movefourthside = csg.translate3D(- 6.66, 0, 0).transform(rotateside2);

        Geometry3D rotateside3 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox5);
        Geometry3D movefifthside = csg.translate3D(19.83, 0, 0).transform(rotateside3);

        Geometry3D rotateside4 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox6);
        Geometry3D movesixth = csg.translate3D(-19.83, 0, 0).transform(rotateside4);

        Geometry3D moveseventhside = csg.translate3D(0, 20, 0).transform(firstbox7);
        Geometry3D moveeighthside = csg.translate3D(0, -20, 0).transform(firstbox8);

        Geometry3D shape = csg.union3D(movefirstside, movesecondside, movethirdside, movefourthside, movefifthside, movesixth, moveseventhside, moveeighthside);
        csg.view(shape);
    }
}


