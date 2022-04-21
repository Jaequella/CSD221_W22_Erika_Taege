/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Erika_Taege_test4_practical;

/**
 *
 * @author Jaequella
 */
public interface ShapeInterface {
//Shape interface
    public abstract class Shape {
    private String id;
    public Shape (String id)
    {this.id = id;}
    public abstract double getArea();

    public String getId()
    {return id;}
    
    public String toString( ){
        String Area = "area="+getArea();
        return Area;
    }
  }
    
    //Square
    public class Square extends Shape {
    public Square (String name, double w, double h)
    { 
      super(name);
      width  = w;
      height = h;
    }
    
    public double getArea(){
    return width*height;
    }
    
    public double getWidth(){
    return width;
    }
    
    public double getHeight(){
    return height;
    }
    
    public void setWidthHeight(double newWidth, double newHeight)
    {
      width  = newWidth;
      height = newHeight;
    }
    private double width, height;
  }
    
    //triangle
    public class Triangle extends Shape {
    public Triangle (String name, double b, double h)
    { 
      super(name);
      base  = b;
      height = h;
    }
    
   public double getArea(){
    return (base*height)/2;
    }
    
    public double getBase(){
    return base;
    }
    
    public double getHeight(){
    return height;
    }
    
    public void setWidthHeight(double newBase, double newHeight)
    {
      base  = newBase;
      height = newHeight;
    }
    private double base, height;
  }
}
