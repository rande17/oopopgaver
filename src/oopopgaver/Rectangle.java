/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopopgaver;


/**
 *
 * @author clutt
 */
public class Rectangle {
    double width = 1, height = 1;
    
    
    Rectangle(){
        
    }
    
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    double getArea(){
        double area = width*height;
        return area;
    }
    
    double getPerimeter(){
        double perimeter = (2*width)+(2*height);
        return perimeter;
    }
    
}