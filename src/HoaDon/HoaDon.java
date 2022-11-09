/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDon;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class HoaDon {
    private String maHD;
    private String hotenchuho;
    private String canho;
    private Date time;
    private String trangthai;

    public HoaDon() {
    }

    public HoaDon(String maHD, String hotenchuho, String canho, Date time, String trangthai) {
        this.maHD = maHD;
        this.hotenchuho = hotenchuho;
        this.canho = canho;
        this.time = time;
        this.trangthai = trangthai;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getHotenchuho() {
        return hotenchuho;
    }

    public void setHotenchuho(String hotenchuho) {
        this.hotenchuho = hotenchuho;
    }

    public String getCanho() {
        return canho;
    }

    public void setCanho(String canho) {
        this.canho = canho;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", hotenchuho=" + hotenchuho + ", canho=" + canho + ", time=" + time + ", trangthai=" + trangthai + '}';
    }
    
    
}
