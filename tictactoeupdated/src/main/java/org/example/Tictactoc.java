package org.example;

import org.abstractica.javacsg.Geometry3D;
import org.abstractica.javacsg.JavaCSG;

import java.util.ArrayList;
import java.util.List;

public class Tictactoc {
    private final JavaCSG csg;
    private final double lineWidth=3.0;
    private final double squareSize=15.0;
    private final double tolerance=0.4;
    private final double height=3.0;
    private final int angularResulotion=64;

    private final double move=0.0;


    public Tictactoc(JavaCSG csg){
        this.csg=csg;

    }

    public Geometry3D cross(){

        Geometry3D x1 = csg.box3D(2*squareSize, lineWidth, height, false);
        Geometry3D x2 = csg.box3D(lineWidth, 2*squareSize, height, false);
        //Geometry3D x3 = csg.union3D(x1,x2);
        //csg.view(x3);

        return csg.union3D(x1,x2);
    }

    public Geometry3D circle(){

        Geometry3D circle=csg.cylinder3D(squareSize-tolerance,height,angularResulotion,false);
        Geometry3D hole=csg.cylinder3D(squareSize-tolerance-lineWidth,height,angularResulotion,false);

        return csg.difference3D(circle,hole);
    }
    public Geometry3D board(){

       /* List<Geometry3D> parts=new ArrayList<>();
        double beamlength=3*squareSize+4*lineWidth;

        Geometry3D hbeam=csg.box3D(beamlength,lineWidth,height,false);
        hbeam=csg.translate3D(0.5*beamlength,0.5*lineWidth,0).transform(hbeam);

        for(int i=0;i<4;i++) {
            parts.add(csg.translate3DY(i * (squareSize + lineWidth)).transform(hbeam));

        }

        Geometry3D vbeam=csg.box3D(beamlength,lineWidth,height,false);
        vbeam=csg.translate3D(0.5*beamlength,0.5*lineWidth,0).transform(vbeam);

        for(int j=0;j<4;j++) {
            parts.add(csg.translate3DX(j * (squareSize + lineWidth)).transform(vbeam));
        }
        */

        Geometry3D firstbox  = csg.box3D(2*squareSize, lineWidth-1.5, height, false);
        Geometry3D firstbox2 = csg.box3D(2*squareSize, lineWidth-1.5, height, false);
        Geometry3D firstbox3 = csg.box3D(2*squareSize, lineWidth-1.5, height, false);
        Geometry3D firstbox4 = csg.box3D(2*squareSize, lineWidth-1.5, height, false);
        Geometry3D firstbox5 = csg.box3D(2*squareSize, lineWidth-1.5, height, false);
        Geometry3D firstbox6 = csg.box3D(2*squareSize, lineWidth-1.5, height, false);
        Geometry3D firstbox7 = csg.box3D(2*squareSize, lineWidth-1.5, height, false);
        Geometry3D firstbox8 = csg.box3D(2*squareSize, lineWidth-1.5, height, false);

        Geometry3D movefirstside = csg.translate3D(move, 1.5*lineWidth, move).transform(firstbox);
        Geometry3D movesecondside = csg.translate3D(move, -1-lineWidth*1.5, move).transform(firstbox2);

        Geometry3D rotateside1 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox3);
        Geometry3D movethirdside = csg.translate3D(1.5*lineWidth, move, move).transform(rotateside1);

        Geometry3D rotateside2 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox4);
        Geometry3D movefourthside = csg.translate3D(-1- lineWidth*1.5, move, move).transform(rotateside2);

        //Geometry3D rotateside3 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox5);
        //Geometry3D movefifthside = csg.translate3D(19.83, 0, 0).transform(rotateside3);

      //  Geometry3D rotateside4 = csg.rotate3DZ(csg.degrees(90)).transform(firstbox6);
      //  Geometry3D movesixth = csg.translate3D(-19.83, 0, 0).transform(rotateside4);

       // Geometry3D moveseventhside = csg.translate3D(0, 20, 0).transform(firstbox7);
        //Geometry3D moveeighthside = csg.translate3D(0, -20, 0).transform(firstbox8);

        //Geometry3D shape = csg.union3D(movefirstside, movesecondside, movethirdside, movefourthside, movefifthside, movesixth, moveseventhside, moveeighthside);

        return csg.union3D(movefirstside, movesecondside, movethirdside,movefourthside);
    }

}
