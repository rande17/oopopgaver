/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopopgaver;

import java.text.DecimalFormat;

/**
 *
 * @author clutt
 */
public class NineOne {
    public void run(){
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        Rectangle rect1 = new Rectangle(4,40);
        System.out.println("Rect1:\nwidth: " + df.format(rect1.width) + "\theight: " + df.format(rect1.height) + "\tarea: "+df.format(rect1.getArea()) + "\tPerimeter: "+ df.format(rect1.getPerimeter()));
        Rectangle rect2 = new Rectangle(3.5,35.9);
        System.out.println("Rect2:\nwidth: " + df.format(rect2.width) + "\theight: " + df.format(rect2.height) + "\tarea: "+df.format(rect2.getArea()) + "\tPerimeter: "+ df.format(rect2.getPerimeter()));
        }
}
