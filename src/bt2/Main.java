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
        MyStringBuilder string = new MyStringBuilder.Builder()
                .addString("Kiểm tra tính đúng, sai của biểu thức so sánh dưới đây: \n")
                .addFloat((float) 3.5)
                .addString(" >= ")
                .addFloat((float) 7.0)
                .addString("\nKết quả là: ")
                .addBool(Boolean.FALSE)
                .build();
        System.out.println(string.toString());
    }
}
