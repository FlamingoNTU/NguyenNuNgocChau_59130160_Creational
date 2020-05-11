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

    public Triangle() {
        System.out.println("Các dụng cụ để vẽ hình tam giác: \n");
    }
    
    @Override
    public String draw() {
        brush = "- Bút chì vẽ loại 1" + "\n";
        paper = "- Giấy A4" + "\n";
        frame = "- Khung vẽ cỡ lớn" + "\n";
        return brush + paper + frame;
    }          
    
}
