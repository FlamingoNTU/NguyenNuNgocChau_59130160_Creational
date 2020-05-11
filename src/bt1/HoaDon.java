/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {
    HoaDonHeader hdHeader = new HoaDonHeader();
    ArrayList<CTHD> cthd = new ArrayList<>();

    protected HoaDon(Builder builder){
        this.hdHeader = builder.hdHeader;
        this.cthd = builder.cthd;                
    }

    public String xuatCTHD(){
        String str = "";
            for(int i = 0; i < cthd.size(); i++){
                str +=  "- Tên sản phẩm: " + cthd.get(i).getTenSP() + "\n" +
                        "- Số lượng: " + cthd.get(i).getSoLuong() + "\t" + "||" + "\t" +
                        "Đơn giá: " + cthd.get(i).getDonGia() + "\t" + "||" + "\t" + 
                        "Chiết khấu: " + cthd.get(i).getChietKhau() + "\n";
            }
        return str;
        }    
        
    @Override
    public String toString() {
        return "THÔNG TIN CHI TIẾT ĐƠN HÀNG " + "\n" + 
               "- Mã hóa đơn: " + hdHeader.getMaHD() + "\n" + 
               "- Tên khách hàng: " + hdHeader.getTenKH() + "\n" +
               "- Ngày bán: " + hdHeader.getNgayBan() + "\n" + xuatCTHD();
    }
    
    public static class Builder{
        HoaDonHeader hdHeader = new HoaDonHeader();
        ArrayList<CTHD> cthd = new ArrayList<>();

        public Builder() {
        }        

        public HoaDonHeader getHdHeader() {
            return hdHeader;
        }

        public void setHdHeader(HoaDonHeader hdHeader) {
            this.hdHeader = hdHeader;
        }                   

        public Builder addmaHD(String maHD){
            this.hdHeader.maHD = maHD;
            return this;            
        }
        
        public Builder addtenKH(String tenKH){
            this.hdHeader.tenKH = tenKH;
            return this;            
        }
        
        public Builder addngayBan(Date ngayBan){
            this.hdHeader.ngayBan = ngayBan;
            return this;            
        }
        
        public Builder addsanPham(CTHD sp){
            cthd.add(sp);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
        
    } 
}
