package org.example;

import org.abstractica.javacsg.JavaCSG;
import org.abstractica.javacsg.JavaCSGFactory;
import javax.swing.*;
import java.lang.reflect.GenericArrayType;

public class Main {

    public static void main(String[] args) {

        JavaCSG csg = JavaCSGFactory.createNoCaching();

      /*  BoxBase boxBase=new BoxBase();
        boxBase.viewbase();

        Xclass xclass=new Xclass();
        xclass.viewbox();

        CClass cClass=new CClass();
        cClass.viewCircle();*/

        Tictactoc ttt=new Tictactoc(csg);

        csg.view(ttt.board());
        //ttt.board();
       // ttt.circle(csg.view());
        //ttt.cross();
       // csg.view(ttt.cross());
    }
}