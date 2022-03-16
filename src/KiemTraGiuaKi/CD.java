package KiemTraGiuaKi;

import java.security.AlgorithmConstraints;
import java.security.PublicKey;

public class CD {
    private int maCD;
    private String tuaCD;
    private String tenCaSy;
    private int soBH;
    private float giaThanh;

    public CD() {

    }

    public CD(int maCD, String tuaCD, String tenCaSy, int soNH, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.tenCaSy = tenCaSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD(String tuaCD) {
        return tuaCD = tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getTenCaSy() {
        return tenCaSy;
    }

    public void setTenCasy(String tenCaSy) {
        this.tenCaSy = tenCaSy;
    }

    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "Album {" + "maCD=" + maCD + ", tuaCD='" + tuaCD + ", tenCaSy='" + tenCaSy + ", soBH=" + soBH
                + ", giaThanh=" + giaThanh + "}";
    }

    public void hienThiCD() {
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n", maCD, tuaCD, tenCaSy, soBH, giaThanh);

    }
}