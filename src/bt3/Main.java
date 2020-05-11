/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        ShapeFactory shapefac1 = ShapeFactory.createInstance();        
        
        Shape shape1 = shapefac1.createShape(ShapeType.Triangle);
        System.out.println(shape1.draw());
        
        Shape shape2 = shapefac1.createShape(ShapeType.Circle);                
        System.out.println(shape2.draw());
        
        Shape shape3 = shapefac1.createShape(ShapeType.Rectangle);
        System.out.println(shape3.draw());                
    }
}
