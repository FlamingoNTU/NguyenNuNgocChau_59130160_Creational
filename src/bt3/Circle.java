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
public class Circle extends Shape{

    public Circle() {
        System.out.println("Các dụng cụ để vẽ hình tròn: \n");
    }
    
    @Override
    public String draw() {
        brush = "- Bút chì vẽ loại 2" + "\n";
        paper = "- Giấy A3" + "\n";
        frame = "- Khung vẽ cỡ trung bình" + "\n";
        return brush + paper + frame;
    }         
    
}
