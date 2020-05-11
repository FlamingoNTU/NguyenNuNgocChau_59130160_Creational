/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        MyStringBuilder myString = new MyStringBuilder.StringBuilder()
                .addString("Kiểm tra kết quả xét tuyển vào Đại học Nha Trang với số điểm: ")
                .addFloat((float) 18.5)
                .addString(" Kết quả: ")
                .addBool(Boolean.FALSE)
                .build();
        System.out.println(myString.toString());
    }
}
