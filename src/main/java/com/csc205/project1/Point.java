package com.csc205.project1;


import java.lang.Math;
public class Point {
    double x;
    double y;

    public Point() {
    x = 0;
    y = 0;

    }

    //this.x = x;
    //this.y = y;
    public Point(double x, double y) {
    this.x = x;
    this.y = y;
    }

    // d = sqrt (x2 - x1)^2 + (y2 - y1)^2
    public  double distance(Point p2) {
        double r = Math.sqrt( Math.pow((x - p2.getX()),2)+Math.pow((y - p2.getY()),2));
            return r;
    }
    // returns x
    double getX()
    {

        return x;
    }
//sets x
    public void setX(double x)
    {

        x = x;
    }
    //returns y
    double getY()
    {

        return y;
    }
    // sets y
    public void setY(double y)
    {

        y = y;
    }


    //sets point
    public void setPoint(double x, double y )
    {
        this.x = x;
        this.y = y;


    }
    //set x to equal shift x = x + n
    public void shiftX(double n)
    {

        x += n;
    }
    //set y to y = y + n;
    public void shiftY(double n)
    {

        y += n;
    }

    public void rotate(double angle)
    {
        x = (x*(Math.cos(angle)))-(y*(Math.sin(angle)));
         y = (x*(Math.sin(angle)))+(y*(Math.cos(angle)));



    }
    //to string method
    @Override
    public String toString()
    {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}

