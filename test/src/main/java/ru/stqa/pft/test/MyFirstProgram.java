package ru.stqa.pft.test;

import org.w3c.dom.css.Rect;

public class MyFirstProgram {

    public static void  main(String args[]) {

        Square s = new Square(5);
        System.out.println("Area of a square with a side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Area of a rectangle with sides " + r.a + " & " + r.b + " = " + r.area());

    }
}
