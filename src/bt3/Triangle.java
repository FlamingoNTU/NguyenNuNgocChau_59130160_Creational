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
public class Triangle extends Shape{
    
    private static Triangle instance;
        
    public static Triangle createInstance(){
        if(instance == null){
            instance = new Triangle();
        }
        return instance;
    }
    
    public Triangle() {
    }
    
    @Override
    public String draw() {
        brush = "trải";
        paper = "giấy";
        frame = "vào khung";
        return this.getBrush() + this.getPaper() + this.getFrame() + "hình tam giác";
    }              
}
