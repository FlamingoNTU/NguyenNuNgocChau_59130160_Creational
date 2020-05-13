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
        ShapeFactory factory = new ShapeFactory();
        
        Shape rectangle1 = factory.createShape(ShapeType.Rectangle);
        rectangle1.setBrush("Trải");
        rectangle1.setPaper(" giấy");
        rectangle1.setFrame(" vào khung ");
        System.out.println(rectangle1.draw());
        
        Shape rectangle2 = factory.createShape(ShapeType.Rectangle);
        rectangle2.setBrush("Trải");
        rectangle2.setPaper(" giấy");
        rectangle2.setFrame(" vào khung ");
        System.out.println(rectangle1.draw());
        System.out.println(rectangle2.draw());
        System.out.println("-------------------------------------");

        Shape triangle1 = factory.createShape(ShapeType.Triangle);
        triangle1.setBrush("Trải");
        triangle1.setPaper(" giấy");
        triangle1.setFrame(" vào khung ");
        System.out.println(triangle1.draw());
        
        Shape triangle2 = factory.createShape(ShapeType.Triangle);
        triangle2.setBrush("Trải");
        triangle2.setPaper(" giấy");
        triangle2.setFrame(" vào khung ");
        System.out.println(triangle1.draw());
        System.out.println(triangle2.draw());
        System.out.println("-------------------------------------");
        
        Shape circle1 = factory.createShape(ShapeType.Circle);
        circle1.setBrush("Trải");
        circle1.setPaper(" giấy");
        circle1.setFrame(" vào khung ");
        System.out.println(circle1.draw());
        
        Shape circle2 = factory.createShape(ShapeType.Circle);
        circle2.setBrush("Trải");
        circle2.setPaper(" giấy");
        circle2.setFrame(" vào khung ");
        System.out.println(circle1.draw());
        System.out.println(circle2.draw());
    }
}
