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
public class ShapeFactory {
    public static ShapeFactory instance;
    
    public static ShapeFactory createInstance(){
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case Rectangle: return new Rectangle();
            case Triangle: return new Triangle();
            case Circle: return new Circle();
        }
        return null;
     }
}


