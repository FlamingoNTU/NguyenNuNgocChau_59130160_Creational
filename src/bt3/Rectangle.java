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
public class Rectangle extends Shape{

    public Rectangle() {
        System.out.println("Các dụng cụ để vẽ hình chữ nhật: \n");
    }
    
    @Override
    public String draw() {
        brush = "- Bút chì vẽ loại 3" + "\n";
        paper = "- Giấy A2" + "\n";
        frame = "- Khung vẽ cỡ nhỏ" + "\n";
        return brush + paper + frame;
    }        
}
