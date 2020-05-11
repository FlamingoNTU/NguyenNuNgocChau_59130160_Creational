/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        CTHD sp1 = new CTHD("Trà sữa", 10, 10000, (float) 1.2);
        CTHD sp2 = new CTHD("Bánh tráng trộn", 20, 15000, (float) 0.8);
        CTHD sp3 = new CTHD("Gà rán", 5, 50000, (float) 1.1);
        
        HoaDon hd1 = new HoaDon.Builder()
                .addmaHD("HD001")
                .addtenKH("Nguyễn Nữ Ngọc Châu")
                .addngayBan(new SimpleDateFormat("dd/MM/yy").parse("23/02/2020"))
                .addsanPham(sp1)
                .addsanPham(sp2)
                .addsanPham(sp3)
                .build();
        System.out.println(hd1.toString());
    }
    
}
